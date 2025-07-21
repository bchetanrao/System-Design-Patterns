package pizza_shop.components;

import pizza_shop.interfaces.Pizza;

public class BasicPizza implements Pizza {
    public BasicPizza() {}

    @Override
    public String getDescription() {
        return "Margherita";
    }
    @Override
    public double getCost() {
        return 5.00;
    }
}
