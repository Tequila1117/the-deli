# DELI-cious Sandwiches 🍞🥪

## Description

Welcome to the DELI-cious Sandwiches app, a program designed for a sandwich shop, allowing customers to customize their sandwiches, drinks, and chips. 
Users can create new orders, select toppings, bread types, sauces, and more. User will also receive a receipt with order details and total costs.

## Features 🚀
- Custom Sandwich Creation: Choose from a variety of bread, sandwich sizes, toppings (regular & premium), and sauces.
- Add Chips & Drinks: Add chips (ex: Doritos, Lays) and drinks (Lemonade, Tea, Coke, etc.) to your order.
- Order Management: View and modify your order before checkout.
- Receipt Generation: Print a formatted receipt, including order details, total price, and timestamp.
- Interactive User Interface: A text-based menu to guide users through the process.


## Technologies Used 🛠️
- Java: The core language used for development.
- Enums: For types like bread, sauce, drink sizes, and more, ensuring type safety.
- File I/O: Save receipts to a text file with the timestamp for easy retrieval.
- OOP Principles: Utilizes object-oriented programming principles such as inheritance, abstraction, and encapsulation.


# **Usage 📱**

## **1. Home Screen**
   
- When you launch the application, you'll be greeted with a menu. You can choose:
 -  1: Start a new order.
 -  0: Exit the app.

## 2. Order Screen
   
 - Once you choose to start a new order, you'll be able to:

- **Add a Sandwich:** Choose bread type, size, toppings, and sauce.

- **Add Drinks:** Choose the size and type of drink.
   
- **Add Chips:** Select your favorite chip brand from the options given.
   
- **Checkout:** View the final details of your order, including the total price.

## 3. Receipt

   - After checkout, a receipt will be displayed and saved to a .txt file with the timestamp of your order. The receipt includes:
   
  
 - A list of all items in the order.
 - The total price.
 - A timestamp for when the order was processed.

## Code Structure 📂

Here's an overview of the file and directory structure:

![[Screenshot of Directory Structure]](images/DirectoryStructure.PNG)





## Visuals 👁‍🗨

Here are a few visual of the home screens in the appliation:

- Home Screen: A simple menu with options to start a new order or exit.

![[Screenshot of Home Screen]](images/HomeScreen.PNG)





- Order Screen: A more interactive screen where the user adds sandwiches, drinks, and chips.
  
![[Screenshot of Order Screen]](images/OrderScreen.PNG)






- Receipt: The receipt generated after a successful order, which includes detailed pricing and a timestamp.
 

![[Screenshot of Receipt]](images/Receipt.PNG)


## 🧡 Unique Piece of Code: Using Enums for Drink Size Selection 🧡

In this project, I used Java enum to represent different sizes of drinks, which allows for better organization, readability, and maintainability of the code.


![[Screenshot of Enum DrinkSize Class]](images/EnumClass.PNG)


The DrinkSize enum defines three available sizes: SMALL, MEDIUM, and LARGE. By using enums, we ensure that we limit the possible values for drink size to only these three options. This reduces the likelihood of errors, like accidentally assigning an invalid size.

In another part of the code, we determine the price of a drink based on its size:


![[Screenshot of Enum being used]](images/EnumUsage.PNG)

Using the DrinkSize enum here provides a clear way to check for each size, making the code more readable and easier to maintain. Also, if new sizes need to be added in the future, it would be as simple as adding another constant to the DrinkSize enum, without needing to modify multiple parts of the code.

By utilizing enums in this way, we can handle different drink sizes with confidence, knowing that the logic is robust and type-safe.



## Conclusion 🏁

The DELI-cious Sandwiches app is a fun and interactive way to manage orders in a deli shop. This project is built in Java and demonstrates core object-oriented programming principles such as inheritance, abstraction, and polymorphism.


