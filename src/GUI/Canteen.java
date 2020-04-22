package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Canteen extends Application implements Initializable {


    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("Statistics.fxml"));
            primaryStage.setTitle("Login");
            primaryStage.setScene(new Scene(root, 800 , 500));
            primaryStage.setResizable(false);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}