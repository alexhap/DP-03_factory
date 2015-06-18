/**
 * Created by alex on 17.06.2015.
 *
 */

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        name = "Chicago style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    public Pizza cut() {
        System.out.println("  Cutting the pizza into square slices.");
        return this;
    }
}
