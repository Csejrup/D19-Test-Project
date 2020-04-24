package Domain.Products;

import DataBase.DB;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    void get_PRODUCTNAME() {
        DB.selectSQL("SELECT fldProductName FROM tblStorage WHERE fldStockID = '16';");
        String productName = DB.getData();
        assertEquals("snickers",productName);

    }
    @Test
    void get_QUANTITY(){
        DB.selectSQL("SELECT fldQuantity FROM tblStorage WHERE fldStockID = '16';");
        String productPrice = DB.getData();
        assertEquals("20",productPrice);
    }

}