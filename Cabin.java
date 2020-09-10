/**
 * Write a description of class Cabin here.
 *
 * @author JC
 * @version (a version number or a date)
 */
public class Cabin {
    //Instance variables for cabin
    private int id;
    private int postCode;
    private int buildingYear;
    private int noOfBeds;
    private int noOfRooms;
    private int squareMeter;
    private int pricePrDay;
    private String address;
    private String city;
    
    //Constructer for Cabin
    public Cabin(int cabinId, String cabinAddress, int cabinPostCode, String cabinCity) {
        id = cabinId;
        address = cabinAddress;
        postCode = cabinPostCode;
        city = cabinCity;
    }
    
    //Mutator methods
    public void setBuildingYear(int cabinBuildingYear) {
        buildingYear = cabinBuildingYear;
    }
    
    public void setNoOfBeds(int cabinNoOfBeds) {
        noOfBeds = cabinNoOfBeds;
    }
    
    public void setNoOfRooms(int cabinNoOfRooms) {
        noOfRooms = cabinNoOfRooms;
    }
    
    public void setSquareMeter(int cabinSquareMeter) {
        squareMeter = cabinSquareMeter;
    }
    
    public void setPricePrDay(int cabinPricePrDay) {
        pricePrDay = cabinPricePrDay;
    }
    
    public void clearPricePrDay() {
        pricePrDay = 0;
    }
    
    //Conditional statements
    public void priceForRent(int personUsingCabin, int daysUsingCabin) {
        pricePrDay += 200 / daysUsingCabin;
        if(personUsingCabin > noOfBeds) {
            pricePrDay += (personUsingCabin - noOfBeds)*50;
        }
        if(buildingYear < 1950) {
            pricePrDay -= 200 / daysUsingCabin;
        }
        if(daysUsingCabin > 7) {
            pricePrDay -= 100 / daysUsingCabin;
        }        
    }
    
    //Accessor methods
      public int getBuildingYear() {
        return buildingYear;
    }
    
    public int getNoOfBeds() {
        return noOfBeds;
    }
    
    public int getNoOfRooms() {
        return noOfRooms;
    }
    
    public int getSquareMeter() {
        return squareMeter;
    }
    
    public int getPricePrDay() {
        return pricePrDay;
    }
}
