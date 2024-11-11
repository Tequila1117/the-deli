import com.pluralsight.deli.ToppingType;



public class Topping {

    private String name; //Name of topping (declaration of data type String called name)
    private ToppingType type; // (Regular or Premium)

    // Constructor to initialize Topping with the name and type
    public Topping(String name, ToppingType type) {
        this.name = name;
        this.type = type;

    }
// Getter and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ToppingType getType() {
        return type;
    }

    public void setType(ToppingType type) {
        this.type = type;
    }

    // Override toString for better formatting of Topping Info
    @Override
    public String toString() {
        return name + " (" + type + ")";
    }


    // Array for Premium toppings
    public static Topping[] PremiumToppings = new Topping[]{
            new Topping("Steak", ToppingType.PREMIUM),
            new Topping("Ham", ToppingType.PREMIUM),
            new Topping("Salami", ToppingType.PREMIUM),
            new Topping("Roast Beef", ToppingType.PREMIUM),
            new Topping("Chicken", ToppingType.PREMIUM),
            new Topping("Bacon", ToppingType.PREMIUM),
            new Topping("American Cheese", ToppingType.PREMIUM),
            new Topping("Provolone Cheese", ToppingType.PREMIUM),
            new Topping("Cheddar Cheese", ToppingType.PREMIUM),
            new Topping("Swiss Cheese", ToppingType.PREMIUM)

    };
    // Array for Regular Toppings
    public static Topping[] RegularToppings = new Topping[]{
            new Topping("Lettuce", ToppingType.REGULAR),
            new Topping("Peppers", ToppingType.REGULAR),
            new Topping("Onions", ToppingType.REGULAR),
            new Topping("Tomatoes", ToppingType.REGULAR),
            new Topping("Jalapenos", ToppingType.REGULAR),
            new Topping("Cucumbers", ToppingType.REGULAR),
            new Topping("Pickles", ToppingType.REGULAR),
            new Topping("Guacamole", ToppingType.REGULAR),
            new Topping("Mushrooms", ToppingType.REGULAR)

    };

    // Method to display all toppings regardless of type
    public static void displayToppings(Topping[] toppings) {
        if (toppings != null) {
            for (Topping topping : toppings) {
                System.out.println(topping);
            }
        } else {
            System.out.println("No toppings available.");
        }
    }
}





