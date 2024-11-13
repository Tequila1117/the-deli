package com.pluralsight.deli;
import java.util.Scanner;





public class UserInterface {


    // Method  to handle flow between screens
    public void runApp() {
        displayHomeScreen();



    }

    // Method to display the main menu
    public void displayHomeScreen() {
        Scanner scanner = new Scanner(System.in);
       boolean isRunning = true; // To keep the app running as long as input is true (correct)

        while (isRunning) {
            System.out.println("""
                ╒══════════════════╕
                    DELI-cious 
                ╘══════════════════╛
                1) New Order
                0) Exit
                """);
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("HELLO! Welcome to the DELI-cious Shop!!!!");
                    displayOrderScreen();
                    break;
            }
        }

    }

    // Display Order Screen (this will display after user select "New Order"
    public void displayOrderScreen() {
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
    }

    // Method to allow user to select a drink size and type




// Method to guide user through sandwich customization


// Method to allow user to select a drink size and type

    }