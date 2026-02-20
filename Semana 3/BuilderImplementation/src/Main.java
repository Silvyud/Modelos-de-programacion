public class Main {

    public static void main(String[] args) {

        Hamburger original = new Hamburger.HamburgerBuilder("Integral", "Beef")
                .build();

        Hamburger premium = new Hamburger.HamburgerBuilder("Brioche", "Angus")
                .cheese("Doble Cheddar")
                .addIngredient("Bacon")
                .addIngredient("Caramelized Onions")
                .addIngredient("Pickles")
                .build();

        Hamburger classic = new Hamburger.HamburgerBuilder("With grains", "Chicken")
                .cheese("Mozzarella")
                .build();

        System.out.println("--- FAST FOOD DELIVERY ---");
        System.out.println("\nOrder 1: \n" + original);
        System.out.println("\nOrder 2: \n" + premium);
        System.out.println("\nOrder 3: \n" + classic);
    }
}