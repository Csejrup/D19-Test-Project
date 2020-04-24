package GUI.Controller;

import DataBase.DB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * Controller for ProductGUI.fxml
 * Handles Product Actions
 */
public class FXMLProductController extends AbstractController {
    /*----------------------------------------All FXML Button, Field, Label Declaration-----------------------*/

    @FXML private ImageView menu, coffee1, coke1, water1, burger, apple, milk;

    @FXML private Button btnCheckOut, btnMainMenu;

    @FXML private Label colaQTY, coffeeQTY, waterQTY, foodQTY, fruitsQTY, milkQTY;

    /*----------------------------------------All FXML Button, Field, Label Declaration-----------------------*/
    String showMilkQTY;
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
            try {
                DB.selectSQL("SELECT fldQuantity From tblStorage where fldProductName = '" + productName + "'");
                showMilkQTY = DB.getData();
                int actQTY = Integer.parseInt(showMilkQTY) - 1;
                cleardata();
                DB.updateSQL("UPDATE tblStorage SET fldQuantity =" + actQTY + "WHERE fldProductName='" + productName + "'");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return showMilkQTY;
        }
        private String firsShowUP (String productName){
            try {
                DB.selectSQL("SELECT fldQuantity From tblStorage where fldProductName = '" + productName + "'");
                showMilkQTY = DB.getData();
                cleardata();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return showMilkQTY;
        }
        public void MilkEvent (MouseEvent event){
            get("Milk");
            milkQTY.setText(showMilkQTY);
        }

        public void FruitEvent (MouseEvent event){
            get("Fruits");
            fruitsQTY.setText("In Stock: "+showMilkQTY);
        }

        public void FoodEvent (MouseEvent event){
            get("Burgers");
            foodQTY.setText("In Stock: "+showMilkQTY);
        }

        public void WatterEvent (MouseEvent event){
            get("Water");
            waterQTY.setText("In Stock: "+showMilkQTY);
        }
        public void ColaEvent (MouseEvent event){
            get("Coca Cola");
            colaQTY.setText("In Stock: "+showMilkQTY);
        }
        public void CoffeeEvent (MouseEvent event){
            get("Coffee");
            coffeeQTY.setText("In Stock: "+showMilkQTY);
        }
        public void putLabelstog (MouseEvent event){
            firsShowUP("Milk");
            milkQTY.setText("In Stock: "+showMilkQTY);
            firsShowUP("Water");
            waterQTY.setText("In Stock: "+showMilkQTY);
            firsShowUP("Coffee");
            coffeeQTY.setText("In Stock: "+showMilkQTY);
            firsShowUP("Coca Cola");
            colaQTY.setText("In Stock: "+showMilkQTY);
            firsShowUP("Fruits");
            fruitsQTY.setText("In Stock: "+showMilkQTY);
            firsShowUP("Burgers");
            foodQTY.setText("In Stock: "+showMilkQTY);
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


