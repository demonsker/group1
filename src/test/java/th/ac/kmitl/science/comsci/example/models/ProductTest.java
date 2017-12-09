package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mocks.ProductMock;

public class ProductTest {

    @Test
    public void shouldInitPropertyViaConstuctorCorrectly(){
        
        Product product = new Product(ProductMock.id, ProductMock.name, ProductMock.globalId);
        	
        assert (product.getId().equals(ProductMock.id));
        assert (product.getName().equals(ProductMock.name));
        assert (product.getGlobalId().equals(ProductMock.globalId));
    }

}