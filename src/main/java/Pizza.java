/**
 * Created by alex on 17.06.2015.
 *
 */
import java.util.*;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("Preparing '" + name + "'");
        System.out.println("  Tossing dough...");
        System.out.println("  Adding sauce...");
        if (!toppings.isEmpty()) {
            System.out.println("  Adding toppings:");
            for (String str : toppings)
                System.out.println("    + ".concat(str));
        }
    }
    public void bake() {
        System.out.println("  Baking for 20 minutes at 360.");
    }
    public void cut() {
        System.out.println("  Cutting the pizza into eight diagonal slices.");
    }
    public void box() {
        System.out.printf("  Placing pizza in official %s box.\n", this.getClass().getName());
    }
    public String getName() { return name; }

}
