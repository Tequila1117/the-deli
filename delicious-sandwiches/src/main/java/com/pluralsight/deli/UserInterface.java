package com.pluralsight.deli;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);

    // Method to handle flow between screens
    public void runApp() {

        displayHomeScreen();
    }

    // Method to display the main menu
    public void displayHomeScreen() {
        boolean isRunning = true; // To keep the app running as long as input is true (correct)

        while (isRunning) {
            System.out.println("""
                    ╒══════════════════════════════╕
                    Welcome to DELI-cious Sandwiches
                    ╘══════════════════════════════╛
                          1) New Order
                          0) Exit
                          """);
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Starting a new order......");
                    displayOrderScreen(); // Show order screen
                    break;
                case "0":
                    System.out.println("Exiting.. Thank You and Please Come Again!!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1 for New Order or 0 to Exit.");
            }
        }
    }

    // Method to display Order Screen (this will display after user selects "New Order")
    public void displayOrderScreen() {
        // Initialize order variable
        Order order = new Order();
        boolean isRunning = true; // To keep the app running as long as input is true (correct)

        while (isRunning) {
            System.out.println("""
                    ╒══════════════════╕
                       Order Options
                    ╘══════════════════╛
                    1) Add Sandwich
                    2) Add Drink
                    3) Add Chips
                    4) Checkout
                    0) Cancel Order
                    """);

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addSandwichToOrder(order, scanner);
                    break;
                case "2":
                    addDrinkToOrder(order, scanner);
                    break;
                case "3":
                    addChipsToOrder(order, scanner);
                    break;
                case "4":
                    checkoutOrder(order);
                    isRunning = false; // Proceed to checkout
                    break;
                case "0":
                    cancelOrder(order);
                    isRunning = false; // Cancel order
                    break;
                default:
                    System.out.println("Invalid choice. Please select from one of the following options.");
            }
        }
    }

    // Method to add a sandwich to the order
    private void addSandwichToOrder(Order order, Scanner scanner) {
        System.out.println("""
        ╒══════════════════╕
            Add Sandwich
        ╘══════════════════╛
        """);

        // Choose the bread type
        System.out.println("Choose your bread: 1) White, 2) Wheat, 3) Rye, 4) Wrap");
        int breadChoice = Integer.parseInt(scanner.nextLine());
        BreadType selectedBread = BreadType.values()[breadChoice - 1];

        // Choose the sandwich size
        System.out.println("Choose your sandwich size: 1) 4\" 2) 8\" 3) 12\"");
        int sizeChoice = Integer.parseInt(scanner.nextLine());
        SandwichSize selectedSize = SandwichSize.values()[sizeChoice - 1];

        // Ask for toppings
        List<Topping> selectedToppings = new ArrayList<>();
        boolean addingToppings = true;

        // Flags to keep track if extra meat or cheese has been added
        boolean extraMeatAsked = false;
        boolean extraCheeseAsked = false;

        while (addingToppings) {
            System.out.println("Choose a topping: ");
            System.out.println("1) Regular Toppings");
            System.out.println("2) Premium Toppings");
            System.out.println("0) Done adding toppings");

            int toppingChoice = Integer.parseInt(scanner.nextLine());

            switch (toppingChoice) {
                case 1:
                    // Select from regular toppings
                    System.out.println("Select regular topping:");
                    Topping.displayToppings(Topping.RegularToppings);
                    String regularToppingName = scanner.nextLine();
                    Topping regularTopping = new Topping(regularToppingName, ToppingType.REGULAR);
                    selectedToppings.add(regularTopping);
                    break;
                case 2:
                    // Select from premium toppings
                    System.out.println("Select premium topping:");
                    Topping.displayToppings(Topping.PremiumToppings);
                    String premiumToppingName = scanner.nextLine();
                    Topping premiumTopping = new Topping(premiumToppingName, ToppingType.PREMIUM);
                    selectedToppings.add(premiumTopping);

                    // Check if extra meat is needed after each premium meat topping selection
                    if ((premiumToppingName.equalsIgnoreCase("steak") ||
                            premiumToppingName.equalsIgnoreCase("ham") ||
                            premiumToppingName.equalsIgnoreCase("salami") ||
                            premiumToppingName.equalsIgnoreCase("roast beef") ||
                            premiumToppingName.equalsIgnoreCase("chicken") ||
                            premiumToppingName.equalsIgnoreCase("bacon")) && !extraMeatAsked) {
                        System.out.println("Do you want extra meat? (yes/no)");
                        String extraMeatChoice = scanner.nextLine();
                        if (extraMeatChoice.equalsIgnoreCase("yes")) {
                            Topping extraMeatTopping = new Topping("Extra Meat", ToppingType.PREMIUM);
                            selectedToppings.add(extraMeatTopping);
                        }
                        extraMeatAsked = true; // Set flag so it won't ask again
                    }

                    // Check if extra cheese is needed after selecting cheese premium topping
                    if ((premiumToppingName.equalsIgnoreCase("american cheese") ||
                            premiumToppingName.equalsIgnoreCase("provolone cheese") ||
                            premiumToppingName.equalsIgnoreCase("cheddar cheese") ||
                            premiumToppingName.equalsIgnoreCase("swiss cheese")) && !extraCheeseAsked) {
                        System.out.println("Do you want extra cheese? (yes/no)");
                        String extraCheeseChoice = scanner.nextLine();
                        if (extraCheeseChoice.equalsIgnoreCase("yes")) {
                            Topping extraCheeseTopping = new Topping("Extra Cheese", ToppingType.PREMIUM);
                            selectedToppings.add(extraCheeseTopping);
                        }
                        extraCheeseAsked = true; // Set flag so it won't ask again
                    }
                    break;
                case 0:
                    // Stop adding toppings
                    addingToppings = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        // Choose the sauce type
        System.out.println("Choose your sauce: ");
        System.out.println("1) Mayo");
        System.out.println("2) Ranch");
        System.out.println("3) Vinegar");
        System.out.println("4) Italian");
        System.out.println("5) Honey Mustard");
        int sauceChoice = Integer.parseInt(scanner.nextLine());
        SauceType selectedSauce = SauceType.values()[sauceChoice - 1];

        // Ask if the sandwich should be toasted
        System.out.println("Do you want your sandwich toasted? (true/false)");
        boolean isToasted = Boolean.parseBoolean(scanner.nextLine());

        // Create the new sandwich
        Sandwich newSandwich = new Sandwich(selectedBread, selectedSize, selectedToppings, isToasted, selectedSauce, "Custom Sandwich");

        // Add the sandwich to the order
        order.addSandwich(newSandwich);
        System.out.println("Added Sandwich to Order! Total Price: $" + newSandwich.calculateCost());
    }

    // Method to add a drink to the order
    private void addDrinkToOrder(Order order, Scanner scanner) {
        System.out.println(""" 
                ╒══════════════════╕
                     Add Drink
                ╘══════════════════╛
                """);

        System.out.println("Choose drink size: 1) Small, 2) Medium, 3) Large");
        int drinkSizeChoice = Integer.parseInt(scanner.nextLine());
        DrinkSize selectedSize = DrinkSize.values()[drinkSizeChoice - 1];

        System.out.println("Choose drink type: 1) Lemonade, 2) Tea, 3) Water, 4) Sprite, 5) Coke");
        int drinkTypeChoice = Integer.parseInt(scanner.nextLine());
        DrinkType selectedType = DrinkType.values()[drinkTypeChoice - 1];

        Drink drink = new Drink(selectedSize, selectedType, "drink");
        order.addDrink(drink);
        System.out.println("Added Drink to Order! Total Price: $" + drink.calculateCost());
    }

    // Method to add chips to the order
    private void addChipsToOrder(Order order, Scanner scanner) {
        System.out.println(""" 
                ╒══════════════════╕
                    Add Chips
                ╘══════════════════╛
                """);

        System.out.println("Choose chip type: 1) Cheetos, 2) Lays, 3) Doritos, 4) Sunchips");
        int chipChoice = Integer.parseInt(scanner.nextLine());
        ChipType selectedChip = ChipType.values()[chipChoice - 1];

        Chip chip = new Chip(selectedChip);
        order.addChip(chip);
        System.out.println("Added Chips to Order! Total Price: $" + chip.calculateCost());
    }

    // Method to checkout the order and display the total
    private void checkoutOrder(Order order) {
        System.out.println(order.getOrderDetails()); // Print order details

        // Calculate the total price of the order
        double totalPrice = order.calculateTotal(); // Using the calculateTotal() method from Order class

        System.out.println("Total Price: $" + totalPrice); // Display total price

        // Save receipt if needed
        Receipt receipt = new Receipt(order);
        receipt.saveReceipt();
    }

    // Method to cancel the order
    private void cancelOrder(Order order) {
        order = null; // Cancel the order by making it null
        System.out.println("Order has been canceled.");
    }
}








