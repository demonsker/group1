package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class CountryNameMappingTest {
    
    private CountryName countryMapping = new CountryName();
    private AddressMock mock = new AddressMock();
    
    @Test
    public void testByName(){
        assert(countryMapping.mapper("USA") == 2);
        assert(countryMapping.mapper("America") == 2);
        assert(countryMapping.mapper("United States of America") == 2);
        assert(countryMapping.mapper("China") == 3);
        assert(countryMapping.mapper("Endland") == 5);
        assert(countryMapping.mapper("Spain") == 7);
        assert(countryMapping.mapper("Brazil") == 8);
        assert(countryMapping.mapper("India") == 12);
    }
    
    @Test
    public void testByMock(){
        assert(countryMapping.mapper(mock.country) == 1);
    }
    
}
