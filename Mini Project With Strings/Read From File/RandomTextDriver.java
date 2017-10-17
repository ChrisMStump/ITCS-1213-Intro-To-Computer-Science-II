import java.util.*;
import java.io.*;

public class RandomTextDriver
{
   public static void main (String [] args) throws IOException
   {
       String fileName;
       Scanner keyboard = new Scanner(System.in);
       Scanner inputFile;
       
       String myString;
       
       System.out.println("Please enter the name of the file: ");
       fileName = keyboard.nextLine();
       inputFile = new Scanner (new File (fileName));
       
       while (inputFile.hasNext())
       {
           myString = inputFile.nextLine();
           System.out.println(myString);
       }
       inputFile.close();
    }
}
