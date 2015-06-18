/**
 * Created by alex on 17.06.2015.
 *
 */

import java.util.*;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);

    public static void main(String args[]) {

        List<PizzaStore> lst = new ArrayList<PizzaStore>();
        lst.add(new NYPizzaStore());
        lst.add(new CaliforniaPizzaStore());
        lst.add(new ChicagoPizzaStore());

        for (PizzaStore ps : lst) ps.orderPizza("pepperoni");
        for (PizzaStore ps : lst) ps.orderPizza("cheese");
        for (PizzaStore ps : lst) ps.orderPizza("clam");
        for (PizzaStore ps : lst) ps.orderPizza("veggie");

    }
}
