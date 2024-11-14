package com.pluralsight.deli;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Drink> drinks;
    private List<Sandwich> sandwiches;
    private List<Chip> chips;  // List to hold chips


    public Order() {
        this.drinks = new ArrayList<>();
        this.sandwiches = new ArrayList<>();
        this.chips = new ArrayList<>();
    }

    // Add chip to the order
    public void addChip(Chip chip) {
        chips.add(chip);
    }

    // Get order details
    public String getOrderDetails() {
        StringBuilder details = new StringBuilder();
        // Loop through each drink in drink list
        for (Drink drink : drinks) {
            details.append(drink.toString()).append("\n");
        }
        // Loop through each sandwich in the sandwich list
        for (Sandwich sandwich : sandwiches) {
            details.append(sandwich.toString()).append("\n"); //
        }
        // Loop through each chip in the chip list
        for (Chip chip : chips) {
            details.append(chip.toString()).append("\n");
        }
        // Return order details
        return details.toString();
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public double getPrice() {
        return 0;
    }

    //Method to add drink to order
    public void addDrink(Drink drink) {
        drinks.add(drink);
    }
}