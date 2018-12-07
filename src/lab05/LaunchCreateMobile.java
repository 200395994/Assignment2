
package lab05;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Ravneet Bhullar
 */
public class LaunchCreateMobile extends Application {
    
     public static void main(String[] args){
        launch (args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("CreateMobileFXML.fxml"));
       Scene scene = new Scene(root);
       primaryStage.setScene(scene);
       primaryStage.setTitle("Get your Mobile ");
       primaryStage.show(); 
    }
   
}
