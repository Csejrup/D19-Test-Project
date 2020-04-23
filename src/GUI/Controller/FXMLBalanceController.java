package GUI.Controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLBalanceController extends AbstractController{
    /*----------------------------------------All FXML Button, Field, RadioButton,Label Declaration-----------------------*/

    @FXML private TextField amountTextField;
    @FXML private Button btnOK, BtnViewBalance, btnMainMenu;
    @FXML private ListView<?> balanceListView;



    /*----------------------------------------All FXML Button, Field, RadioButton,Label Declaration-----------------------*/
    @FXML
    void handleAddBalance(ActionEvent event) {

    }

    @FXML
    void handleViewBalance(ActionEvent event) {

    }
    @FXML
    void showMainMenu(ActionEvent event) {
        System.out.println("HEJ");
        Stage stage = (Stage) btnMainMenu.getScene().getWindow();
        loadscreen(stage, "MainGUI.fxml");
    }
}
