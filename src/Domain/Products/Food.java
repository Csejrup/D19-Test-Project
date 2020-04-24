package Domain.Products;
/**
 * This Class
 * is a subclass of class Product
 */
public class Food extends Product
{
    //Standard Constructor

    /////
    private String _DRINKTYPE;

    public Food(int _PRODUCTID, int _QUANTITY, int _MINQUANTITY, float _PRICE, String _PRODUCTNAME, String _PRODUCTTYPE, String _EXPIRATIONDATE) {
        super(_PRODUCTID, _QUANTITY, _MINQUANTITY, _PRICE, _PRODUCTNAME, _PRODUCTTYPE, _EXPIRATIONDATE);
    }

    public String get_DRINKTYPE() {
        return _DRINKTYPE;
    }
}
