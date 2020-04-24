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
    String showMilkQTY;
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

    private String get(String productName){
        DB.selectSQL("SELECT fldQuantity From tblStorage where fldProductName = '"+productName +"'");
         showMilkQTY = DB.getData();
         int actQTY = Integer.parseInt(showMilkQTY)-1;
       // DB.updateSQL("UPDATE tblStorage SET fldQuantity ="+actQTY+"WHERE fldProductName='"+productName+"'");

        return showMilkQTY;
    }

   

    public void MilkEvent(MouseEvent event) {
        get("Milk");
        milkQTY.setText(showMilkQTY);
    }

    public void FruitEvent(MouseEvent event) { get("Fruits");
    fruitsQTY.setText(showMilkQTY);
    }

    public void FoodEvent(MouseEvent event) { get("Burgers");
    foodQTY.setText(showMilkQTY);
    }

    public void WatterEvent(MouseEvent event) { get("Water");
    waterQTY.setText(showMilkQTY);}

    public void ColaEvent(MouseEvent event) { get("Coca Cola");
    colaQTY.setText(showMilkQTY);}

    public void CoffeeEvent(MouseEvent event) { get("Coffee");
    coffeeQTY.setText(showMilkQTY);}
}




