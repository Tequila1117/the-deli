package com.pluralsight.deli;

public class Drink extends Item {

    private DrinkSize size;
    private DrinkType type;

    //Constructor to initialize the size and drink type array
    public Drink(DrinkSize size, DrinkType type, String name) {
        super(name, 0.0);
        this.type = type;
        this.size = size;
    }

    @Override
    public double calculateCost() {
        // Set the price based on size
        double price = 0.0;

        // Determine price based on size of the drink
        if (size == DrinkSize.SMALL) {
            price = 2.00;
        } else if (size == DrinkSize.MEDIUM) {
            price = 2.50;
        } else if (size == DrinkSize.LARGE) {
            price = 3.00;
        }

        setPrice(price);

        return price;
    }



}