package com.pluralsight.deli;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Receipt {
    private Order order;

    // Constructor to initialize the Receipt with an Order object
    public Receipt(Order order) {
        this.order = order;
    }

    // Method to save the receipt to a text file and print it to the console
    public void saveReceipt() {
        // Get a timestamp for the file name
        String timestamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
        String filename = "Receipt-" + timestamp + ".txt"; // Simplified filename

        // Define the folder where the receipt will be saved
        String folder = "C:/pluralsight/the-deli/delicious-sandwiches/src/main/resources/Receipt";

        // Start building the receipt content
        StringBuilder receiptContent = new StringBuilder();

        // Add a header to the receipt
        receiptContent.append("╒═════════════════════════════════════════╕\n")
                .append("                DELI-cious Sandwiches\n")
                .append("          Thank you for your order!\n")
                .append("╘═════════════════════════════════════════╛\n\n");

        // Add the order details (itemized list)
        receiptContent.append("Order Details:\n");
        receiptContent.append(order.getOrderDetails()).append("\n");

        // Calculate the total price of the order
        double totalPrice = order.calculateTotal();
        receiptContent.append("-------------------------------------------------\n")
                .append("Total Price: $").append(String.format("%.2f", totalPrice)).append("\n");

        // Add the timestamp for when the order was processed
        receiptContent.append("Order Processed On: ").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())).append("\n");

        // Print the receipt content to the console
        System.out.println(receiptContent.toString());

        // Save the receipt to the file
        try (FileWriter writer = new FileWriter(folder + filename)) {  // Save to the folder
            writer.write(receiptContent.toString());
            System.out.println("Receipt saved successfully as: " + filename); // Print only filename (user-friendly)
        } catch (IOException e) {
            System.err.println("Error saving receipt: " + e.getMessage());
        }
    }
}