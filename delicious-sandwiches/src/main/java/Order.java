import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Order {

    private List<Drink> drinks; // Array to store drink options, (instance variable: drinks)

    public void addDrink(Drink d) {
        drinks.add(d);


    }
    // Constructor
    public Order(){
        this.drinks = new ArrayList<>();

    }

}
