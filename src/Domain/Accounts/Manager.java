package Domain.Accounts;


import DataBase.DB;
import javafx.scene.control.Alert;

import java.sql.Statement;
/**
 * This Class
 * is a subclass of class Acount
 * Represents the Manager and its attributes
 */
public class Manager extends Account
{


    private String _NAME;
    private String _SURNAME;
    private String _EMAIL;

    public Manager(String _USERNAME, String _PASSWORD, boolean _LOGINSTATUS) {
        super(_USERNAME, _PASSWORD, _LOGINSTATUS);
    }

    public Manager() {
        super();
    }

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
        DB.selectSQL("Select fldEmployeeID FROM tblEmployee WHERE fldEmployeeID = '"+WorkerID+"'");
        String LoginID = DB.getDisplayData();
        DB.selectSQL("Select fldPassword FROM tblEmployee WHERE fldEmployeeID = '"+WorkerID+"'");
        String password = DB.getDisplayData();

        if(LoginID.equals(WorkerID)&& password.equals(Password)){
            return true;
        } else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("WRONG USER NAME OR PASSWORD");
            alert.show();
            return false;
        }
    }
}
