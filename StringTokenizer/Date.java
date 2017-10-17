
/**
 * This class takes in a date from the driver and calculates the date after adding or subtracting
 * days. It also calculates the days between dates.
 * 
 * @author Christopher Stump 
 * @version 3/25/2015
 */
public class Date
{
    private int month, day, year;
    private String longMonth;
    private int k, manyYears;
    private String yearArray[] = {"January", "February", "March", "April", "May", 
        "June", "July", "August", "September", "October", "November", "December"};
    /**
     * Constructor for objects of class ChangeDate
     */
    public Date()
    {
       month = day = year = 0;
       longMonth = "Unknown";
       k = manyYears = 0;
    }
    
    public Date(int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
        if(month == 1)
        {
            k = 0 + day;
        }
        else if(month == 2)
        {
            k = 31 + day;
        }
        else if(month == 3)
        {
            k = 59 + day;
        }
        else if(month == 4)
        {
            k = 90 + day;
        }
        else if(month == 5)
        {
            k = 120 + day;
        }
        else if(month == 6)
        {
            k = 151 + day;
        }
        else if(month == 7)
        {
            k = 181 + day;
        }
        else if(month == 8)
        {
            k = 212 + day;
        }
        else if(month == 9)
        {
            k = 243 + day;
        }
        else if(month == 10)
        {
            k = 273 + day;
        }
        else if(month == 11)
        {
            k = 304 + day;
        }
        else
        {
            k = 334 + day;
        }
    }
    
    public Date(String longMonth, int day, int year)
    {
        this.longMonth = longMonth;
        this.day = day;
        this.year = year;
        if(longMonth.equals(yearArray[0]))
        {
            k = 0 + day;
        }
        else if(longMonth.equals(yearArray[1]))
        {
            k = 31 + day;
        }
        else if(longMonth.equals(yearArray[2]))
        {
            k = 59 + day;
        }
        else if(longMonth.equals(yearArray[3]))
        {
            k = 90 + day;
        }
        else if(longMonth.equals(yearArray[4]))
        {
            k = 120 + day;
        }
        else if(longMonth.equals(yearArray[5]))
        {
            k = 151 + day;
        }
        else if(longMonth.equals(yearArray[6]))
        {
            k = 181 + day;
        }
        else if(longMonth.equals(yearArray[7]))
        {
            k = 212 + day;
        }
        else if(longMonth.equals(yearArray[8]))
        {
            k = 243 + day;
        }
        else if(longMonth.equals(yearArray[9]))
        {
            k = 273 + day;
        }
        else if(longMonth.equals(yearArray[10]))
        {
            k = 304 + day;
        }
        else
        {
            k = 334 + day;
        }
    }
    
    public Date add(int numDays)
    {
        manyYears = numDays / 365;
        k = k + (numDays - (365 * manyYears));
        year = year + manyYears;
        simplifyDate(k, year);
        Date newDate = new Date(month, day, year);
        return newDate;
    }
    
    public Date subtract(int numDays)
    {
        manyYears = numDays / 365;
        k = k - (numDays - (365 * manyYears));
        if(k <= 0)
        {
            k = k + 365;
            year = year - 1;
        }  
        year = year - manyYears;
        simplifyDate(k, year);
        Date newDate = new Date(month, day, year);
        return newDate;
    }
    
    public void simplifyDate(int k, int year)
    {
        if(k > 0 && k < 32)
        {
            month = 1;
            longMonth = "January";
            day = k;
        }
        else if(k > 31 && k < 60)
        {
            month = 2;
            longMonth = "February";
            day = k - 31;
        }
        else if(k > 59 && k < 91)
        {
            month = 3;
            longMonth = "March";
            day = k - 59;
        }
        else if(k > 90 && k < 121)
        {
            month = 4;
            longMonth = "April";
            day = k - 90;
        }
        else if(k > 120 && k < 152)
        {
            month = 5;
            longMonth = "May";
            day = k - 120;
        }
        else if(k > 151 && k < 182)
        {
            month = 6;
            longMonth = "June";
            day = k - 151;
        }
        else if(k > 181 && k < 213)
        {
            month = 7;
            longMonth = "July";
            day = k - 181;
        }
        else if(k > 212 && k < 244)
        {
            month = 8;
            longMonth = "August";
            day = k - 212;
        }
        else if(k > 243 && k < 274)
        {
            month = 9;
            longMonth = "September";
            day = k - 243;
        }
        else if(k > 273 && k < 305)
        {
            month = 10;
            longMonth = "October";
            day = k - 273;
        }
        else if(k > 304 && k < 335)
        {
            month = 11;
            longMonth = "November";
            day = k - 304;
        }
        else if(k > 334 && k < 366)
        {
            month = 12;
            longMonth = "December";
            day = k - 334;
        }
    }
    
    public int daysBetween(Date anotherDate)
    {
        int daysBetween = 0;
        int yearsBetween = 0;
        
        
        return daysBetween;
    }

    public boolean equals(String longMonth)
    {
        if(this.longMonth == longMonth)
            return true;
        else
            return false;
    }
    
    public String toString()
    {
            return "Short: " + month + "/" + day + "/" + year +
                   "\nLong: " + longMonth + " " + day + ", " + year;
    }
    
}
