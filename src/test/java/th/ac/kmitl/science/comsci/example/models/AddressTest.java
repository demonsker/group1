package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class AddressTest {
    
    @Test
    public void setterAndGetterMustBeMatch() {
        Address address = new Address();
        String result;
        int resultForCheckCitySubDivisionSection;
        String []resultArray = new String[9];
        
        address.setHouseAddress("1103/52");
        result = address.getHouseAddress();
        assert (result.contains("1103/52"));
        
        address.setVillage("Jarurat");
        result = address.getVillage();
        assert (result.contains("Jarurat"));
        
        address.setCitySubDivisionSection(1);
        resultForCheckCitySubDivisionSection = address.getCitySubDivisionSection();
        assert (resultForCheckCitySubDivisionSection==1);
        
        address.setStreet("Petchburi");
        result = address.getStreet();
        assert (result.contains("Petchaburi"));
        
        address.setAlley("Petchburi31");
        result = address.getAlley();
        assert (result.contains("Petchaburi31"));
        
        address.setCitySubDivision("Makkasan");
        result = address.getCitySubDivision();
        assert (result.contains("Makkasan"));
        
        address.setCity("Ratchatewee");
        result = address.getCity();
        assert (result.contains("Ratchatewee"));
        
        address.setCountrySubDivision("Bangkok");
        result = address.getCountrySubDivision();
        assert (result.contains("Bangkok"));
        
        address.setCountry("Thailand");
        result = address.getCountry();
        assert (result.contains("Thailand"));
        
        resultArray = address.getAddress();
        assert (resultArray[0].contains("1103/52"));
        assert (resultArray[1].contains("Jarurat"));
        assert (resultArray[2].contains("1"));
        assert (resultArray[3].contains("Petchaburi"));
        assert (resultArray[4].contains("Petchaburi31"));
        assert (resultArray[5].contains("Makkasan"));
        assert (resultArray[6].contains("Ratchatewee"));
        assert (resultArray[7].contains("Bangkok"));
        assert (resultArray[8].contains("Thailand"));
    }
    
}
