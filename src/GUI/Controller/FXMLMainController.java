package GUI.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class FXMLMainController extends AbstractController implements Initializable {
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
        Stage stage = (Stage) balanceLabel.getScene().getWindow();
        loadscreen(stage, "LoginGUI.fxml");
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

        Stage stage = (Stage) statisticLabel.getScene().getWindow();
        loadscreen(stage, "Statistics.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
