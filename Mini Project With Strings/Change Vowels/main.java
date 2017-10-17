import java.io.*;
import java. util.*;
public class main
{
    public static void main (String [] args) throws IOException
    {
        File inText = new File ("apples.txt");
        Scanner input = new Scanner (inText);

        StringBuilder stringToWork;

        while (input.hasNext())
        {
            stringToWork = new StringBuilder (input.nextLine());
            for (int i = 0; i < stringToWork.length(); i++)
            {
                if (stringToWork.charAt(i) == 'I' || stringToWork.charAt(i) == 'A' || stringToWork.charAt
                (i)== 'E' || stringToWork.charAt (i) == 'O' || stringToWork.charAt(i) == 'U')

                    stringToWork.replace(i, i+1, "E");

                if (stringToWork.charAt(i) == 'i' || stringToWork.charAt(i) == 'a' || stringToWork.charAt
                (i)== 'e' || stringToWork.charAt (i) == 'o' || stringToWork.charAt(i) == 'u')
                {
                    stringToWork.replace(i, i+1, "e");
                }
            }
            System.out.println(stringToWork);
            for (int i = 0; i < stringToWork.length(); i++)
            {
                if (stringToWork.charAt(i) == 'I' || stringToWork.charAt(i) == 'A' || stringToWork.charAt
                (i)== 'E' || stringToWork.charAt (i) == 'O' || stringToWork.charAt(i) == 'U')
                {
                    stringToWork.replace(i, i+1, "A");
                }

                if (stringToWork.charAt(i) == 'i' || stringToWork.charAt(i) == 'a' || stringToWork.charAt
                (i)== 'e' || stringToWork.charAt (i) == 'o' || stringToWork.charAt(i) == 'u')
                {
                    stringToWork.replace(i, i+1, "a");
                }
            }
            System.out.println(stringToWork);
            for (int i = 0; i < stringToWork.length(); i++)
            {
                if (stringToWork.charAt(i) == 'I' || stringToWork.charAt(i) == 'A' || stringToWork.charAt
                (i)== 'E' || stringToWork.charAt (i) == 'O' || stringToWork.charAt(i) == 'U')
                {
                    stringToWork.replace(i, i+1, "I");
                }

                if (stringToWork.charAt(i) == 'i' || stringToWork.charAt(i) == 'a' || stringToWork.charAt
                (i)== 'e' || stringToWork.charAt (i) == 'o' || stringToWork.charAt(i) == 'u')
                {
                    stringToWork.replace(i, i+1, "i");
                }
            }
            System.out.println(stringToWork);
            for (int i = 0; i < stringToWork.length(); i++)
            {
                if (stringToWork.charAt(i) == 'I' || stringToWork.charAt(i) == 'A' || stringToWork.charAt
                (i)== 'E' || stringToWork.charAt (i) == 'O' || stringToWork.charAt(i) == 'U')
                {
                    stringToWork.replace(i, i+1, "O");
                }

                if (stringToWork.charAt(i) == 'i' || stringToWork.charAt(i) == 'a' || stringToWork.charAt
                (i)== 'e' || stringToWork.charAt (i) == 'o' || stringToWork.charAt(i) == 'u')
                {
                    stringToWork.replace(i, i+1, "o");
                }
            }
            System.out.println(stringToWork);
            for (int i = 0; i < stringToWork.length(); i++)
            {
                if (stringToWork.charAt(i) == 'I' || stringToWork.charAt(i) == 'A' || stringToWork.charAt
                (i)== 'E' || stringToWork.charAt (i) == 'O' || stringToWork.charAt(i) == 'U')
                {
                    stringToWork.replace(i, i+1, "U");
                }

                if (stringToWork.charAt(i) == 'i' || stringToWork.charAt(i) == 'a' || stringToWork.charAt
                (i)== 'e' || stringToWork.charAt (i) == 'o' || stringToWork.charAt(i) == 'u')
                {
                    stringToWork.replace(i, i+1, "u");
                }
            }
            System.out.println(stringToWork);
        }

    }
}