package com.pluralsight.deli;
import java.util.Scanner;





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

    // Display Order Screen (this will display after user select "New Order"
    public void displayOrderScreen() {
        boolean isRunning = true; // To keep the app running as long as input is true (correct)

        while (isRunning) {
    }
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
                System.out.println("Adding sandwich to order......");
                break;
            case "2":
                System.out.println("Adding drink to order......");
                break;
            case "3":
                System.out.println("Adding chips to order......");
                break;
            case "4":
                System.out.println("Checking Out Order........");
                break;
            case "0":
                System.out.println("Canceling Order.....");
                isRunning = false;
                break;
            default:
                System.out.println("Invalid choice. Please select 1 for New Order or 0 to Exit.");







    }

    // Method to allow user to select a drink size and type




// Method to guide user through sandwich customization


// Method to allow user to select a drink size and type

    }
}