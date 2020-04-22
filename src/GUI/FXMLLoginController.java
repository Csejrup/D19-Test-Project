package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class FXMLLoginController
{
    @FXML
    private Label info1;

    @FXML
    private TextField usernameTextfield;

    @FXML
    private PasswordField passwordTextfield;

    @FXML
    private Button loginBtn;



    @FXML
    void handleLogin(ActionEvent event) throws IOException
    {
        if(passwordTextfield.getText().equals("1234"))
        {
            Stage mainStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("MainGUI.fxml"));
            mainStage.setTitle("ECCO CANTEEN");
            mainStage.setScene(new Scene(root, 1200,800));
            mainStage.setResizable(false);
            mainStage.show();
        }
        else
        {
            info1.setText("Password is incorrect. Please Try Again");
        }
    }
}
