package Domain.Products;


import DataBase.DB;

public class Supplier
{
    private int _QUANTITY;
    private String _PRODUCTNAME;
    private String _SUPPLIERNAME;

    public void updateQuantity(int _QUANTITY, int ProductID){
        DB.insertSQL("INSERT INTO tblStorage(fldQuantity) WHERE fldProductID ='"+ProductID+"' VALUES("+_QUANTITY+")");

    }



}
