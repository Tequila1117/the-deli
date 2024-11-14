package com.pluralsight.deli;

public class Drink extends Item{

    private DrinkSize size;
    private DrinkType type;

    //Constructor to initialize the size and drink type array
    public Drink(DrinkSize size, DrinkType type, String name) {
        super(name, 0);
        this.type = type;
        this.size = size;
    }

   @Override
   public double calculateCost() {
       double price = 0;
     if (size == DrinkSize.SMALL) {
         price = 2.00;
   } else if (size == DrinkSize.MEDIUM) {
         price = 2.50;
     } else if (size == DrinkSize.LARGE) {
         price = 3.00;
     }
     return price; }



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