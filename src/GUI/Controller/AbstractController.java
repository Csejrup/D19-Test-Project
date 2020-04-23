package GUI.Controller;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * This Class Represents an Abstract Controller
 * For all Controller Classes used in this Project
 *
 */
public abstract class AbstractController {
    /**
     * Method loads a new screen and assigns it to the current Stage
     * @param primaryStage
     * @param layoutfile
     */
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
