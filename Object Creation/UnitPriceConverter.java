
/**
 * This program converts between British units of measurement. This class file contains the get() and set() methods that will change and return the field values. It also calculates price per pound and price per ounce.
 * 
 * @author Christopher Stump
 * @version 2/2/2015
 */
public class UnitPriceConverter
{
    private double priceOfItem; //Will hold the price of the item.
    private double weightInPounds; //Holds the weight in pounds.
    private double pricePerPound; //Holds the price per pound after being calculated.
    private double pricePerOunce; //Holds the price per ounce after being calculated.
    private final int BRITISH_UNIT = 16; //Constant British unit of measurement. Used to convert between pounds and ounces.

    /**
     * The default constructor that sets the values of the fields to zero.
     */
    public UnitPriceConverter()
    {
        priceOfItem = weightInPounds = pricePerPound = pricePerOunce = 0; //Set the values to 0.
    }
    
    /**
     * This constructor takes in the price and weight of an item and calculates the price per pound and price per ounce.
     * @param double price - The price of the item the user sets.
     * @param double pounds - The weight in pounds of an item that the user sets.
     */
    public UnitPriceConverter(double price, double pounds)
    {
        priceOfItem = price; //Set first price.
        weightInPounds = pounds; //Set first weight in pounds.
        pricePerPound = priceOfItem / weightInPounds; //Calculate price per pound.
        pricePerOunce = (priceOfItem / weightInPounds) / BRITISH_UNIT; //Ounces = Pounds / 16
    }

    /**
     * This set method allows the user to change the weight in pounds of the item.
     * @param double pounds - Holds the users changed weight in pounds.
     */
    public void setPounds(double pounds)
    {
        weightInPounds = pounds; //Set changed weight in pounds.
        pricePerPound = priceOfItem / weightInPounds; //Calculate price per pound.
        pricePerOunce = (priceOfItem / weightInPounds) / BRITISH_UNIT; //Ounces = Pounds / 16
    }
    
    /**
     * This set method allows the user to change the price of the item.
     * @param double price - Holds the users changed price of the item.
     */
    public void setPrice(double price)
    {
        priceOfItem = price; //Set changed price.
        pricePerPound = priceOfItem / weightInPounds; //Calculate price per pound.
        pricePerOunce = (priceOfItem / weightInPounds) / BRITISH_UNIT; //Ounces = Pounds / 16
    }
    
    /**
     * This get method allows the program to fetch the set price of the item.
     * @return The price that the user entered.
     */
    public double getPrice()
    {
        return priceOfItem; //Return price.
    }
    
    /**
     * This get method allows the program to fetch the set weight in pounds of the item.
     * @return The weigh in pounds the user entered.
     */
    public double getWeight()
    {
        return weightInPounds; //Return weight in pounds.
    }
    
    /**
     * This get method allows the program to fetch the calculated price per pound.
     * @return The calculated price per pound.
     */
    public double getPricePP()
    {
        return pricePerPound; //Return price per pound.
    }
    
    /**
     * This get method allows the program to fetch the calculated price per ounce.
     * @return The calculated price per ounce.
     */
    public double getPricePO()
    {
        return pricePerOunce; //Return price per ounce.
    }
}
