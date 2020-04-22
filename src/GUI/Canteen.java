package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Canteen extends Application {


    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("LoginGUI.fxml"));
            primaryStage.setTitle("Login");
            primaryStage.setScene(new Scene(root, 800 , 500));
            primaryStage.setResizable(false);
            primaryStage.show();
////////////
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}