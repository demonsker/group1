package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mocks.AddressMock;

public class CitySubDivisionNameTest {
    
    private CitySubDivisionName citySubDivisionMapping = new CitySubDivisionName();
    private AddressMock mock = new AddressMock();
    
    @Test
    public void testByName(){
        assert(citySubDivisionMapping.mapper("Si Lom") == 2);
        assert(citySubDivisionMapping.mapper("Bukkhalo") == 4);
        assert(citySubDivisionMapping.mapper("Din Daeng") == 1);
        assert(citySubDivisionMapping.mapper("Don Mueang") == 2);
        assert(citySubDivisionMapping.mapper("Khan Na Yao") == 1);
        assert(citySubDivisionMapping.mapper("Thap Yao") == 5);
        assert(citySubDivisionMapping.mapper("Lumphini") == 4);
        assert(citySubDivisionMapping.mapper("Lam Pla Thio")== 4);
    }
    
    @Test
    public void testByMock(){
        assert(citySubDivisionMapping.mapper(mock.citySubDivision) == 4);
    }
    
}

