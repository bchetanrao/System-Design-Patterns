package pizza_shop;

import pizza_shop.interfaces.Pizza;

public class BasicPizza implements Pizza {
    
    public BasicPizza() {
    }

    @Override
    public String getDescription() {
        return "Margherita"; // Basic pizza description
    }
    @Override
    public double getCost() {
        return 5.00; // Base cost of the basic pizza
    }
}
