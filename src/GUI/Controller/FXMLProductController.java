package GUI.Controller;

import DataBase.DB;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class FXMLProductController extends AbstractController {
    /*----------------------------------------All FXML Button, Field, RadioButton,Label Declaration-----------------------*/

    @FXML
    private ImageView menu, coffee1, coke1, water1, burger, apple, milk;
    @FXML
    private Button btnCheckOut, btnMainMenu;
    @FXML
    private Label colaQTY, coffeeQTY, waterQTY, foodQTY, fruitsQTY, milkQTY;

    /*----------------------------------------All FXML Button, Field, RadioButton,Label Declaration-----------------------*/
    @FXML
    void checkoutProducts(ActionEvent event) {
        System.out.println("HEJ");
    }

    @FXML
    void showMainMenu(ActionEvent event) {
        System.out.println("HEJ");
        Stage stage = (Stage) btnMainMenu.getScene().getWindow();
        loadscreen(stage, "MainGUI.fxml");
    }

    @FXML
    void addItem(MouseEvent event) {

    }

    @FXML
    void showSettings(MouseEvent event) {

    }



   

    public void MilkEvent(MouseEvent event) {
        DB.selectSQL("SELECT fldQuantity From tblStorage where fldProductName = 'Milk'");
        String showMilkQTY = DB.getData();
        milkQTY.setText(showMilkQTY);
        int actQTY = Integer.parseInt(showMilkQTY)-1;
        DB.updateSQL("UPDATE tblStorage SET fldQuantity ="+actQTY+"WHERE fldProductName='Milk'");
    }

    public void FruitEvent(MouseEvent event) {
        DB.selectSQL("SELECT fldQuantity From tblStorage where fldProductName = 'Fruits'");
        String showMilkQTY = DB.getData();
        fruitsQTY.setText(showMilkQTY);
    }

    public void FoodEvent(MouseEvent event) {
        DB.selectSQL("SELECT fldQuantity From tblStorage where fldProductName = 'Burgers'");
        String showMilkQTY = DB.getData();
        foodQTY.setText(showMilkQTY);
    }

    public void WatterEvent(MouseEvent event) {
        DB.selectSQL("SELECT fldQuantity From tblStorage where fldProductName = 'Water'");
        String showMilkQTY = DB.getData();
        int actQTY = Integer.parseInt(showMilkQTY)-1;
        waterQTY.setText(showMilkQTY);
        System.out.println(actQTY);
        DB.updateSQL("Update tblStorage set fldQuantity =  where fldProductName = 'Water'");
    }

    public void ColaEvent(MouseEvent event) {
        DB.selectSQL("SELECT fldQuantity From tblStorage where fldProductName = 'Coca Cola'");
        String showMilkQTY = DB.getData();
        colaQTY.setText(showMilkQTY);
    }

    public void CoffeeEvent(MouseEvent event) {
        DB.selectSQL("SELECT fldQuantity From tblStorage where fldProductName = 'Coffee'");
        String showMilkQTY = DB.getData();
        coffeeQTY.setText(showMilkQTY);
    }
}




