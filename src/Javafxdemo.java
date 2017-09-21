/**
 * Purpose: compare between Joptional input dialoge box and javafax
 * Author: Sriti Ahmed
 * Date:09/21/2017
 */

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.Optional;

public class Javafxdemo extends Application {

    public void start (Stage primaryStage){
        //Swing input Dialoge
        String height = JOptionPane.showInputDialog("Enter your height");

        //java fx input dialoge
        TextInputDialog textInputDialog = new TextInputDialog( "140.5");
        textInputDialog.setTitle("Metrics Converters");
        textInputDialog.setHeaderText("Centemeters to feet and Inches Converters");
        textInputDialog.setContentText("Enter your height in Centimeters");
        Optional<String> result =textInputDialog.showAndWait();

        //logic for java fx
        double heightInCm = 120.5;
        double heightInInches = heightInCm*0.39;
        int heightInFeet = (int) (heightInInches/12);
        int remainderHeightInInches = (int)heightInInches%12;


        //logic for swing

        double heightInCmSwing = 120.5;
        double heightInInchesSwing = heightInCm*0.39;
        int heightInFeetSwing = (int) (heightInInches/12);
        int remainderHeightInInchesSwing = (int)heightInInches%12;

        //use swing to display information
        JOptionPane.showMessageDialog(null,"your hight is" +heightInFeetSwing + "feet" + remainderHeightInInchesSwing + "inches");


         //use java fx to display information
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
         alert.setTitle("Height Converter");
         alert.setHeaderText("your height is");
         alert.setContentText(heightInFeet + "feet" + remainderHeightInInches + "inches");
         alert.showAndWait();
    }



}

