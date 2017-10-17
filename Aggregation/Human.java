import java.util.*;
/**
 * Takes in parameters for the Client such as name, address, ID
 * Also, takes in the array of pets, so each client has their own array of pets.
 * 
 * @author Christopher Stump
 * @version 04/24/2015
 */
public class Human
{
    private String lastName; //Hold values for each Human.
    private String firstName; //First and last name, address...
    private String address;
    private int ID;
    private int numVisits;
    private int numPets;
    private double balanceOwed;
    Pet pets[] = new Pet[numPets]; //Array of pets are created based on the number of pets the client owns.
    
    /**
     * This is the default constructor that sets the Strings to "Unknown"
     * and numerical values to 0.
     */
    public Human()
    {
        lastName = firstName = address = "Unknown";
        ID = numVisits = 0;
        balanceOwed = 0.00;
    }
    
    /**
     * This is the overloaded constructor which takes in data made out from the text file
     * With that data each field is assigned it's own value.
     * @param String last - Last name of client.
     * @param String first - First name of client.
     * @param String address - Holds the address of the client.
     * @param int ID - Identification number of the client.
     * @param int visits - How many visits the client currently has.
     * @param double balance - Holds the balance the client currently owes.
     * @param int totPets - Holds the amount of pets the client has.
     * @param Pet pets[] - Holds the array of pets associated with the client.
     */
    public Human(String last, String first, String address, int ID, int visits, double balance, int totPets, Pet pets[])
    {
        lastName = last; //Sets the values for this instance of a client.
        firstName = first;
        this.address = address;
        this.ID = ID;
        numVisits = visits;
        balanceOwed = balance;
        numPets = totPets;
        this.pets = pets;
    }
    
    /**
     * This is the equals method which compares two clients based on their ID number.
     * @param Human other - Takes in another client.
     * @return Returns true if they are equal and false if they are not.
     */
    public boolean equals(Human other)
    {
        return (this.ID == other.ID); //Returns true if the clients are the same.
    }
    
    /**
     * This method returns a string of all the information about the client and calls the pets toString() method.
     * @return Returns a String representation of the client and Pets.
     */
    public String toString()
    {
        return "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nAddress: " + address
               + "\nID: " + ID + "\nNumber of Visits: "
               + numVisits + "\nBalance: " + balanceOwed + "\nRegistered Pets: " + numPets + "\n\n" 
               + "Pets: \n" + Arrays.toString(pets); //Calls the pet's toString().
    }
}
