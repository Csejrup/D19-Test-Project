package Domain.Accounts;

import DataBase.DB;
import javafx.scene.control.ListView;

import java.util.ArrayList;

/**
 * This Class
 *  Reoresents the ID Card for Each Employee
 */
public class IDCard
{
    private int _IDCARD;
    private int _NEWBALANCE;
    private float _BALANCE;

    public int get_IDCARD() { return _IDCARD; }

    public void set_IDCARD(int _IDCARD) { this._IDCARD = _IDCARD; }

    public int get_NEWBALANCE() { return _NEWBALANCE; }

    public void set_NEWBALANCE(int _NEWBALANCE) { this._NEWBALANCE = _NEWBALANCE; }

    /**
     * updateBalanceDB Method Updates the fldBalance in the tblCard in the Database
     * And inserts the new Balance
     *
     */
    public void updateBalanceDB(){
        try{
            float updatedBalance = getBalanceDB() + get_NEWBALANCE();
            DB.updateSQL("UPDATE tblCard set fldBalance ="+updatedBalance+"WHERE fldCardID ="+get_IDCARD()+"" );
            System.out.println(updatedBalance);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * getBalanceDB Method fetches the Balance from tblCard in the Database
     * @return _BALANCE
     */
    public float getBalanceDB(){
        try{
            DB.selectSQL("SELECT fldBalance FROM tblCard WHERE fldCardID = '"+get_IDCARD()+"'");
            _BALANCE =  Float.parseFloat(DB.getDisplayData());
            cleardata();

        }catch(Exception e){
            e.printStackTrace();
        }
        return _BALANCE;
    }

    /**
     * Method for clearing pending DATA
     */
    private static void cleardata() {
        do {
            String data = DB.getData();
            if (data.equals(DB.NOMOREDATA)) {
                break;
            }
        } while (true);
    }
}
