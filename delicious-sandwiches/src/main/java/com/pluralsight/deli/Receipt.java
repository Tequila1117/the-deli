package com.pluralsight.deli;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Receipt {
    private Order order;

    // Constructor to initialize the com.pluralsight.deli.Receipt with an Order object
    public Receipt(Order order) {
        this.order = order;
    }

    //Method to save the receipt to a text file
    public void saveReceipt() {
        String timestamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
        String filename = "receipts/" + timestamp + ".txt";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(order.getOrderDetails());
            System.out.println("com.pluralsight.deli.Receipt saved as " + filename);
        } catch (IOException e) {
            System.err.println("Error saving receipt: " + e.getMessage());
        }
    }
}
