
package lab05;

import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class CreateMobileFXMLController implements Initializable {
// Insert TextField for Brand, Model and Price
    @FXML
    private ComboBox brandComboBox;

    @FXML
    private TextField ModelTextField;

    @FXML
    private TextField priceTextField;

//  @FXML   private ColorPicker mobileColorPicker;
  
//Below items the RadioButton for capacity  
    @FXML
    private RadioButton GB16radioButton;

    @FXML
    private RadioButton GB32radioButton;

    @FXML
    private RadioButton GB64radioButton;

    @FXML
    private RadioButton GB128radioButton;

    @FXML
    private RadioButton GB256radioButton;

    // Insert label for RadioButton
    @FXML
    private Label radioButtonLabel;

    // Insert DatePicker and Label for launchDate
    @FXML
    private DatePicker launchDatePicker;
    
     @FXML private Label datePickerLabel;
    
    // Insert ChoiceBox for PaymentMethod, Label and PaymentMethod

    @FXML
    private ChoiceBox<String> paymentChoiceBox;
    
    @FXML
    private Label ChoiceBoxLabel;

    @FXML
    private Button insertPaymentButton;
        
   
    @FXML private ToggleGroup CapacityToggleGroup;

 @FXML
    private Label errorMsgLabel;
 
 @FXML
    private ImageView launchImageView;


  
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
     public void initialize(URL url, ResourceBundle rb) {
         
//         ChoiceBoxLabel.setText("");
       brandComboBox.getItems().add("Apple");
       brandComboBox.getItems().add("Samsung");
       brandComboBox.getItems().add("Micromax");
       brandComboBox.getItems().add("Redmi");
       brandComboBox.getItems().add("LG");  
       brandComboBox.setValue("Select Brand");
         
        // These items for checkbox labels
 
       paymentChoiceBox.getItems().add("DebitCard");
       paymentChoiceBox.getItems().add("CreditCard");
       paymentChoiceBox.getItems().add("Cash");
       paymentChoiceBox.getItems().add("DirectDeposit");
       paymentChoiceBox.getItems().add("BankTransfer");  
       paymentChoiceBox.setValue("Select Method");
       
        CapacityToggleGroup = new ToggleGroup();
        radioButtonLabel.setText("");
        this.GB16radioButton.setToggleGroup(CapacityToggleGroup);
        this.GB32radioButton.setToggleGroup(CapacityToggleGroup);
        this.GB64radioButton.setToggleGroup(CapacityToggleGroup);
        this.GB128radioButton.setToggleGroup(CapacityToggleGroup);
        this.GB256radioButton.setToggleGroup(CapacityToggleGroup);
        
         errorMsgLabel.setText("");
         datePickerLabel.setText("");
         ChoiceBoxLabel.setText("");
         

     }
    public void choiceBoxButtonPushed(){
     ChoiceBoxLabel.setText("" +paymentChoiceBox.getValue());  
   }
    /**
     * Below Items for LaunchDatePicker
     */
    public void datePickerPushed(){
       String dateText;
       
       if(launchDatePicker.getValue() != null)
       {
       int year = Period.between(launchDatePicker.getValue(), LocalDate.now()).getYears();
       int month = Period.between(launchDatePicker.getValue(), LocalDate.now()).getMonths();
       int day = Period.between(launchDatePicker.getValue(), LocalDate.now()).getDays();
      
       if (year == 0)
       {
        dateText = String.format("%d months , %d days", month, day);
       }
       else if(year < 0 || month < 0 || day < 0)
           dateText = "Mobile is not launch till";
       else 
           dateText = String.format("%d Launch year", year);
       this.datePickerLabel.setText(dateText);
       
    }
    
    }  
  /**
  * these items for set RadioButtons for mobile  
  * insert different value which are given to radioButtons
  */
   
   public void radioButtonChanged()
    {
        radioButtonLabel.setText("You choose capacity:\n" +radioButtonLabel.getText().toString());
        if (this.CapacityToggleGroup.getSelectedToggle().equals(this.GB16radioButton))
            radioButtonLabel.setText("Phone have 16GB Capacity ");
        
        if (this.CapacityToggleGroup.getSelectedToggle().equals(this.GB32radioButton))
            radioButtonLabel.setText("Phone have 32GB Capacity");
        
        if (this.CapacityToggleGroup.getSelectedToggle().equals(this.GB64radioButton))
            radioButtonLabel.setText("Phone have 64GB Capacity");
        
        if (this.CapacityToggleGroup.getSelectedToggle().equals(this.GB128radioButton))
            radioButtonLabel.setText("Phone have 128GB Capacity");
        
         if (this.CapacityToggleGroup.getSelectedToggle().equals(this.GB256radioButton))
            radioButtonLabel.setText("Phone have 256GB Capacity");

    }
   
   @FXML
    public void PaymentImageChanger()
    {
       String Payment = paymentChoiceBox.getValue();
        if (Payment.equalsIgnoreCase("DebitCard"))
            launchImageView.setImage(new Image("./Images/debit.png"));
        else if (Payment.equalsIgnoreCase("CreditCard"))
            launchImageView.setImage(new Image("./Images/credit.jpg"));
         else if (Payment.equalsIgnoreCase("Cash"))
            launchImageView.setImage(new Image("./Images/cash.png"));
          else if (Payment.equalsIgnoreCase("DirectDeposit"))
            launchImageView.setImage(new Image("./Images/direct.jpg"));
        else
           launchImageView.setImage(new Image("./Images/bank.png"));
       
       
    }
 
   /**
    * this will insert the label for the radioButton
    */

  
    @FXML
    public void LaunchMobileButtonPushed()
    {
        
        if (this.launchDatePicker.getValue() != null)
        {
            try{
                System.out.printf("Get Mobile: Brand '%s'%n",brandComboBox.getValue() );
                
                Mobile newMobile = new Mobile(
                                        (String) this.brandComboBox.getValue(),
                                        this.ModelTextField.getText(),
                                        Integer.parseInt(priceTextField.getText()),
                                        this.paymentChoiceBox.getValue(),
                                        this.launchDatePicker.getValue(),
                                       
                           ((RadioButton) CapacityToggleGroup.getSelectedToggle()).getText());
           
                System.out.println(newMobile);
            } catch (IllegalArgumentException e)
            {
                errorMsgLabel.setText(e.getMessage());
            }
        }
        else
        {
            errorMsgLabel.setText("Please Provide your correct Info.");
        }
   
}
}
    
    
            
    
