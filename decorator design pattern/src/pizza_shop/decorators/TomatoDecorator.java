package pizza_shop.decorators;

import pizza_shop.interfaces.Pizza;

public class TomatoDecorator extends PizzaDecorator {

    public TomatoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Tomato";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 0.5; // Adding cost for tomato topping
    }
    
}