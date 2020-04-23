package GUI.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class FXMLProductController extends AbstractController {
    @FXML
    private Label mainmenuLabel;

    @FXML
    private Label checkoutLabel;
    @FXML
    private ImageView cart;

    @FXML
    private ImageView menu;

    @FXML
    private ImageView coffee1;

    @FXML
    private ImageView coke1;

    @FXML
    private ImageView water1;

    @FXML
    private ImageView burger;

    @FXML
    private ImageView apple;

    @FXML
    private ImageView milk;

    @FXML
    void addItem(MouseEvent event) {

    }

    @FXML
    void checkoutProducts(MouseEvent event) {
        System.out.println("HEJ");
    }

    @FXML
    void showMainMenu(MouseEvent event) {
        System.out.println("HEJ");
        Stage stage = (Stage) mainmenuLabel.getScene().getWindow();
        loadscreen(stage, "MainGUI.fxml");
    }

    @FXML
    void showSettings(MouseEvent event) {

    }
}