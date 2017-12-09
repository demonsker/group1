package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mocks.AddressMock;

public class CitySubDivisioMappingTest {
    
    private CitySubDivisionMapping citySubDivisionMapping = new CitySubDivisionMapping();
    private AddressMock mock = new AddressMock();
    
    @Test
    public void testByName(){
        assert(citySubDivisionMapping.mapper("Si Lom") == 100402);
        assert(citySubDivisionMapping.mapper("Bukkhalo") == 101504);
        assert(citySubDivisionMapping.mapper("Din Daeng") == 102601);
        assert(citySubDivisionMapping.mapper("Don Mueang") == 103604);
        assert(citySubDivisionMapping.mapper("Khan Na Yao") == 104301);
        assert(citySubDivisionMapping.mapper("Thap Yao") == 101105);
        assert(citySubDivisionMapping.mapper("Lumphini") == 100704);
        assert(citySubDivisionMapping.mapper("Lam Pla Thio")== 101104);
    }
    
    @Test
    public void testByMock(){
        assert(citySubDivisionMapping.mapper(mock.citySubDivision) == 103704);
    }
    
}

