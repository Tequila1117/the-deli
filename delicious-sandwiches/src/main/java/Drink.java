import com.pluralsight.deli.DrinkSize;
import com.pluralsight.deli.DrinkType;

import java.util.List;

public class Drink {

    private DrinkSize size;
    private DrinkType type;

    //Constructor to initialize the size and drink type array
    public Drink(DrinkSize size, DrinkType type) {
        this.type = type;
        this.size = size;
    }

    // Method to print a drink
    @Override
    public String toString() {
        return "Drink{" + "Size =" + size + ", Type =" + type + '}';
    }


    // Getter and setters for drink type and size


    public DrinkType getType() {
        return type;
    }

    public void setType(DrinkType type) {
        this.type = type;
    }

    public DrinkSize getSize() {
        return size;
    }

    public void setSize(DrinkSize size) {
        this.size = size;
    }
}