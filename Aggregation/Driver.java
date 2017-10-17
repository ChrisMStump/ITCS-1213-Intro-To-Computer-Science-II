import java.lang.*;
import java.io.*;
import java.util.*;
/**
 * This class takes in input from a text file and creates clients which are stored in an array
 * Also, it creates an array of pets for each client
 * These are passed onto the Human's overloaded constructor.
 * 
 * @author Christopher Stump
 * @version 04/24/2015
 */
public class Driver
{
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in); //Allow input from the keyboard.
        StringTokenizer stok; //New StringTokenizer reference.
        String location; //Will hold the String location for the text file.
        
        //****************************
        String last; //These hold the values for each Human to be made.
        String first;
        String address;
        int ID;
        int visits;
        double balance;
        int totPets;
        int c = 0; //Used to store clients in the array by being incremented.
        
        String name; //These hold the values for each pet to be made.
        String type;
        int weight;
        String rabies;
        String visit;
        int p = 0; //Used to create the array of pets.
        //****************************
        System.out.println("Note: This program creates an array of 5 clients.");
        System.out.print("Enter file location: "); //Ask the user for the file location.
        location = input.nextLine();
        
        Scanner inputFile = new Scanner(new File(location)); //New scanner created to read from the file.
        
        Human clients[] = new Human[5]; //Create a blank array of 5 Human objects.
        while(inputFile.hasNext())
        {
           stok = new StringTokenizer(inputFile.nextLine(), ","); //New Tokenizer to get Client information. 
           last = stok.nextToken(); //With each token the values for the Human clien is filled.
           first = stok.nextToken();
           address = stok.nextToken();
           ID = Integer.parseInt(stok.nextToken());
           visits = Integer.parseInt(stok.nextToken());
           balance = Double.parseDouble(stok.nextToken());
           totPets = Integer.parseInt(stok.nextToken());
           
           Pet pets[] = new Pet[totPets]; //Takes the total number of pets the client has and creates a new array of pets.
           p = 0; //Set to 0 everytime a new client is made.
           for(int i = 0; i < totPets; i++)
           {
               stok = new StringTokenizer(inputFile.nextLine(), ","); //New Tokenizer to get Pet information.
               name = stok.nextToken(); //Get name of pet.
               type = stok.nextToken(); //Type of pet.
               weight = Integer.parseInt(stok.nextToken()); //Weight of pet.
               rabies = stok.nextToken(); //Last rabies date.
               visit = stok.nextToken(); //Last visit.
               pets[p] = new Pet(name, type, weight, rabies, visit); //Creates the pet associated to the client.
               p++; //Increments so the next pet will be stored in the next array slot.
           }
           //Creates the client with the information above and sends along the array of pets.
           clients[c] = new Human(last, first, address, ID, visits, balance, totPets, pets); 
           c++;
        }
        
        System.out.println("************************************");
        for(int x = 0; x < 5; x++) //Prints each of the five clients. (Along with the pets.)
        {
            System.out.println(clients[x].toString());
            System.out.println("************************************");
        }
        
        System.out.println("\nI am now testing the equals method on two clients.");
        System.out.println("If they are equal the equals() method will return true.");
        System.out.println("If they are not equal the method will return false.\n\n");
        
        System.out.println("Testing to see if Client 1 and Client 3 are the same based on ID");
        if(clients[0].equals(clients[2])) //Calling the equals method in the Human class to compare two clients.
        { //This is based on their ID.
            System.out.println("Returned True, so the two clients are the same.");
        }
        else
        {
            System.out.println("Returned False, so the two clients are not the same.");
        }
    }
}
