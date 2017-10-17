import java.util.Scanner;
/**
 * This is the where execution starts. This program takes in a weigh in pounds and a price. Then, it calculates the price per pound and ounces.
 * 
 * @author Christopher Stump    
 * @version 2/2/2015
 */
public class ConverterDriver
{
    public static void main(String[ ] args)
    {
        UnitPriceConverter pc;
        Scanner keyboard;
        double pounds, price; //Will be used to hold user's input for price and weight in pounds.
        char rerun = 'y'; //Sentinel for the while loop.
        
        keyboard = new Scanner(System.in); //Created scanner object.
        
        System.out.print("Enter the weight in pounds: "); //Ask the user to enter a weight in pounds and assign it to pounds.
        pounds = keyboard.nextDouble();
            
            
        System.out.print("Enter the price of the item: "); //Ask the user to enter a price and assign it to price.
        price = keyboard.nextDouble();
           
        pc = new UnitPriceConverter(price, pounds); //Created a UnitPriceConverter object.
        
        //Return the price, weight, price per pound and price per ounce.
        System.out.println("Price Entered: " + pc.getPrice());
        System.out.println("Weight In Pounds Entered: " + pc.getWeight());
        System.out.println("The price per pound of the item is: " + pc.getPricePP());
        System.out.println("The price per ounce of the item is: " + pc.getPricePO());
        
        //Ask the user if they would like to go again.
        System.out.println("****************************************************************************************");
        System.out.print("Would you like to go again? (Enter 'Y' to go again.): ");
        rerun = keyboard.next().charAt(0);
        System.out.println("****************************************************************************************");
        //The while loop is implemented to allow the user to run the program as much as they would like to.
        while(rerun == 'y' || rerun == 'Y')
        {
            System.out.print("Enter the weight in pounds: "); //Ask the user to enter a weight in pounds and assign it to pounds.
            pounds = keyboard.nextDouble();
            pc.setPounds(pounds); //Change the fields using the set method.
            
            System.out.print("Enter the price of the item: "); //Ask the user to enter a price and assign it to price.
            price = keyboard.nextDouble();
            pc.setPrice(price); //Change the fields using the set method.
           
            //Return the price, weight, price per pound and price per ounce.
            System.out.println("Price Entered: " + pc.getPrice());
            System.out.println("Weight In Pounds Entered: " + pc.getWeight());
            System.out.println("The price per pound of the item is: " + pc.getPricePP());
            System.out.println("The price per ounce of the item is: " + pc.getPricePO());
            
            //Ask the user if they would like to go again.
            System.out.println("****************************************************************************************");
            System.out.print("Would you like to go again? (Enter 'Y' to go again.): ");
            rerun = keyboard.next().charAt(0);
            System.out.println("****************************************************************************************");
        }
        //Print a goodbye message.
        System.out.print("Goodbye, user!");
    }
}
