package Domain.Accounts;

import DataBase.DB;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.util.EventObject;

public class Account {
    private String _USERNAME;
    private String _PASSWORD;
    private boolean _LOGINSTATUS;


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
