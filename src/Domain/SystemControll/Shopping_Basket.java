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
        int price = Integer.parseInt(DB.getDisplayData());
        _TOTAL = _TOTAL+price;
    }
    public void updateQuantity(int quantity, int _PRODUCTID){
        /*
        //////////////////////TEST///////////////////
         */
        DB.selectSQL("SELECT fldQuantity FROM tblStorage WHERE fldProductID ='"+_PRODUCTID+"'");
        _QUANTITY = Integer.parseInt(DB.getDisplayData());
        DB.insertSQL("INSERT INTO tblStorage(fldQuantity) WHERE fldProductID = '"+_PRODUCTID+"' VALUES(0)");
        _QUANTITY = _QUANTITY - quantity;
        DB.insertSQL("INSERT INTO tblStorage(fldQuantity) WHERE fldProductID = '"+_PRODUCTID+"' VALUES("+_QUANTITY+")");

    }

    public void viewCartDetails(int BasketId, int _QUANTITY){
        //Template for selecting single details from basket
        DB.selectSQL("Select //// FROM tblRegister where fldRegisterID = '"+BasketId+"'");
    }

    public void makePayment(int CardID,int ProductID, int _QUANTITY){
        DB.selectSQL("SELECT fldBalance from tblCard WHERE fldCardID = '"+CardID+"'");
            int AccBalance = Integer.parseInt(DB.getDisplayData());
            DB.insertSQL("INSERT INTO tblCard(fldBalance) WHERE fldCardID = '"+CardID+" VALUES = '0'");
            if(AccBalance>=_TOTAL){
                AccBalance = AccBalance-_TOTAL;
                DB.insertSQL("INSERT INTO tblCard(fldBalance) WHERE fldCardID = '"+CardID+" VALUES = '"+AccBalance+"'");
                updateQuantity(_QUANTITY, ProductID);
            }
            else {
                Alert at = new Alert(Alert.AlertType.ERROR);
                at.setContentText("TRANSACION DECLINED: NOT ENOUGHT MONEY");
                at.show();
            }
    }

}
