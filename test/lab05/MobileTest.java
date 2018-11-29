
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
        validMobile = new Mobile("Apple","Apple 8+","Black",85000.00 ,LocalDate.of(2016, Month.MARCH, 10));
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

    
    @Test
    public void testSetBrand()
    {
         validMobile.setBrand("awsome mobile");
        assertEquals("awsome mobile", validMobile.getBrand());
    }
     /**
     * Test of setBrand method of class Mobile.
     */
    
   @Test
    public void testSetBrandInValid()
    {
        try{
            validMobile.setBrand("");
            fail("An empty String model should have triggered an exception");
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
     * Test of setModelInvalid method of class Mobile.
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
     * Test of GetColor method of class Mobile.
     */
    public void testGetColor()
    {
        
        String expResult = "Black";
        String result = validMobile.getColor();
        assertEquals(expResult, result);
    }
    /**
     * Test of setColor method, of class Mobile.
     */
    @Test
    public void testSetColor()
    {
        validMobile.setColor("awsome color");
        assertEquals("awsome color", validMobile.getColor());
    }
    /**
     * Test of setColorInvalid method, of class Mobile.
     */
    
    @Test
    public void testSetColorInValid()
    {
        try{
            validMobile.setColor("");
            fail("An empty Color should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("Empty string for color: "+ e.getMessage());
        }
    }
    /**
     * Test of getColor method, of class Mobile.
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
     * Test of getLaunchDate method, of class Mobile.
     */
        public void testgetLaunchDate()
    {
        LocalDate expResult = LocalDate.of(2016, Month.MARCH, 12);
        LocalDate result = validMobile.getLaunchDate();
        assertEquals(expResult, result);
    }
       /**
     * Test of setLaunchDate method, of class Instructor.
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
            System.out.println(e.getMessage());
        }
    }
    public void testSetLaunchDateInvalidFuture()
    {
        LocalDate launchDate = LocalDate.of(2020, Month.MARCH, 10) ;
         try{
            validMobile.setLaunchDate(launchDate);
//            fail("A LaunchDate greater than 2000 and shows exception");
        }
        catch (IllegalArgumentException e)
        {
           System.out.println(e.getMessage());
        }
    }


    }
    

   


