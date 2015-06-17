/**
 * Created by alex on 17.06.2015.
 *
 */

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) return new NYCheesePizza();
        else if (type.equals("pepperoni")) return new NYPepperoniPizza();
        else if (type.equals("clam")) return new NYClamPizza();
        else return null;
    }
}
