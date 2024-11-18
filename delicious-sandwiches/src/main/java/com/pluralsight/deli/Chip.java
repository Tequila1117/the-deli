package com.pluralsight.deli;

public class Chip extends Item{

    // Instance variable
    private ChipType chipType;   // Type of chip (e.g., Lays, Doritos)

    private static final double PRICE = 1.50; // Fixed price for all chips

    // Constructor to initialize Chip object with a type
    public Chip(ChipType chipType) {
        super(chipType.name(), PRICE);
        this.chipType = chipType;
    }


    // Method to calculate cost, always returning the fixed price for chips
    public double calculateCost() {
        return PRICE;  // All chips have the same price of $1.50
    }

    // Override toString to provide a detailed string representation of a chip
    @Override
    public String toString() {
        return "Chip: " + chipType + " - $" + PRICE;
    }
}