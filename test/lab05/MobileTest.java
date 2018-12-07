
package lab05;

import java.time.LocalDate;
import java.time.Month;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ravneet Bhullar
 */
public class MobileTest {
    Mobile validMobile;
    public MobileTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        validMobile = new Mobile("Apple","Apple 8+",85000.00 ,"Debit Card",LocalDate.of(2016, Month.MARCH, 10), "64GB");
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Test of GetBrand method, of class Mobile.
     */
    public void testGetBrand()
    {
        String expResult = "Apple";
        String result = validMobile.getBrand();
        assertEquals(expResult, result);
    }
    
    
//        /**
//     * Test of toString method, of class 
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//       
//        String expResult = "Mobile{}";
//        String result = validMobile.toString();
//        assertEquals(expResult, result);
//    }
    /**
     * Test of setBrand method, of class Mobile.
     */

    @Test
    public void testSetBrand()
    {
         validMobile.setBrand("Mobile");
         String result = validMobile.getBrand();
        assertEquals("Mobile",result);
    }
     /**
     * Test of setBrand with Invalid method of class Mobile.
     */
    
   @Test
    public void testSetBrandInValid()
    {
        try{
            validMobile.setBrand("");
            fail("An empty String Brand should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("Empty string for brand: "+ e.getMessage());
        }
    }
   /**
     * Test of GetModel method, of class Mobile.
     */
    
    public void testGetModel()
    {
        
        String expResult = "Apple 8+";
        String result = validMobile.getModel();
        assertEquals(expResult, result);
    }

    /**
     * Test of setModel method of class Mobile.
     */
    @Test
    public void testSetModel()
    {
        validMobile.setModel("awsome model");
        assertEquals("awsome model", validMobile.getModel());
    }
    /**
     * Test of setModel method of class Mobile with an Invalid input.
     */
    
    @Test
    public void testSetModelInValid()
    {
        try{
            validMobile.setModel("");
            fail("An empty String model should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("Empty string for model: "+ e.getMessage());
        }
    }
    
    /**
     * Test of getPrice method, of class Mobile.
     */
    @Test
    public void getPrice()
    {
        double expResult = 85000.00;
        double result = validMobile.getPrice();
        assertEquals(expResult, result, 0);
    }

   /**
     * Test of setPrice method, of class Mobile.
     */
    @Test
    public void testSetPrice()
    {
        double price = -1;
        try{
            validMobile.setPrice(price);
            fail("Price must be greater than 0");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
    /**
     * Test of getPayment method, of class Mobile.
     */
    @Test
    public void testGetPaymentMethod()
    {
        String expResult = "Debit Card";
        String result = validMobile.getPaymentMethod();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPaymentMethod, of class Mobile.
     */
    @Test
    public void testSetPaymentMethod()
    {
        validMobile.setPaymentMethod("Debit Card");
        assertEquals("Debit Card", validMobile.getPaymentMethod());
    }
    
    /**
     * Test of setMethod method, of class Mobile with an invalid input.
     */
    @Test
    public void testSetPaymentMethodInvalid()
    {
        try{
            validMobile.setPaymentMethod("");
            fail("setPayment method with an empty argument should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

     /**
     * Test of getLaunchDate method, of class Mobile.
     */
        public void testgetLaunchDate()
    {
        LocalDate expResult = LocalDate.of(2016, Month.MARCH, 12);
        LocalDate result = validMobile.getLaunchDate();
        assertEquals(expResult, result);
    }
       /**
     * Test of setLaunchDate method, of class Mobile.
     */
    @Test
    public void testSetLaunchDate()
    {
        LocalDate launchDate = LocalDate.of(2016, Month.MARCH, 10);
        validMobile.setLaunchDate(launchDate);
        assertEquals(launchDate, validMobile.getLaunchDate());
    }
    
    /**
     * Test of setLaunchDateInvalid method, of class Mobile.
     */
    @Test
    public void testSetLaunchDateInvalid()
    {
        LocalDate launchDate = LocalDate.of(1999, Month.MARCH, 10)  ;
        try{
            validMobile.setLaunchDate(launchDate);
            fail("A LaunchDate less than 2000 and shows exception");
        } catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    public void testSetLaunchDateInvalidPast()
    {
        LocalDate launchDate = LocalDate.of(1899, Month.MARCH, 10) ;
         try{
            validMobile.setLaunchDate(launchDate);
            fail("A LaunchDate greater than 2000 and shows exception");
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("launch date for mobile: "+ e.getMessage());
        }
    }
     
    /**
     * Test of getCapacity method, of class Mobile.
     */
    @Test
    public void testGetCapacity()
    {
        String expResult = "64GB";
        String result = validMobile.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCapacity method, of class Mobile.
     */
    @Test
    public void testSetCapacity()
    {
        System.out.print("testSetCapacity");
        validMobile.setCapacity("64GB");
        assertEquals("64GB", validMobile.getCapacity());
    }
   
 
    
    /**
     * Test of setCapacity method, of class Mobile with an invalid input.
     */
    @Test
    public void testSetCapacityInvalid()
    {
        try{
            validMobile.setCapacity("");
            fail("setCapacity method with an empty argument should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
   


    }
    
