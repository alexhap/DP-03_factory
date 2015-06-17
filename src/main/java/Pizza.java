/**
 * Created by alex on 17.06.2015.
 *
 */

public class Pizza {
    public void prepare() { }
    public void bake() { }
    public void cut() { }
    public void box() {
        System.out.printf("boxed: %s - %s\n", this.getClass().getSuperclass().getName(), this.getClass().getName());
    }
}
