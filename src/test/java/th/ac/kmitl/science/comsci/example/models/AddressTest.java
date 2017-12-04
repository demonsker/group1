package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class AddressTest {
    private Address address = new Address();
    private int resultForCheckCitySubDivisionSection;
    private String result;
    private String []resultArray = new String[9];
    
    @Test
    public void houseNumberCase(){
        address.setHouseNumber("1103/52");
        result = address.getHouseNumber();
        assert (result.contains("1103/52"));
    }
    
    @Test
    public void villageCase(){
        address.setVillage("Jarurat");
        result = address.getVillage();
        assert (result.contains("Jarurat"));
    }
    
    @Test
    public void citySubDivisionSectionCase(){
        address.setCitySubDivisionSection(1);
        resultForCheckCitySubDivisionSection = address.getCitySubDivisionSection();
        assert (resultForCheckCitySubDivisionSection==1);
    }
    
    @Test
    public void streetCase(){
        address.setStreet("Petchaburi");
        result = address.getStreet();
        assert (result.contains("Petchaburi"));
    }
    
    @Test
    public void alleyCase(){
        address.setAlley("Petchaburi31");
        result = address.getAlley();
        assert (result.contains("Petchaburi31"));
    }
    
    @Test
    public void citySubDivisionCase(){
        address.setCitySubDivision("Makkasan");
        result = address.getCitySubDivision();
        assert (result.contains("Makkasan"));
    }
    
    @Test
    public void cityCase(){
        address.setCity("Ratchatewee");
        result = address.getCity();
        assert (result.contains("Ratchatewee"));
    }
    
    @Test
    public void countrySubDivisionCase(){
        address.setCountrySubDivision("Bangkok");
        result = address.getCountrySubDivision();
        assert (result.contains("Bangkok"));
    }
    
    @Test
    public void countryCase(){
        address.setCountry("Thailand");
        result = address.getCountry();
        assert (result.contains("Thailand"));
    }
    
    @Test
    public void getAllDataFromInstanceCase(){
        address.setHouseNumber("1103/52");
        address.setVillage("Jarurat");
        address.setCitySubDivisionSection(1);
        address.setStreet("Petchaburi");
        address.setAlley("Petchaburi31");
        address.setCitySubDivision("Makkasan");
        address.setCity("Ratchatewee");
        address.setCountrySubDivision("Bangkok");
        
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
