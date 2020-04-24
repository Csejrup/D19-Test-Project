package GUI.Controller;


import Domain.Accounts.CanteenEmploy;
import Domain.Accounts.Manager;

import Domain.SystemControll.System;

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
 * Handles Login Actions
 */
public class FXMLLoginController extends AbstractController
{
    /*----------------------------------------All FXML Button, Field, Label Declaration-----------------------*/

    @FXML private Label info1;
    @FXML private TextField usernameTextfield;
    @FXML private PasswordField passwordTextfield;
    @FXML private Button loginBtn;
    /*----------------------------------------All FXML Button, Field, Label Declaration-----------------------*/
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
}
