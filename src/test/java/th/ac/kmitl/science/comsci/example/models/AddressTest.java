package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class AddressTest {
    
    @Test
    public void setterAndGetterMustBeMatch() {
        Address address = new Address();
        String result;
        int resultForCheckCitySubDivisionSection;
        
        address.setHouseAddress("1103/52");
        result = address.getHouseAddress();
        assert (result.contains("1103/52"));
        
        address.setCountrySubDivision("Bangkok");
        result = address.getCountrySubDivision();
        assert (result.contains("Bangkok"));
        
        address.setCitySubDivisionSection(1);
        resultForCheckCitySubDivisionSection = address.getCitySubDivisionSection();
        assert (resultForCheckCitySubDivisionSection==1);
    }
    
}
