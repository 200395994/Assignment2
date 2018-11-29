
package lab05;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author Ravneet Bhullar
 */
public class Mobile {
    /*
    * declare the variables for mobile
    */
    private String brand, model, color;
    private  double price;
    private LocalDate launchDate;
    /*
    * declare the constructor for mobile
    */

    public Mobile(String brand, String model, String color, double price, LocalDate launchDate) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setPrice(price);
        setLaunchDate(launchDate);
    }
     /*
    * Get method for Brand and
    * return the value
    */

    public String getBrand() {
        return brand; 
        
    }
    /*
    * this method validates that theBrand of the phone should have some value 
    */
  public void setBrand(String brand) {
        if (!brand.isEmpty())
            this.brand = brand;
        else
            throw new IllegalArgumentException("Brand cannot be empty");
 
    }
     /*
    * Get method for Model and
    * return the value
    */
  
    public String getModel() {
        return model;
    }
    /*
    *this validates that the Model of the phone is should not empty
    */

    public void setModel(String model) {
        if (!model.isEmpty())
            this.model = model;
        else
            throw new IllegalArgumentException("Model cannot be empty");
 
    }
    /* 
    * Get method for Color and
    * return the value
    */
    
    public String getColor() {
        return color;
    }
    /*
    *this validates that the Color of the phone have some value
    */

    public void setColor(String color) {
        if (!color.isEmpty())
            this.color = color;
        else
            throw new IllegalArgumentException("Color cannot be empty");
 
    }
     /*
    * Get method for Price and
    * return the value
    */

    public double getPrice() {
        return price;
    }
    
    /*
    *this validates that the Price of the phone is less than the 0 
    */

    public void setPrice(double price) {
         if (price > 0)
            this.price = price;
        else
            throw new IllegalArgumentException("Price must be greater than 0"); 
    }
    /*
    * Get method for launchDate and
    * return the value
    */

    public LocalDate getLaunchDate() {
        return launchDate;
    }
    

    /**
     * this validates that the launch date of the phone is between Jan 1, 2000 and 
     * the present date
     * @param launchDate 
     */
    public void setLaunchDate(LocalDate launchDate) {

       if (launchDate.isAfter(LocalDate.of(2000, Month.JANUARY, 1)) &&
            launchDate.isBefore(LocalDate.now()))
            this.launchDate = launchDate;
   else
     throw new IllegalArgumentException("launch date should be greater than 2000 ");
    }

    
      
    }
    

  
    


