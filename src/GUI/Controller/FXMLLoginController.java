package GUI.Controller;

import Domain.Accounts.Account;
import Domain.Accounts.Manager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import DataBase.DB;
public class FXMLLoginController extends AbstractController implements Initializable
{
    @FXML
    private Label info1;

    @FXML
    private TextField usernameTextfield;

    @FXML
    private TextField passwordTextfield;

    @FXML
    private Button loginBtn;
    @FXML
    void handleLogin(ActionEvent event) throws IOException
    {
        String username = usernameTextfield.getText();
        String password = passwordTextfield.getText();
        Manager manager = new Manager();
        Account ac = new Account();
        if(ac.verifyLogin(username, password))
        { Stage mainWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
            loadscreen(mainWindow, "MainGUI.fxml"); }
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
