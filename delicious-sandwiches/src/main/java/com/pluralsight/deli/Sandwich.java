package com.pluralsight.deli;

import java.util.List;

public class Sandwich extends Item {

    private BreadType breadType;
    private SandwichSize size;
    private List<Topping> toppings;
    private boolean isToasted;
    private SauceType sauceType;

    // Constructor
    public Sandwich(BreadType breadType, SandwichSize size, List<Topping> toppings, boolean isToasted, SauceType sauceType, String name) {
        super(name, 0.0);  // Price is set to 0.0 initially, calculate it later
        this.breadType = breadType;
        this.size = size;
        this.toppings = toppings;
        this.isToasted = isToasted;
        this.sauceType = sauceType;
    }

    @Override
    public double calculateCost() {
        double price = 0.0;

        // Calculate the base price based on the sandwich size
        switch (size) {
            case FOUR_INCHES:
                price = 5.50; // Base price for 4-inch
                break;
            case EIGHT_INCHES:
                price = 7.00; // Base price for 8-inch
                break;
            case TWELVE_INCHES:
                price = 8.50; // Base price for 12-inch
                break;
        }

        // Calculate the cost for premium toppings
        for (Topping topping : toppings) {
            if (topping.getType() == ToppingType.PREMIUM) {
                price += calculatePremiumToppingCost(topping);
            }
        }

        // Calculate the cost of extra meat and extra cheese
        price += calculateExtraCost();

        // Set the price in the Item superclass
        setPrice(price);
        return price;
    }

    private double calculatePremiumToppingCost(Topping topping) {
        double premiumToppingPrice = 0.0;
        // Premium toppings: steak, ham, salami, roast beef, chicken, and bacon
        switch (topping.getName().toLowerCase()) {
            case "steak":
            case "ham":
            case "salami":
            case "roast beef":
            case "chicken":
            case "bacon":
                premiumToppingPrice = calculatePremiumMeatPrice();
                break;
            case "american cheese":
            case "provolone":
            case "cheddar":
            case "swiss":
                premiumToppingPrice = calculatePremiumCheesePrice();
                break;
            default:
                break;
        }
        return premiumToppingPrice;
    }

    private double calculatePremiumMeatPrice() {
        double price = 0.0;
        switch (size) {
            case FOUR_INCHES:
                price = 1.00;
                break;
            case EIGHT_INCHES:
                price = 2.00;
                break;
            case TWELVE_INCHES:
                price = 3.00;
                break;
        }
        return price;
    }

    private double calculatePremiumCheesePrice() {
        double price = 0.0;
        switch (size) {
            case FOUR_INCHES:
                price = 0.75;
                break;
            case EIGHT_INCHES:
                price = 1.50;
                break;
            case TWELVE_INCHES:
                price = 2.25;
                break;
        }
        return price;
    }

    private double calculateExtraCost() {
        double extraCost = 0.0;

        // Extra meat and extra cheese prices based on the sandwich size
        for (Topping topping : toppings) {
            if (topping.getName().toLowerCase().contains("extra meat")) {
                extraCost += calculateExtraMeatPrice();
            } else if (topping.getName().toLowerCase().contains("extra cheese")) {
                extraCost += calculateExtraCheesePrice();
            }
        }
        return extraCost;
    }

    private double calculateExtraMeatPrice() {
        double price = 0.0;
        switch (size) {
            case FOUR_INCHES:
                price = 0.50;
                break;
            case EIGHT_INCHES:
                price = 1.00;
                break;
            case TWELVE_INCHES:
                price = 1.50;
                break;
        }
        return price;
    }

    private double calculateExtraCheesePrice() {
        double price = 0.0;
        switch (size) {
            case FOUR_INCHES:
                price = 0.30;
                break;
            case EIGHT_INCHES:
                price = 0.60;
                break;
            case TWELVE_INCHES:
                price = 0.90;
                break;
        }
        return price;
    }

    // Getters and setters for the other instance variables

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
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

    public SauceType getSauceType() {
        return sauceType;
    }

    public void setSauceType(SauceType sauceType) {
        this.sauceType = sauceType;
    }
}