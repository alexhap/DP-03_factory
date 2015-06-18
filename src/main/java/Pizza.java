/**
 * Created by alex on 17.06.2015.
 *
 */
import java.util.*;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    //List<String> toppings = new ArrayList<String>();

    protected abstract void prepare();

    public void bake() {
        System.out.println("Baking for 20 minutes at 360.");
    }
    public void cut() {
        System.out.println("Cutting the pizza into eight diagonal slices.");
    }
    public void box() {
        System.out.printf("Placing pizza in official %s box.\n", this.getClass().getName());
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
