/**
 * Created by alex on 18.06.2015.
 *
 */

public class CaliforniaPizzaIngredientsFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new VeryThinCrustDough();
    }

    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    public Cheese createCheese() {
        return new GoatCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper(), new Spinach(), new EggPlant(), new BlackOlives() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new Calamari();
    }
}
