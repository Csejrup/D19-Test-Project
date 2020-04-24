package Domain.SystemControll;

import DataBase.DB;
import javafx.scene.control.Alert;

import java.security.AllPermission;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collections;
/**
 * This Class
 *
 */
public class Shopping_Basket
{
    private int _CARTID;
    private int _PRODUCTID;
    private int _QUANTITY;
    private int _TOTAL;
    private int _TOTALQUANTITY;

    public void addProductItem(int productID){
        _PRODUCTID = productID;
        DB.selectSQL("SELECT fldPrice FROM tblStorage WHERE fldProductID = '"+productID+"'");
        int price = Integer.parseInt(DB.getData());
        _TOTAL = _TOTAL+price;
    }
    public void updateQuantity(int quantity, int _PRODUCTID){
        /*
        //////////////////////TEST///////////////////
         */
        DB.selectSQL("SELECT fldQuantity FROM tblStorage WHERE fldStockID ='"+_PRODUCTID+"'");
        _QUANTITY = Integer.parseInt(DB.getDisplayData());
        DB.insertSQL("INSERT INTO tblStorage(fldQuantity) WHERE fldStockID = '"+_PRODUCTID+"' VALUES(0)");
        _QUANTITY = _QUANTITY - quantity;
        DB.insertSQL("INSERT INTO tblStorage(fldQuantity) WHERE fldStockID = '"+_PRODUCTID+"' VALUES("+_QUANTITY+")");

    }

    public void viewCartDetails(int RegisterID){
        //Template for selecting single details from basket
        DB.selectSQL("Select fldSalesID FROM tblRegister where fldRegisterID = '"+RegisterID+"'");
        DB.selectSQL("Select fldStockID FROM tblRegister where fldRegisterID = '"+RegisterID+"'");
        DB.selectSQL("Select fldCustomerID FROM tblRegister where fldRegisterID = '"+RegisterID+"'");
        DB.selectSQL("Select fldEmployeeID FROM tblRegister where fldRegisterID = '"+RegisterID+"'");
    }

    public void makePayment(int CardID,int ProductID, int _QUANTITY){
        DB.selectSQL("SELECT fldBalance from tblCard WHERE fldCardID = '"+CardID+"'");
            int AccBalance = Integer.parseInt(DB.getDisplayData());
            if(AccBalance>=_TOTAL){
                AccBalance = AccBalance-_TOTAL;
                DB.updateSQL("UPDATE tblCard SET fldBalance = '"+AccBalance+"';");
                updateQuantity(_QUANTITY, ProductID);
            }
            else {
                Alert at = new Alert(Alert.AlertType.ERROR);
                at.setContentText("TRANSACION DECLINED: NOT ENOUGHT MONEY");
                at.show();
            }
    }

}
