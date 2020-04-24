package Domain.Accounts;

import DataBase.DB;
/**
 * This Class represents
 * The superclass for CanteenEmploy and EccoEmploy
 *
 */
public class Account {
    private String _USERNAME;
    private String _PASSWORD;
    private boolean _LOGINSTATUS;

    public Account(String _USERNAME, String _PASSWORD, boolean _LOGINSTATUS) {
        this._USERNAME = _USERNAME;
        this._PASSWORD = _PASSWORD;
        this._LOGINSTATUS = _LOGINSTATUS;
    }

    Manager manager = new Manager();
    CanteenEmploy CE = new CanteenEmploy();

    public Account() {

    }

    public boolean verifyLogin(String employeeID, String password ){
        if(manager.login(employeeID,password)||CE.login(employeeID,password)){
            _LOGINSTATUS = true;
        }

        else{
            _LOGINSTATUS = false;
        }
        return _LOGINSTATUS;
    }

}
