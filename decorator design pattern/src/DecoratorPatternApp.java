import pizza_shop.components.BasicPizza;
import pizza_shop.decorators.CheeseDecorator;
import pizza_shop.decorators.OlivesDecorator;
import pizza_shop.decorators.TomatoDecorator;
import pizza_shop.interfaces.Pizza;

public class DecoratorPatternApp {
    public static void main(String[] args) throws Exception {
        BasicPizza basicPizza = new BasicPizza();
        System.out.println("Basic Pizza: " + basicPizza.getDescription() + " | Cost: " + basicPizza.getCost()); 

        // Adding individual decorators to the basic pizza
        OlivesDecorator olivesPizza = new OlivesDecorator(basicPizza);
        System.out.println("Basic Pizza With Olives: " + olivesPizza.getDescription() + " | Cost: " + olivesPizza.getCost());

        TomatoDecorator tomatoPizza = new TomatoDecorator(basicPizza);
        System.out.println("Basic Pizza With Tomato: " + tomatoPizza.getDescription() + " | Cost: " + tomatoPizza.getCost());

        CheeseDecorator cheesePizza = new CheeseDecorator(basicPizza);
        System.out.println("Basic Pizza With Cheese: " + cheesePizza.getDescription() + " | Cost: " + cheesePizza.getCost());

        // Adding multiple decorators together
        Pizza finalPizza = new OlivesDecorator(new TomatoDecorator(new CheeseDecorator(new BasicPizza())));
        System.out.println("\nFinal Pizza: " + finalPizza.getDescription() + " | Total Cost: " + finalPizza.getCost());
    }
}
