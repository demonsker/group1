package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mocks.AddressMock;

public class AddressTest {
    private Address address = new Address();
    
    @Test
    public void line1Case(){
        address.setLine1(AddressMock.line1);
        assert (address.getLine1().contains(AddressMock.line1));
    }
    
    @Test
    public void line2Case(){
        address.setLine2(AddressMock.line2);
        assert (address.getLine2().contains(AddressMock.line2));
    }
    
    @Test
    public void line3Case(){
        address.setLine3(AddressMock.line3);
        assert (address.getLine3().contains(AddressMock.line3));
    }
    
    @Test
    public void line4Case(){
        address.setLine4(AddressMock.line4);
        assert (address.getLine4().contains(AddressMock.line4));
    }
    
    @Test
    public void line5Case(){
        address.setLine5(AddressMock.line5);
        assert (address.getLine5().contains(AddressMock.line5));
    }
    
    @Test
    public void streetCase(){
        address.setStreet(AddressMock.street);
        assert (address.getStreet().contains(AddressMock.street));
    }
    
    @Test
    public void citySubDivisionCase(){
        address.setCitySubDivision(AddressMock.citySubDivision);
        assert (address.getCitySubDivision().contains(AddressMock.citySubDivision));
    }
    
    @Test
    public void cityCase(){
        address.setCity(AddressMock.city);
        assert (address.getCity().contains(AddressMock.city));
    }
    
    @Test
    public void countrySubDivisionCase(){
        address.setCountrySubDivision(AddressMock.countrySubDivision);
        assert (address.getCountrySubDivision().contains(AddressMock.countrySubDivision));
    }
    
    @Test
    public void countryCase(){
        address.setCountry(AddressMock.country);
        assert (address.getCountry().contains(AddressMock.country));
    }
}
