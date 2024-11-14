package com.pluralsight.deli;

import java.util.List;


public class Sandwich extends Item {

    private BreadType bread;
    private SandwichSize size;
    private List<Topping> toppings; // List to store multiple toppings
    private boolean isToasted;


    // Constructor to initialize the sandwich
    public Sandwich(BreadType bread, SandwichSize size, List<Topping> toppings, boolean isToasted, String name) {
        super(name, 0);
        this.bread = bread;
        this.size = size;
        this.toppings = toppings;
        this.isToasted = isToasted;
    }


    // Getters and Setters
    @Override
    public double calculateCost() {
        double price = 0;
        //Method to calculate sandwich price
        if (size == SandwichSize.SMALL) {
            price = 5.50;
        } else if (size == SandwichSize.MEDIUM) {
            price = 7.00;
        } else if (size == SandwichSize.LARGE) {
            price = 8.50;
        }


        return price;
    }


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

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    // Override toString to show sandwich details, including all the toppings
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(size).append(" sandwich on ").append(bread).append(" bread with ");

        // Add all selected toppings to the string
        if (toppings.isEmpty()) {
            sb.append("No Toppings");
        } else {
            for (Topping topping : toppings) {
                sb.append(topping.getName()).append(", ");
            }
            sb.setLength(sb.length() - 2); // Remove last comma
        }

        sb.append(isToasted ? " Toasted " : " Not toasted ");
        return sb.toString();
    }
}