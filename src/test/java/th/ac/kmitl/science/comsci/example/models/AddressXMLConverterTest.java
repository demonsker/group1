package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.converters.AddressXMLConverter;
import th.ac.kmitl.science.comsci.example.converters.CompanyXMLConverter;
import th.ac.kmitl.science.comsci.example.models.mocks.CompanyMock;

public class AddressXMLConverterTest {
 
    @Test
    public void testConstructor() {
        
        Company buyer = new Company(CompanyMock.id, CompanyMock.name, CompanyMock.globalId, CompanyMock.taxId);
        
        Address address = buyer.getAddressInstance();
        address.setLineOne(AddressMock.lineOne);
        address.setLineTwo(AddressMock.lineTwo);
        address.setLineThree(AddressMock.lineThree);
        address.setLineFour(AddressMock.lineFour);
        address.setLineFive(AddressMock.lineFive);
        address.setStreet(AddressMock.street);
        address.setCitySubDivision(AddressMock.citySubDivision);
        address.setCity(AddressMock.city);
        address.setCountrySubDivision(AddressMock.countrySubDivision);
        address.setCountry(AddressMock.country);
        
        AddressXMLConverter addressXMLConverter = new AddressXMLConverter(address);
        
        assert(!addressXMLConverter.getXml().equals(null));
        assert(addressXMLConverter.getCitySubDivisionId() == 103704);
        assert(addressXMLConverter.getCityId() == 37);
        assert(addressXMLConverter.getCountySubDivisionId() == 1);
    }
    
    @Test
    public void testSetMapper() {
        
        Company buyer = new Company(CompanyMock.id, CompanyMock.name, CompanyMock.globalId, CompanyMock.taxId);
        
        Address address = buyer.getAddressInstance();
        address.setLineOne(AddressMock.lineOne);
        address.setLineTwo(AddressMock.lineTwo);
        address.setLineThree(AddressMock.lineThree);
        address.setLineFour(AddressMock.lineFour);
        address.setLineFive(AddressMock.lineFive);
        address.setStreet(AddressMock.street);
        address.setCitySubDivision(AddressMock.citySubDivision);
        address.setCity(AddressMock.city);
        address.setCountrySubDivision(AddressMock.countrySubDivision);
        address.setCountry(AddressMock.country);
        
        AddressXMLConverter addressXMLConverter = new AddressXMLConverter(address);
        
        addressXMLConverter.SetCitySubDivisionNameToId("Bukkhalo");
        addressXMLConverter.SetCountrySubDivisionNameToId("Bangkok");
        addressXMLConverter.SetCityToId("Thon Buri");
        
        assert(addressXMLConverter.getCitySubDivisionId() == 101504);
        assert(addressXMLConverter.getCityId() == 15);
        assert(addressXMLConverter.getCountySubDivisionId() == 1);
    }
}
