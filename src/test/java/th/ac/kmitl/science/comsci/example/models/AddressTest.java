package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class AddressTest {
    private Address address = new Address();
    
    @Test
    public void line1Case(){
        address.setLine1("1103/52");
        assert (address.getLine1().contains("1103/52"));
    }
    
    @Test
    public void line2Case(){
        address.setLine2("Pratunam Clinic");
        assert (address.getLine2().contains("Pratunam Clinic"));
    }
    
    @Test
    public void line3Case(){
        address.setLine3("Petchaburi31");
        assert (address.getLine3().contains("Petchaburi31"));
    }
    
    @Test
    public void line4Case(){
        address.setLine4("Jarurat");
        assert (address.getLine4().contains("Jarurat"));
    }
    
    @Test
    public void line5Case(){
        address.setLine5("1");
        assert (address.getLine5().contains("1"));
    }
    
    @Test
    public void streetCase(){
        address.setStreet("Petchaburi");
        assert (address.getStreet().contains("Petchaburi"));
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
