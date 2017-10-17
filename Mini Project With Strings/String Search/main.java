import java.util.*;
import java.lang.*;
import java.io.*;
public class main
{
    public static void main (String [] args) throws IOException
   {
       String fileName;
       Scanner keyboard = new Scanner(System.in);
       Scanner inputFile;
       char symbol;
       int letterCount;
       int spaceCount;
       int letterE;
       
       String myString;
       letterCount = spaceCount = letterE = 0;
       
       System.out.println("Please enter the name of the file: ");
       fileName = keyboard.nextLine();
       inputFile = new Scanner (new File (fileName));
      
       while (inputFile.hasNext())
       {
           myString = inputFile.nextLine();
          for (int i = 0; i < myString.length(); i++)
          {
            symbol = myString.charAt(i);
            if (Character.isLetter(symbol))
            {
                letterCount++;
            }
            
            if(symbol == 'e' || symbol=='E')
            {
                letterE++;
            }
            
            if (Character.isSpaceChar(symbol))
            {
                spaceCount++;
            }
          }  
          System.out.println(myString);
          System.out.println(myString.toUpperCase());
      }
       System.out.println("Number of letters: " + letterCount);
       System.out.println("Number of 'E': " + letterE);
       System.out.println("Number of spaces: " + spaceCount);
       
    }
}
