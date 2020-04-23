package Domain.Accounts;

import DataBase.DB;
import javafx.scene.control.ListView;

import java.util.ArrayList;

/**
 * This Class
 *
 */
public class IDCard
{
    private int _IDCARD;
    private int _NEWBALANCE;
    private float _BALANCE;
    private ListView<Integer> balanceListView;

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
        float updatedBalance = getBalanceDB() + get_NEWBALANCE();
        DB.updateSQL("UPDATE tblCard set fldBalance ="+updatedBalance+"WHERE fldCardID ="+get_IDCARD()+"" );
        System.out.println(updatedBalance);

    }

    /**
     * getBalanceDB Method fetches the Balance from tblCard in the Database
     * @return _BALANCE
     */
    public float getBalanceDB(){
        DB.selectSQL("SELECT fldBalance FROM tblCard WHERE fldCardID = '"+get_IDCARD()+"'");
        _BALANCE =  Float.parseFloat(DB.getDisplayData());
        cleardata();
        return _BALANCE;
    }

    /*
    public void handleBalanceHistory(){
        ArrayList<Integer> arrayListHis = new ArrayList<>();
        DB.selectSQL("SELECT fldBalance FROM tblCard");
        GetFromDB(arrayListHis);
    }

    private void GetFromDB(ArrayList<Integer> arrayList) {
        do {
            String data = DB.getData();
            if (data.equals(DB.NOMOREDATA)) {
                break;
            } else {
                // ADDS EACH ELEMENT TO THE ARRAY LIST
                arrayList.add(Integer.parseInt(data));
                System.out.print(data);
            }
        } while (true);
        balanceListView.getItems().clear();
        for (int s : arrayList) {
            balanceListView.getItems().add(s);
        }
        System.out.println(balanceListView);
    }

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
