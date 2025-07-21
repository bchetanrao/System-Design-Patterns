package pizza_shop.decorators;

import pizza_shop.interfaces.Pizza;

public class OlivesDecorator extends PizzaDecorator {

    public OlivesDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 0.75; // Adding cost for olives topping
    }
    
}
