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
}


