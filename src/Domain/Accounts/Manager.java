package Domain.Accounts;


import DataBase.DB;
import javafx.scene.control.Alert;

import javax.print.DocFlavor;
import java.sql.Statement;

public class Manager extends Account
{
    private String _NAME;
    private String _SURNAME;
    private String _EMAIL;
    public String get_SURNAME() {
        return _SURNAME;
    }

    public void set_SURNAME(String _SURNAME) {
        this._SURNAME = _SURNAME;
    }



    public void setBorder(int border, int productID){
        DB.insertSQL("INSERT INTO tblStorage(fldMinQuantity) WHERE fldProductID = '"+productID+"' VALUES('"+border+"')");
    }
    public boolean login(String WorkerID, String Password){
        DB.selectSQL("Select fldEmployeeID FROM tblEmployee WHERE fldEmployeeID = '"+WorkerID+"';");
        String LoginID = DB.getData();
        DB.selectSQL("Select fldPassword FROM tblEmployee WHERE fldEmployeeID = '"+WorkerID+"';");
        String password = DB.getData();

        if(LoginID.equals(WorkerID) && password.equals(Password)){
            return true;
        }
        else {
            return false;
        }

    }
}
