
/**
 * StringConverter class.
 * This class file converts takes in lines of text from an input file. Converts the digits to an English equivalent
 * and sends it back to the PrintWriter in main.
 * 
 * Lab Section L07
 * @author Christopher Stump 
 * @version 3/1/2015
 */
public class StringConverter
{
    StringBuilder tempString;
    /**
     * This is the default constructor for the class StringConverter().
     */
    public StringConverter()
    {
        
    }
    
    /**
     * This get method takes in the line of text. Checks for a digit, then sends the index of the digit
     * to the convertDigit() method. Then, the changed string is returned to the main function.
     * @param This method takes in no parameters.
     */
    public StringBuilder getString()
    {
           for(int i = 0; i < tempString.length(); i++)
           {
               //The next line of code is for the first character. If the character ahead of it is a digit,
               //then it won't convert.
               if(i == 0)
               {
                   if(Character.isDigit(tempString.charAt(i)) && (!Character.isDigit(tempString.charAt(i+1))))
                   {
                       convertDigit(i); //Calls the convertDigit() method and sends the position at i.
                   }   
               } 
               
               //The next line of code is for the last character. If the character before it is a digit, then
               //it won't convert.
               else if(i == tempString.length()-1)
               {
                   if(Character.isDigit(tempString.charAt(i)) && (!Character.isDigit(tempString.charAt(i-1))))
                   {
                       convertDigit(i);
                   }   
               } 
               
               //The next line of code checks any characters in the middle of the sentence.
               //It checks the characters before and after the current one. If any of them are a digit,
               //then it won't convert.
               else if(Character.isDigit(tempString.charAt(i)) && (!Character.isDigit(tempString.charAt(i-1)) 
               && !Character.isDigit(tempString.charAt(i+1))))
               {
                   convertDigit(i);
               }
           }
           return tempString; //returns the tempString to the PrintWriter.
    }
    
    /*
     * This set moth takes in the individual lines of text from the input file and stores it in a
     * StringBuilder field named tempString.
     * @param String line - This is the line of text from the input file.
     */
    public void setString(String line)
    {
        tempString = new StringBuilder(line);
    }
    
    /**
     * This method takes in the digit at position i. It then checks to see if it is a number 0-9.
     * If so, it then replaces it to the corresponding English word. If at position 0, it also capitalizes.
     * @param int i - This is the position of the digit. This was found in the getString() method.
     */
    private void convertDigit(int i)
    {
        if(tempString.charAt(i) == '0' && i == 0)//Checks to see if the digit is equal to '0' and the first character.
            {
            tempString.replace(i, i+1, "Zero"); //Converts to capitalized version.
            }
        else if(tempString.charAt(i) == '0' && i != 0) //If it's equal to '0' and not the first, then not capital.
            tempString.replace(i, i+1, "zero"); //Converts to non-capitalized version.
        //The rest are very similar to the one above for numbers 1-9.
        if(tempString.charAt(i) == '1' && i == 0)
            {
            tempString.replace(i, i+1, "One");
            }
        else if(tempString.charAt(i) == '1' && i != 0)
            tempString.replace(i, i+1, "one");
        
        if(tempString.charAt(i) == '2' && i == 0)
            {
            tempString.replace(i, i+1, "Two");
            }
        else if(tempString.charAt(i) == '2' && i != 0)
            tempString.replace(i, i+1, "two");
        
        if(tempString.charAt(i) == '3' && i == 0)
            {
            tempString.replace(i, i+1, "Three");
            }
        else if(tempString.charAt(i) == '3' && i != 0)
            tempString.replace(i, i+1, "three");
        
        if(tempString.charAt(i) == '4' && i == 0)
            {
            tempString.replace(i, i+1, "Four");
            }
        else if(tempString.charAt(i) == '4' && i != 0)
            tempString.replace(i, i+1, "four");
        
        if(tempString.charAt(i) == '5' && i == 0)
            {
            tempString.replace(i, i+1, "Five");
            }
        else if(tempString.charAt(i) == '5' && i != 0)
            tempString.replace(i, i+1, "five");
        
        if(tempString.charAt(i) == '6' && i == 0)
            {
            tempString.replace(i, i+1, "Six");
            }
        else if(tempString.charAt(i) == '6' && i != 0)
            tempString.replace(i, i+1, "six");
        
        if(tempString.charAt(i) == '7' && i == 0)
            {
            tempString.replace(i, i+1, "Seven");
            }
        else if(tempString.charAt(i) == '7' && i != 0)
            tempString.replace(i, i+1, "seven");
        
        if(tempString.charAt(i) == '8' && i == 0)
            {
            tempString.replace(i, i+1, "Eight");
            }
        else if(tempString.charAt(i) == '8' && i != 0)
            tempString.replace(i, i+1, "eight");
        
        if(tempString.charAt(i) == '9' && i == 0)
            {
            tempString.replace(i, i+1, "Nine");
            }
        else if(tempString.charAt(i) == '9' && i != 0)
            tempString.replace(i, i+1, "nine");
    }
}
