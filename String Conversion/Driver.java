import java.util.*;
import java.io.*;
import java.lang.*;
/**
 * Driver class.
 * This class asks the user for the directory of an input text file. Once found it takes line by line and sends
 * single digits to be converted in the StringConverter class file. Once the converted string is returned
 * the PrintWriter creates a new file called "outSentence" to wherever the input file is.
 * 
 * Lab Section L07
 * @author Christopher Stump
 * @version 3/1/2015
 */
public class Driver
{
    public static void main(String[] args) throws IOException
    {
        String fileName; //To hold the directory of the input file.
        String line; //Holds individual lines of text to be sent to the converter class.
        StringBuilder location; //Used to figure out where to save the output file.
        int textFileLocation; //Used to hold an index of the last instance of "\\" to replace with "outSentence".
        Scanner inputFile; //Used to get the input file.
        
        StringConverter sc = new StringConverter(); //Creates the StringConverter object.
        
        Scanner keyboard = new Scanner(System.in); //Allows input from the keyboard.
        
        //Sends a new file to the Scanner object inputFile. The file name is given by the user.
        System.out.print("Enter the name of the file: ");
        fileName = keyboard.nextLine();
        inputFile = new Scanner(new File(fileName));
        
        //This allows the program to know where to save the output file.
        location = new StringBuilder(fileName);
        textFileLocation = (location.lastIndexOf("\\"));
        location.replace(textFileLocation, location.length(), "outSentence.txt");
        
        PrintWriter output = new PrintWriter(location.toString()); //Creates a new PrintWriter object.
        while(inputFile.hasNext())
        {
            line = inputFile.nextLine(); //Holds a single line of text and sends it to the StringConverter class.
            //Checks whether or not the line is longer than 80 characters. If so, then it prints. "It's too long!"
            if(line.length() <= 80)
                sc.setString(line);
            else
                sc.setString(line = "This string is too long!");
           
            output.println(sc.getString()); //The PrintWriterObject takes back the converted text and stores it.
        }
        output.close(); //Closes the new file and creates it.
        System.out.print("Printing Complete."); //Let's the user know when the file is created.
    }
}
