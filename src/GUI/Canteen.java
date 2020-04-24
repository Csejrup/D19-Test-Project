package GUI;

import Domain.SystemControll.System;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
/**
 * @Author Casper Sejrup, Filip Calaforra and (Ja)Kuba Nowak
 * EASV D19
 * Training Project (Duration 10 DAYS)
 *
 * This Program starts up a User Friendly Interface
 * For Canteen Employees and Managers for ECCO
 * You can Buy Products in the Canteen through ID Card
 * You can look up statistics of how many products are sold for each day
 * You can look up how many 'In stock' there is of a specific Product
 *
 * GUI Made IN JAVAFX - SOFTWARE USED, INTELLIJ AND SCENEBUILDER
 */
public class Canteen extends Application {
    public static void main(String[] args) { launch(args); }
    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("layouts/LoginGUI.fxml"));
            primaryStage.setTitle("Login");
            primaryStage.setScene(new Scene(root, 800 , 500));
            primaryStage.setResizable(false);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}