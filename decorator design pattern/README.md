# Decorator Design Pattern

The **Decorator Design Pattern** is a structural pattern that allows you to dynamically add behavior or responsibilities to objects without modifying their code. It promotes flexible code by using composition instead of inheritance.

## Structure

```mermaid
classDiagram
    class Pizza {
        +getDescription()
        +getCost()
    }
    class BasicPizza
    class PizzaDecorator
    class CheeseDecorator
    class OlivesDecorator
    class TomatoDecorator

    Pizza <|-- BasicPizza
    Pizza <|-- PizzaDecorator
    PizzaDecorator <|-- CheeseDecorator
    PizzaDecorator <|-- OlivesDecorator
    PizzaDecorator <|-- TomatoDecorator
    PizzaDecorator --> Pizza
```

## Example: Pizza Shop (Java)

In our Java implementation, we use the Decorator pattern to add toppings to a pizza:

- **Pizza**: The interface with `getDescription()` and `getCost()` methods.
- **BasicPizza**: The base pizza object, located in `pizza_shop/components/BasicPizza.java`.
- **PizzaDecorator**: Abstract class that implements `Pizza` and wraps another `Pizza` object (in `decorators/`).
- **CheeseDecorator / OlivesDecorator / TomatoDecorator**: Concrete decorators that add toppings and cost (in `decorators/`).

## How It Works

- The client starts with a base pizza object (`BasicPizza`).
- To add toppings, the client wraps the base pizza with decorator objects (`CheeseDecorator`, `TomatoDecorator`, `OlivesDecorator`), each adding its own behavior and cost.
- Each decorator holds a reference to a `Pizza` object and delegates calls to it, while adding its own description and cost.
- The final pizza object is a chain of decorators, each contributing to the overall description and cost.
- This approach allows dynamic addition of features (toppings) without modifying the base class or creating a large number of subclasses.

### Sequence

```mermaid
sequenceDiagram
    participant Client
    participant BasicPizza
    participant PizzaDecorator
    participant CheeseDecorator
    participant OlivesDecorator
    participant TomatoDecorator

    Client->>BasicPizza: getDescription(), getCost()
    Client->>CheeseDecorator: wraps BasicPizza
    Client->>TomatoDecorator: wraps CheeseDecorator
    Client->>OlivesDecorator: wraps TomatoDecorator
    OlivesDecorator->>TomatoDecorator: getDescription(), getCost()
    TomatoDecorator->>CheeseDecorator: getDescription(), getCost()
    CheeseDecorator->>BasicPizza: getDescription(), getCost()
    BasicPizza-->>CheeseDecorator: result
    CheeseDecorator-->>TomatoDecorator: result
    TomatoDecorator-->>OlivesDecorator: result
    OlivesDecorator-->>Client: decorated result
```

## Benefits

- Adds responsibilities (toppings) to objects dynamically.
- Promotes code reuse through composition.
- Avoids subclass explosion compared to inheritance.
