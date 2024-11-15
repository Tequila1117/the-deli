package com.pluralsight.deli;

public abstract class Item {

    // Instance variables
    private String name;
    private double price;

// Constructor

    public Item(String name, double price) {
        this.name = name;
        this.price = price;

    }

    // Getters and Setters


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }


    // Abstract method to calculate cost (overridden in subclasses)
    public abstract double calculateCost();

    // Override toString to display item details

    @Override
    public String toString() {
        return name + " - $" + price;


    }
}