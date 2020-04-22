package GUI;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.io.IOException;


public class FXMLMainController {
    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    @FXML
    private ImageView image3;

    @FXML
    private ImageView image4;

    @FXML
    private Label drinksLabel;

    @FXML
    private Label statisticLabel;

    @FXML
    private Label foodLabel;

    @FXML
    private Label balanceLabel;


    @FXML
    void showBalance(MouseEvent event) {
        System.out.println("HEJ");
    }

    @FXML
    void showDrinks(MouseEvent event) {
        System.out.println("HEJ");
    }

    @FXML
    void showFood(MouseEvent event) {
        System.out.println("HEJ");
    }

    @FXML
    void showSettings(MouseEvent event) {
        System.out.println("HEJ");
    }

    @FXML
    void showStatistics(MouseEvent event) { System.out.println("HEJ");
    }

}
