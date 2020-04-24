package Domain.Products;
/**
 * This Class
 * is a subclass of Class Product
 * Creates a new object of Drinks
 */
public class Drinks extends Product
{
    //Standard Constructor
    public Drinks(int _PRODUCTID, int _QUANTITY, int _MINQUANTITY, float _PRICE, String _PRODUCTNAME, String _PRODUCTTYPE, String _EXPIRATIONDATE) {
        super(_PRODUCTID, _QUANTITY, _MINQUANTITY, _PRICE, _PRODUCTNAME, _PRODUCTTYPE, _EXPIRATIONDATE);
    }


    public String get_FOODTYPE() {
        return _FOODTYPE;
    }
    private String _FOODTYPE;
}
