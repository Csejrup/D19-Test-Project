package Domain.SystemControll;
import DataBase.DB;
import Domain.Products.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class System {

//Object of Product Class
    Product product = new Product();
    //use this function in the basket after someone buys stuff
    public void System() {
        DB.selectSQL("Select COUNT(*) from tblStorage");
        String getRows = DB.getData();
        int rows = Integer.parseInt(getRows);
        for(int k=0;k<=rows;k++){
            DB.selectSQL("Select fldStockID from tblStorage");
            String getStockID = DB.getData();
            int stockID = Integer.parseInt(getStockID);
           // checkBorders(stockID);
        }
    }
    /*
    public void checkBorders(int ProductID){
      int minquantity = product.get_MINQUANTITY(ProductID);
      int quantity = product.get_QUANTITY(ProductID);
      
      if(quantity<=minquantity){
          //sendEmail();

      }else{
          sendEmail(ProductID);
      }
      /*
      else {
          checkBorders(ProductID);
      }

       */




    public void sendEmail(int ProductID){
        DB.selectSQL("SELECT fldSupplierID from tblStorage WHERE fldStockID =" + ProductID);
        String supplierID = DB.getData();
        int gettingEmail = Integer.parseInt(supplierID);
        DB.selectSQL("SELECT fldEmail from tblSupplier Where fldSupplierID = "+ gettingEmail);
        String email = DB.getData();
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Email with order has been send to: "+email);
        alert.show();
    }
    public void checkAccount(){
    }
    public void checkProducts(){
    }
}

