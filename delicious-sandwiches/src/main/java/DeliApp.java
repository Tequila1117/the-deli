public class DeliApp {
    public static void main(String[] args) {

        //Display premium toppings
        System.out.println("Premium Toppings:");
        Topping.displayToppings(Topping.PremiumToppings);

        // Display all regular toppings
        System.out.println("\nRegular Toppings:");
        Topping.displayToppings(Topping.RegularToppings);
    }
}
