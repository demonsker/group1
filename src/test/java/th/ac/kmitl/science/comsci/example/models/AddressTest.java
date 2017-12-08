package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mocks.AddressMock;

public class AddressTest {
    private Address address = new Address();
    
    @Test
    public void lineOneCase(){
        address.setLineOne(AddressMock.lineOne);
        assert (address.getLineOne().contains(AddressMock.lineOne));
    }
    
    @Test
    public void lineTwoCase(){
        address.setLineTwo(AddressMock.lineTwo);
        assert (address.getLineTwo().contains(AddressMock.lineTwo));
    }
    
    @Test
    public void lineThreeCase(){
        address.setLineThree(AddressMock.lineThree);
        assert (address.getLineThree().contains(AddressMock.lineThree));
    }
    
    @Test
    public void lineFourCase(){
        address.setLineFour(AddressMock.lineFour);
        assert (address.getLineFour().contains(AddressMock.lineFour));
    }
    
    @Test
    public void line5Case(){
        address.setLineFive(AddressMock.lineFive);
        assert (address.getLineFive().contains(AddressMock.lineFive));
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
