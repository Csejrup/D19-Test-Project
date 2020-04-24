package Domain.Products;
import DataBase.DB;
import java.util.ArrayList;
import java.util.List;
/**
 * This Class
 * is a subclass of class Product
 */
public class Food extends Product
{
    /////
    private String _FOODTYPE;

  //Standard Constructor

    public Food(int _PRODUCTID, int _QUANTITY, int _MINQUANTITY, float _PRICE, String _PRODUCTNAME, String _PRODUCTTYPE, String _EXPIRATIONDATE) {
        super(_PRODUCTID, _QUANTITY, _MINQUANTITY, _PRICE, _PRODUCTNAME, _PRODUCTTYPE, _EXPIRATIONDATE);
    }

    public String get_DRINKTYPE() {
        return _DRINKTYPE;

    public String get_FOODTYPE(String ProductID) {
        DB.selectSQL("SELECT fldProductType FROM tblStorage WHERE fldStockID = '"+ProductID+"';");
        _FOODTYPE = DB.getData();
        return _FOODTYPE;
    }
}
