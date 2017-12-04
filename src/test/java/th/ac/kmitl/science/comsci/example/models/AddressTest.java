package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class AddressTest {
    private Address address = new Address();
    
    @Test
    public void houseNumberCase(){
        address.setHouseNumber("1103/52");
        assert (address.getHouseNumber().contains("1103/52"));
    }
    
    @Test
    public void villageCase(){
        address.setVillage("Jarurat");
        assert (address.getVillage().contains("Jarurat"));
    }
    
    @Test
    public void citySubDivisionSectionCase(){
        address.setCitySubDivisionSection("1");
        assert (address.getCitySubDivisionSection().contains("1"));
    }
    
    @Test
    public void streetCase(){
        address.setStreet("Petchaburi");
        assert (address.getStreet().contains("Petchaburi"));
    }
    
    @Test
    public void alleyCase(){
        address.setAlley("Petchaburi31");
        assert (address.getAlley().contains("Petchaburi31"));
    }
    
    @Test
    public void citySubDivisionCase(){
        address.setCitySubDivision("Makkasan");
        assert (address.getCitySubDivision().contains("Makkasan"));
    }
    
    @Test
    public void cityCase(){
        address.setCity("Ratchatewee");
        assert (address.getCity().contains("Ratchatewee"));
    }
    
    @Test
    public void countrySubDivisionCase(){
        address.setCountrySubDivision("Bangkok");
        assert (address.getCountrySubDivision().contains("Bangkok"));
    }
    
    @Test
    public void countryCase(){
        address.setCountry("Thailand");
        assert (address.getCountry().contains("Thailand"));
    }
}
