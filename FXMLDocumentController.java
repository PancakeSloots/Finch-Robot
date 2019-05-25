/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmlapplication;

//import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 *
 * @author ktsei
 */
public class FXMLDocumentController implements Initializable {
    
   // public static Finch deadFinch = new Finch();
    
    private Label label;
    @FXML
    private TitledPane titlePaneColor;
    @FXML
    private RadioButton radioButton0;
    @FXML
    private RadioButton radioButton1;
    @FXML
    private RadioButton radioButton2;
    @FXML
    private Button colorButton;
    @FXML
    private TitledPane tempPane;
    @FXML
    private Button tempButton;
    @FXML
    private ImageView thermometerImage;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (radioButton0.isSelected())
            ///deadFinch.setLED(java.awt.Color.red);
        System.out.println("You turned the beak Red!");
        if (radioButton1.isSelected())
           // deadFinch.setLED(java.awt.Color.blue);
        System.out.println("You turned the beak Blue!");
        if (radioButton2.isSelected())
          //  deadFinch.setLED(java.awt.Color.green);
        System.out.println("You turned the beak Green!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction2(ActionEvent event) {
      //  double temp = deadFinch.getTemperature();
       // deadFinch.saySomething("The temperature is" + temp);
    }

    @FXML
    private void handleButtonAction2(MouseEvent event) {
     //   double temp = deadFinch.getTemperature();
     //   deadFinch.saySomething("The temperature is" + temp);
    }
    
}
