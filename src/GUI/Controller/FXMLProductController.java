package GUI.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class FXMLProductController extends AbstractController {
    /*----------------------------------------All FXML Button, Field, RadioButton,Label Declaration-----------------------*/

    @FXML private ImageView cart, menu, coffee1, coke1, water1, burger, apple, milk;
    @FXML private Button btnCheckOut, btnMainMenu;

    /*----------------------------------------All FXML Button, Field, RadioButton,Label Declaration-----------------------*/
    @FXML
    void checkoutProducts(ActionEvent event) {
        System.out.println("HEJ");
    }

    @FXML
    void showMainMenu(ActionEvent event) {
        System.out.println("HEJ");
        Stage stage = (Stage) btnMainMenu.getScene().getWindow();
        loadscreen(stage, "MainGUI.fxml");
    }
    @FXML
    void addItem(MouseEvent event) {

    }
    @FXML
    void showSettings(MouseEvent event) {

    }
}