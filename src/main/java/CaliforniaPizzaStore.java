/**
 * Created by alex on 17.06.2015.
 *
 */

public class CaliforniaPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientsFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("California style Sauce and Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("California style Pepperoni Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("California style Clam Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("California style Veggie Pizza");
        }
        return pizza;
    }
}
