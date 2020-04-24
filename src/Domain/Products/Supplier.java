package Domain.Products;
import DataBase.DB;
/**
 * This Class
 * Creates a new object of a Supplier
 */
public class Supplier
{
    //Standard Constructor
    public Supplier(int _QUANTITY, String _PRODUCTNAME, String _SUPPLIERNAME){
    }
    private int _QUANTITY;
    private String _PRODUCTNAME;
    private String _SUPPLIERNAME;
    public void updateQuantity(int _QUANTITY, int ProductID){
        DB.insertSQL("INSERT INTO tblStorage(fldQuantity) WHERE fldProductID ='"+ProductID+"' VALUES("+_QUANTITY+")");
    }
}
