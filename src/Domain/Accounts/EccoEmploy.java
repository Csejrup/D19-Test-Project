package Domain.Accounts;

import DataBase.DB;

/**
 * This Class
 * Is a subclass of Class Account
 */
public class EccoEmploy extends Account
{
    public EccoEmploy(String _USERNAME, String _PASSWORD, boolean _LOGINSTATUS) {
        super(_USERNAME, _PASSWORD, _LOGINSTATUS);
    }

    public void set_EMAIL(String _EMAIL) {
        this._EMAIL = _EMAIL;
    }

    private int _EMPLOYEEID;
    private int _EMPLOYEENAME;
    private String _EMAIL;


    public int get_EMPLOYEEID() { return _EMPLOYEEID; }

    public void set_EMPLOYEEID(int _EMPLOYEEID) { this._EMPLOYEEID = _EMPLOYEEID; }

    public int get_EMPLOYEENAME() { return _EMPLOYEENAME; }

    public void set_EMPLOYEENAME(int _EMPLOYEENAME) { this._EMPLOYEENAME = _EMPLOYEENAME; }

    public String get_EMAIL() { return _EMAIL; }



}
