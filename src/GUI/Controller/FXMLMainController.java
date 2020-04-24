package GUI.Controller;

import Domain.Accounts.Account;

import javafx.event.ActionEvent;

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
/**
 * FXML CONTROLLER CLASS
 * FOR MainGUI.fxml
 */


public class FXMLMainController extends AbstractController implements Initializable {

    Account ac = new Account();
    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    /*----------------------------------------All FXML Button, Field, RadioButton,Label Declaration, ImageView-----------------------*/


    @FXML private ImageView image1, image2, image3, image4;
    @FXML private Button btnProducts, btnBalance, btnStatistic;

    /*----------------------------------------All FXML Button, Field, RadioButton,Label Declaration, ImageView-----------------------*/
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
    void showProducts(ActionEvent event) {
        System.out.println("HEJ");
        Stage stage = (Stage) btnProducts.getScene().getWindow();
        loadscreen(stage, "ProductGUI.fxml");
    }

    @FXML
    void showFood(MouseEvent event) {
=======
    void showStatistics(ActionEvent event) {
        Stage stage = (Stage) btnStatistic.getScene().getWindow();
        loadscreen(stage, "StatisticGUI.fxml");
    }

    @FXML
    void showSettings(MouseEvent event) {
        System.out.println("HEJ");
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
