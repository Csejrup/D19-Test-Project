package GUI.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import DataBase.DB;

/**
 * FXML CONTROLLER CLASS
 * FOR LoginGUI.FXML
 *
 */
public class FXMLLoginController extends AbstractController implements Initializable
{

    /*----------------------------------------All FXML Button, Field, RadioButton,Label Declaration-----------------------*/

    @FXML private Label info1;
    @FXML private TextField usernameTextfield;
    @FXML private PasswordField passwordTextfield;
    @FXML private Button loginBtn;
    /*----------------------------------------All FXML Button, Field, RadioButton,Label Declaration-----------------------*/

    @FXML
    void handleLogin(ActionEvent event) throws IOException
    {
        //(passwordTextfield.getText().equals("1234") && usernameTextfield.getText().equals("johnwick")
        if(passwordTextfield.getText().equals(""))
        {

          Stage mainWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
            loadscreen(mainWindow, "MainGUI.fxml");
        }
        else
        {
            info1.setText("Password is incorrect. Please Try Again");
        }
    }
///////////////
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
