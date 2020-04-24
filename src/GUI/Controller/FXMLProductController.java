package GUI.Controller;

import DataBase.DB;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * Controller for ProductGUI.fxml
 * Handles Product Actions
 */
public class FXMLProductController extends AbstractController {
    /*----------------------------------------All FXML Button, Field, Label Declaration-----------------------*/

    @FXML
    private ImageView menu, coffee1, coke1, water1, burger, apple, milk;
    @FXML
    private Button btnCheckOut, btnMainMenu;
    @FXML
    private Label colaQTY, coffeeQTY, waterQTY, foodQTY, fruitsQTY, milkQTY;
    String showMilkQTY;

    /*----------------------------------------All FXML Button, Field, Label Declaration-----------------------*/

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

       // int actQTY = Integer.parseInt(showMilkQTY);
      //  int newQTY = (actQTY-1);
       // DB.updateSQL("UPDATE tblStorage SET fldQuantity ="+actQTY+"WHERE fldProductName='"+productName+"'");
    private String get(String productName) {
        try {
        DB.selectSQL("SELECT fldQuantity From tblStorage where fldProductName = '" + productName + "'");
        showMilkQTY = DB.getData();
        int actQTY = Integer.parseInt(showMilkQTY) - 1;
        cleardata();
        DB.updateSQL("UPDATE tblStorage SET fldQuantity ="+actQTY+"WHERE fldProductName='"+productName+"'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return showMilkQTY;

    }
    private String firsShowUP(String productName){
        try {
            DB.selectSQL("SELECT fldQuantity From tblStorage where fldProductName = '" + productName + "'");
            showMilkQTY = DB.getData();
            cleardata();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return showMilkQTY;
    }


    public void MilkEvent(MouseEvent event) {
        get("Milk");
        milkQTY.setText(showMilkQTY);
    }

    public void FruitEvent(MouseEvent event) {
        get("Fruits");
        fruitsQTY.setText(showMilkQTY);
    }

    public void FoodEvent(MouseEvent event) {
        get("Burgers");
        foodQTY.setText(showMilkQTY);
    }

    public void WatterEvent(MouseEvent event) {
        get("Water");
        waterQTY.setText(showMilkQTY);
    }

    public void ColaEvent(MouseEvent event) {
        get("Coca Cola");
        colaQTY.setText(showMilkQTY);
    }

    public void CoffeeEvent(MouseEvent event) {
        get("Coffee");
        coffeeQTY.setText(showMilkQTY);
    }
    public void putLabelstog(MouseEvent event) {
        firsShowUP("Milk");
        milkQTY.setText(showMilkQTY);
        firsShowUP("Water");
        waterQTY.setText(showMilkQTY);
        firsShowUP("Coffee");
        coffeeQTY.setText(showMilkQTY);
        firsShowUP("Coca Cola");
        colaQTY.setText(showMilkQTY);
        firsShowUP("Fruits");
        fruitsQTY.setText(showMilkQTY);
        firsShowUP("Burgers");
        foodQTY.setText(showMilkQTY);
    }
      private static void cleardata() {
        do {
            String data = DB.getData();
            if (data.equals(DB.NOMOREDATA)) {
                break;
            }
        } while (true);
    }
}


