package com.pluralsight.deli;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class UserInterface {
    Scanner scanner = new Scanner(System.in);

    // Method  to handle flow between screens
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
                    displayOrderScreen(); //Show order screen
                    break;
                case "0":
                    System.out.println("Exiting the application...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1 for New Order or 0 to Exit.");


            }
        }

    }

    // Method to display Order Screen (this will display after user select "New Order")
    public void displayOrderScreen() {
        //Initialize order variable
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
                    System.out.println("Adding sandwich to order......");
                    break;
            case "2":
               addDrinkToOrder(order, scanner);
              System.out.println("Adding drink to order......");
                break;
           case "3":
              addChipsToOrder(order, scanner);
                System.out.println("Adding chips to order......");
              break;
            case "4":
                checkoutOrder(order);
                isRunning = true;
                System.out.println("Checking Out Order........");
                break;
          case "0":
                cancelOrder(order);
                System.out.println("Canceling Order.....");
               isRunning = false;
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

        //Choose the sandwich size
        System.out.println("Choose your sandwich size: 1) 4\" 2) 8\" 3) 12\"");
        int sizeChoice = Integer.parseInt(scanner.nextLine());
        SandwichSize selectedSize = SandwichSize.values()[sizeChoice - 1];

        //Ask for toppings
        List<Topping> selectedToppings = new ArrayList<>();
        boolean addingToppings = true;
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
                    com.pluralsight.deli.Topping.displayToppings(com.pluralsight.deli.Topping.RegularToppings);
                    String regularToppingName = scanner.nextLine();
                    com.pluralsight.deli.Topping regularTopping = new com.pluralsight.deli.Topping(regularToppingName, ToppingType.REGULAR);
                    selectedToppings.add(regularTopping);
                    break;
                case 2:
                    // Select from premium toppings
                    System.out.println("Select premium topping:");
                   com.pluralsight.deli.Topping.displayToppings(com.pluralsight.deli.Topping.PremiumToppings);
                    String premiumToppingName = scanner.nextLine();
                    com.pluralsight.deli.Topping premiumTopping = new com.pluralsight.deli.Topping(premiumToppingName, ToppingType.PREMIUM);
                   selectedToppings.add(premiumTopping);
                   break;
                case 0:
                    addingToppings = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        // Add the sandwich to the order
        new Sandwich(selectedBread, selectedSize, selectedToppings, false, "Custom Sandwich");
        order.addSandwich(new Sandwich(selectedBread, selectedSize, selectedToppings, false, "Custom Sandwich"));


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
        //add a switch case to pass a certain drink
        Drink drink = new Drink(selectedSize, selectedType, "drink");
        order.addDrink(drink);

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

    }

    // Method to checkout the order and display the total
    private void checkoutOrder(Order order) {
        System.out.println(order.getOrderDetails()); // Print order details
        // Save receipt if needed
        Receipt receipt = new Receipt(order);
        receipt.saveReceipt();
    }

    // Method to cancel the order
    private void cancelOrder(Order order) {
        order = null; // Cancel the order by nullifying it
    }
}








