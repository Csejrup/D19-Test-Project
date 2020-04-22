package GUI.Controller;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public abstract class AbstractController {

    protected void loadscreen(Stage primaryStage, String layoutfile){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/GUI/layouts/" + layoutfile));
            Scene scene = new Scene(root);
            primaryStage.setTitle("ECCO Canteen");
            primaryStage.setScene(scene);
            primaryStage.show();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
