import java.util.ArrayList;
import java.util.List;

public class Hamburger {

    private final String bread;
    private final String meat;
    private final String cheese;
    private final List<String> ingredients;

    private Hamburger(HamburgerBuilder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.ingredients = builder.ingredients;
    }

    public String toString() {
        String description = "Bread: " + bread + "\nMeat: " + meat;
        if (cheese != null) { description += "\nCheese: " + cheese;}
        if (ingredients != null && !ingredients.isEmpty()) {
            description += "\nIngredients: " + String.join(", ", ingredients);
        }
        return description;
    }

    public static class HamburgerBuilder {

        private final String bread;
        private final String meat;
        private String cheese;
        private List<String> ingredients = new ArrayList<>();

        public HamburgerBuilder(String bread, String meat) {
            this.bread = bread;
            this.meat = meat;
        }

        public HamburgerBuilder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public HamburgerBuilder addIngredient(String ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Hamburger build() {
            return new Hamburger(this);
        }

    }
}