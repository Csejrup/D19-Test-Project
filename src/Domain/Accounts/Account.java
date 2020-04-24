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
  
    Manager manager = new Manager();
    CanteenEmploy CE = new CanteenEmploy();

    public Account(String _USERNAME, String _PASSWORD, boolean _LOGINSTATUS) {
        this._USERNAME = _USERNAME;
        this._PASSWORD = _PASSWORD;
        this._LOGINSTATUS = _LOGINSTATUS;
    }
    
    public Account() {

    }
    public boolean verifyLogin(String employeeID, String password ){
        _USERNAME = employeeID;
        _PASSWORD = password;
        Manager manager = new Manager();
        CanteenEmploy CE = new CanteenEmploy();
        if(manager.login(_USERNAME,_PASSWORD)){
            _LOGINSTATUS = true;
        }

        else{
            _LOGINSTATUS = false;
        }
        return _LOGINSTATUS;
    }

}
