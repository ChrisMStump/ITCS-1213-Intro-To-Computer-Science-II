import java.io.*;
import java.util.*;

public class HardCode
{
    public static void main (String [] args) throws IOException
    {
        PrintWriter output = new PrintWriter ("C:\\Users\\Chris\\Desktop\\step3Lines.txt");
        output.println("Today is Wednesday.");
        output.println("Tomorrow is Thursday.");
        output.println("It might snow tomorrow.");
        output.println("You have NO control!");
        output.println("I cant wait for this lab to start.");
        output.println("I dont want class on Thursday.");
        output.println("I have great lab partners.");
        output.close();
        
        System.out.println("Prininting Complete.");
    }
}
    