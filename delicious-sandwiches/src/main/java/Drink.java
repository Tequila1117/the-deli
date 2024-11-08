import com.pluralsight.deli.DrinkSize;

import java.util.List;

public class Drink {

    private List<Drink> drinks; // Array to store drink options
    private DrinkSize size;

    //Constructor to initialize the size and drinks array
    public Drink(List<Drink> drinks, DrinkSize size) {
        this.drinks = drinks;
        this.size = size;
    }

    // Getter and setters for drinks and size
    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public DrinkSize getSize() {
        return size;
    }

    public void setSize(DrinkSize size) {
        this.size = size;
    }
}
