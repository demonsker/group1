package th.ac.kmitl.science.comsci.example.models.mocks;

import th.ac.kmitl.science.comsci.example.models.Product;

public class ProductMock {
    
    public static String id = "id41324045";
    public static String name = "Acer Aspire A515-51G-599R/T006 (Black)";
    public static String globalId = "GId67832400";   
    
    public static Product getProductMock() {
        return new Product(id, name, globalId);
    }
}
