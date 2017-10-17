
/**
 * Takes in parameters for the Pet such as name, type and weight to create an instance of a Pet for the client.
 * 
 * 
 * @author Christopher Stump
 * @version 4/24/2015
 */
public class Pet
{
    private String petName; //Holds the basic values for each Pet
    private String animalType; //Name, type of animal, weight...
    private int weight;
    private String rabiesDate;
    private String lastVisit;
    
    /**
     * This is the default constructor that sets the Strings to "Unknown"
     * and numerical values to 0.
     */
    public Pet()
    {
        petName = animalType = rabiesDate = lastVisit = "Unknown";
        weight = 0;
    }
    
    /**
     * This is the overloaded constructor that takes in data found in the text file such as the name,
     * type, and weight of a Pet.
     * Each client has a seperate array of pets associated with this class.
     * @param String name - Holds the name of the pet.
     * @param String type - What kind of pet is it?
     * @param int weight - How much in lbs the animal weighs.
     * @param String rabies - Holds the last date of a rabies shot.
     * @param String visit - Holds the last visit of the animal.
     */
    public Pet(String name, String type, int weight, String rabies, String visit)
    {
        petName = name; //Sets the values for this instance of a pet.
        animalType = type;
        this.weight = weight;
        rabiesDate = rabies;
        lastVisit = visit;
    }
    
    /**
     * This method returns a string of all information about the pet.
     * @return Returns string representation of the pet.
     */
    public String toString()
    {
        return "\n~~~~~~~~~~~~" + "\nName: " + petName + "\nType: " + animalType + "\nWeight: " + weight 
               + "\nLast Rabies Shot: " + rabiesDate
               + "\nLast Visit: " + lastVisit;
    }
}
