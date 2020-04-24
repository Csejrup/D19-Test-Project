package Domain.Products;

import DataBase.DB;

import java.util.ArrayList;
import java.util.List;

public class Food extends Product
{
    /////
    private String _FOODTYPE;

    public String get_FOODTYPE(String ProductID) {
        DB.selectSQL("SELECT fldProductType FROM tblStorage WHERE fldStockID = '"+ProductID+"';");
        _FOODTYPE = DB.getData();
        return _FOODTYPE;
    }


}
