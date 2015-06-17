/**
 * Created by alex on 17.06.2015.
 *
 */

public class CaliforniaPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) return new CaliforniaCheesePizza();
        else if (type.equals("pepperoni")) return new CaliforniaPepperoniPizza();
        else return null;
    }

}
