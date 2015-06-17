/**
 * Created by alex on 17.06.2015.
 *
 */

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) return new ChicagoCheesePizza();
        if (type.equals("pepperoni")) return new ChicagoPepperoniPizza();
        else return null;
    }
}
