
package lab05;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Ravneet Bhullar
 */
public class Mobile {
    /**
    * declare the variables for mobile such as brand, model,  capacity
    * paymentMethod price and launchDate
    */
    private String brand, model,  capacity, paymentMethod;
    private  double price;
    private LocalDate launchDate;
    /**
     * Here declare the constructors for mobile
     * @param brand
     * @param model
     * @param price
     * @param capacity
     * @param launchDate
     * @param paymentMethod
    */

    public Mobile(String brand, String model, double price,String paymentMethod, LocalDate launchDate,String capacity) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setCapacity(capacity);
        setLaunchDate(launchDate);
        setPaymentMethod(paymentMethod);
    }
    /**
    * Get method for Brand and
    * return the value
    * @return 
    */

       public String getBrand() {
        return brand; 
        
    }
    /**
    * this method validates that the Brand of the phone should have some value 
    */
  public void setBrand(String brand) {
      System.out.printf("setBrand of Mobile: Brand '%s'%n",brand );
        if (brand.matches("[A-Z][a-z]*"))
            this.brand = brand;
        else
            throw new IllegalArgumentException("First letter of brand should be in capital letter and it should have any value");
 
    }
    /**
    * Get method for Model and
    * return the value
     * @return 
    */
    public String getModel() {
        return model;
    }
    /**
    * this validates that the Model of the phone 
    * is should not empty
    */

    public void setModel(String model) {
        if (!model.isEmpty())
            this.model = model;
        else
            throw new IllegalArgumentException("Model cannot be empty");
 
    }
  
    /**
    * Get method for Price and
    * return the value
    */

    public double getPrice() {
        return price;
    }
    
    /*
    * this validates that the Price of the phone is less than the 0 
    */

    public void setPrice(double price) {
         if (price > 0)
            this.price = price;
        else
            throw new IllegalArgumentException("Price must be greater than 0"); 
    }
    /**
    * Get method for Capacity and
    * return the value
    */
    public String getCapacity() {
        return capacity;
    }
    
    /**
    * this validates that the Capacity of the phone must not be empty 
    */

    public void setCapacity(String capacity) {
         if (!capacity.isEmpty())
            this.capacity = capacity;
        else
            throw new IllegalArgumentException("Capacity cannot be empty");
  
    }
    /**
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
    
    /**
    * Get method for Payment Method and
    * return the value
    */

    public String getPaymentMethod() {
        return paymentMethod;
    }
    
    /**
    * this validates that the Payment Method of the phone must not be empty 
    */

    public void setPaymentMethod(String paymentMethod) {
        
        if (!paymentMethod.isEmpty())
          this.paymentMethod = paymentMethod;
        else
            throw new IllegalArgumentException("Payment Method cannot be empty");

    }
    
    /**
     * Insert the toString method for variables
     * @return 
     */
    @Override
    public String toString() {
        return "Mobile{" + "brand=" + brand + ", model=" + model +  ", paymentMethod=" + paymentMethod + ", capacity=" + capacity +", price=" + price + ", launchDate=" + launchDate + '}';
    }
    

    
    
      
    }
    

  
    


