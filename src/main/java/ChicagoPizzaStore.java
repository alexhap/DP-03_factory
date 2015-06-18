/**
 * Created by alex on 17.06.2015.
 *
 */

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago style Sauce and Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago style Pepperoni Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago style Clam Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago style Veggie Pizza");
        }
        return pizza;
    }
}

/*    public void cut() {
        System.out.println("  Cutting the pizza into square slices.");
    }*/
