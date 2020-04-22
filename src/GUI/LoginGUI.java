package GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginGUI extends MainGUI {

    Stage Window;

    @Override
    public void start(Stage stage) throws Exception {
        Window = stage;
        GridPane grid = new GridPane();
        BorderPane MainView = new BorderPane();
        //TEXTFIELD OBJECTS
        TextField PassInput = new TextField();
        TextField NameInput = new TextField();
        //LABEL OBJECTS
        Label PassLabel = new Label("Password");
        Label Username = new Label("Username");
        //ADDITONAL OBJECTS
        Button LoginButton = new Button("Log in");
        Image Logojpg = new Image("Pictures/pasted image 0.png");
        ImageView LogoView = new ImageView(Logojpg);
        try {

            grid.setPadding(new Insets(10, 10, 10, 10));
            grid.setVgap(8);
            grid.setHgap(10);
            GridPane.setConstraints(Username, 0, 0);
            NameInput.setPromptText("Username");
            GridPane.setConstraints(NameInput, 1, 0);
            GridPane.setConstraints(PassLabel, 0, 1);
            PassInput.setPromptText("*******");
            GridPane.setConstraints(PassInput, 1, 1);
            GridPane.setConstraints(LoginButton, 1, 2);
            LogoView.setFitHeight(150);
            LogoView.setFitWidth(70);
            GridPane.setConstraints(LogoView, 3, 0);
            MainView.setLeft(grid);
            MainView.setRight(LogoView);
            grid.getChildren().addAll(Username, NameInput, PassInput, PassLabel, LoginButton);
            Scene scene = new Scene(MainView, 350, 300);
            stage.setResizable(false);
            Window.setScene(scene);
            Window.setTitle("Log in");
            Window.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
