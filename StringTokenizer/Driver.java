import java.util.*;
/**
 * Write a description of class Driver here.
 * 
 * @author Christopher Stump
 * @version 3/25/2015
 */
public class Driver
{
    public static void main(String[] args)
    {
        int day, month, year;
        String longMonth, input;
        StringTokenizer stok;
        Date d1;
        Date d2;
        
        System.out.println("The date is being entered.");
        input = "05/01/2015";
        
        System.out.println("The date entered is: " + input);
        System.out.println("The date was sent into a StringTokenizer object, stok");
        stok = new StringTokenizer(input, "/");
        System.out.println("Amount of tokens: " + stok.countTokens());
        
        System.out.println("I am now sending the tokens into: Month, Day and Year.");
        month = Integer.parseInt(stok.nextToken());
        day = Integer.parseInt(stok.nextToken());
        year = Integer.parseInt(stok.nextToken());
        
        System.out.println("Month, Day and Year now contain in order: " + month + " " + day + " " 
        + year);
        
        d1 = new Date(month, day, year);
        System.out.println("We are adding 20 days.");
        d1.add(20);
        System.out.println(d1.toString());
        
        System.out.println("We are now subtracting 1 days.");
        d1.subtract(1);
        System.out.println(d1.toString());
        
        System.out.println("\n\n\n\n");
        
        System.out.println("I am now entering a date in long format.");
        input = "April 1, 2015";
        System.out.println("The date entered is: " + input);
        System.out.println("The date was sent into a StringTokenizer object, stok.");
        stok = new StringTokenizer(input, ", ");
        System.out.println("I am now sending the tokens into: Month, Day and Year.");
        longMonth = stok.nextToken();
        day = Integer.parseInt(stok.nextToken());
        year = Integer.parseInt(stok.nextToken());
        System.out.println("Month, Day and Year now contain in order: " + longMonth + " " + day + " " 
        + year);
        
        d1 = new Date(longMonth, day, year);
        System.out.println("We are adding 365 days.");
        d1.add(365);
        System.out.println(d1.toString());
        
        System.out.println("We are now subtracting 1 days.");
        d1.subtract(1);
        System.out.println(d1.toString());
    }
}
