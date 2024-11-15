package com.pluralsight.deli;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Drink> drinks;
    private List<Sandwich> sandwiches;
    private List<Chip> chips;  // List to hold chips


    //Constructor
    public Order() {
        this.drinks = new ArrayList<>();
        this.sandwiches = new ArrayList<>();
        this.chips = new ArrayList<>();
    }


    // Method to add chip to the order
    public void addChip(Chip chip) {

        chips.add(chip);
    }

    // Method to add sandwich to order
    public void addSandwich(Sandwich sandwich) {

        sandwiches.add(sandwich);
    }


    //Method to add drink to order
    public void addDrink(Drink drink) {

        drinks.add(drink);
    }


    //Getter methods for the Lists
    public List<Sandwich> getSandwiches() {
        return this.sandwiches;
    }

    public List<Drink> getDrinks() {
        return this.drinks;
    }

    public List<Chip> getChips() {
        return this.chips;
    }

    // Method to get order details (for printing receipt display)
    public String getOrderDetails() {
        StringBuilder details = new StringBuilder();


        // Loop through each drink in drink list and add to details
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
    // Method to calculate the total price of the order
    public double calculateTotal() {
        double total = 0.0;

        // Add the price of each drink
        for (Drink drink : drinks) {
            total += drink.calculateCost();
        }

        // Add the price of each sandwich
        for (Sandwich sandwich : sandwiches) {
            total += sandwich.calculateCost();
        }
        // Add the price of each chip
        for (Chip chip : chips) {
            total += chip.calculateCost();
        }
        return total;
    }

}
