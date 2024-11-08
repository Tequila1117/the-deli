import com.pluralsight.deli.ToppingType;



public class Topping {
    private String name; //Name of topping
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
    public static Topping[] premiumToppings = new Topping[]{
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
}




