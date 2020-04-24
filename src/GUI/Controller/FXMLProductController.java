package GUI.Controller;

import DataBase.DB;
import Domain.Products.Product;
import Domain.SystemControll.Shopping_Basket;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * Controller for ProductGUI.fxml
 * Handles Product Actions
 */
public class FXMLProductController extends AbstractController {
    Product product = new Product();
    Shopping_Basket sh = new Shopping_Basket();
    /*----------------------------------------All FXML Button, Field, Label Declaration-----------------------*/

    @FXML
    private ImageView menu, coffee1, coke1, water1, burger, apple, milk;
    @FXML
    private Button btnCheckOut, btnMainMenu;
    @FXML
    private Label colaQTY, coffeeQTY, waterQTY, foodQTY, fruitsQTY, milkQTY;
    @FXML
            private Label fldTotalPrice;
    @FXML
            private TextField fldCardID;
    String showMilkQTY;
    float total;

    /*----------------------------------------All FXML Button, Field, Label Declaration-----------------------*/

    @FXML
    void Checkout(ActionEvent event){
        btnCheckOut.setOnMouseClicked(e->{
           String CardID = fldCardID.getText();
            DB.selectSQL("SELECT fldBalance FROM tblCard WHERE fldCardID = '"+CardID+"'");
            float AccBalance = Float.parseFloat(DB.getData());
            cleardata();
            if(AccBalance>=total){
                    AccBalance = AccBalance-total;
                System.out.println(AccBalance);
                DB.insertSQL("UPDATE tblCard set fldBalance = '"+AccBalance+"' WHERE fldCardID = '"+CardID+"'");
                total = 0;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("TRANSACTION COMPLETED");
                alert.show();
            }
            else {
                Alert at = new Alert(Alert.AlertType.ERROR);
                at.setContentText("TRANSACION DECLINED: NOT ENOUGHT MONEY");
                at.show();
            } });
    }
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
    void addCoffeToBasket(MouseEvent event) {
            coffee1.setOnMouseClicked(e->{
              float coffePrice =   product.get_PRICE(27);
              total = total+coffePrice;
              fldTotalPrice.setText(String.valueOf(total));
            });
    }
    @FXML
    void addBurgerToBasket(MouseEvent event){
        burger.setOnMouseClicked(e->{
            float burgerPrice = product.get_PRICE(25);
            total = total+burgerPrice;
            fldTotalPrice.setText(String.valueOf(total));
        });
    }
    @FXML
    void addWaterToBasket(MouseEvent event){
        water1.setOnMouseClicked(e->{
            float waterPrice = product.get_PRICE(28);
            total = total+waterPrice;
            fldTotalPrice.setText(String.valueOf(total));
        });
    }
    @FXML
    void addApple(){
        apple.setOnMouseClicked(e->{
            float applePrice = product.get_PRICE(29);
            total = total+applePrice;
            fldTotalPrice.setText(String.valueOf(total));
        });
    }
    @FXML
    void addCocaCola(){
        coke1.setOnMouseClicked(e->{
            float cokeprice = product.get_PRICE(7);
            total = total+cokeprice;
            fldTotalPrice.setText(String.valueOf(total));
        });
    }
    @FXML
    void addMilk(){
        milk.setOnMouseClicked(e->{
            float milkPrice = product.get_PRICE(8);
            total = total+milkPrice;
            fldTotalPrice.setText(String.valueOf(total));
        });
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
            fruitsQTY.setText(showMilkQTY);
        }

        public void FoodEvent (MouseEvent event){
            get("Burgers");
            foodQTY.setText(showMilkQTY);
        }

        public void WatterEvent (MouseEvent event){
            get("Water");
            waterQTY.setText(showMilkQTY);
        }
        public void ColaEvent (MouseEvent event){
            get("Coca Cola");
            colaQTY.setText(showMilkQTY);
        }
        public void CoffeeEvent (MouseEvent event){
            get("Coffee");
            coffeeQTY.setText(showMilkQTY);
        }
        public void putLabelstog (MouseEvent event){
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


