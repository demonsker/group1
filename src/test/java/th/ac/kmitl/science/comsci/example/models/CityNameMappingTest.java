package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mocks.AddressMock;

public class CityNameMappingTest {
    
    private CityName cityMapping = new CityName();
    private AddressMock mock = new AddressMock();
    
    @Test
    public void testByName(){
        assert(cityMapping.mapper("Phra Nakhon") == 1);
        assert(cityMapping.mapper("Dusit") == 2);
        assert(cityMapping.mapper("Nong Chok") == 3);
        assert(cityMapping.mapper("Min Buri") == 10);
        assert(cityMapping.mapper("Lat Krabang") == 11);
        assert(cityMapping.mapper("Phaya Thai") == 14);
        assert(cityMapping.mapper("Huai Khwang") == 17);
        assert(cityMapping.mapper("Bangkok Noi")==20);
    }
    
    @Test
    public void testByMock(){
        assert(cityMapping.mapper(mock.city) == 37);
    }
    
}
