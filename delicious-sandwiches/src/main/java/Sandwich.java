import com.pluralsight.deli.BreadType;
import com.pluralsight.deli.SandwichSize;

public class Sandwich {

    //Instance Variables
    private BreadType bread;
    private SandwichSize size;
    private String topping;
    private boolean isToasted;

    // Constructor
    public Sandwich(BreadType bread, SandwichSize size, String topping, boolean isToasted) {
        this.bread = bread;
        this.size = size;
        this.topping = topping;
        this.isToasted = isToasted;
    }


    // Getters and Setters
    public BreadType getBread() {
        return bread;
    }

    public void setBread(BreadType bread) {
        this.bread = bread;
    }

    public SandwichSize getSize() {
        return size;
    }

    public void setSize(SandwichSize size) {
        this.size = size;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }



    }



