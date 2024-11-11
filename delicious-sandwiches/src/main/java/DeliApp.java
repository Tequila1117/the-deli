import com.pluralsight.deli.DrinkSize;
import com.pluralsight.deli.DrinkType;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DeliApp {
    public static void main(String[] args) {

//        //Display premium toppings
//        System.out.println("""
//                ╒══════════════════╕
//                  Premium Toppings
//                ╘══════════════════╛
//                """);+ drink1.getSize()
//        Topping.displayToppings(Topping.PremiumToppings);
//
//        // Display all regular toppings
//        System.out.println("""
//              ╒══════════════════╕
//                Regular Toppings
//              ╘══════════════════╛
//              """);
//        Topping.displayToppings(Topping.RegularToppings);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an option: ");

   //  Order orders is the class/data-type declaration

        Drink drink1;
        drink1 = new Drink(DrinkSize.SMALL, DrinkType.COKE);



    Order order1 = new Order(); // declaring an order object and initializing it on the same line.
    order1.addDrink(drink1);
    System.out.println("Order 1: " + order1.getOrder());



    }



}
