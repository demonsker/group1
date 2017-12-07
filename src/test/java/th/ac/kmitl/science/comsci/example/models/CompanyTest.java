package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mocks.*;

public class CompanyTest {
    
    @Test
    public void shouldInitPropertyViaConstuctorCorrectly(){
        
        Company seller = new Company(CompanyMock.id, CompanyMock.name, CompanyMock.globalId, CompanyMock.taxId);
        	
        assert (seller.getId().equals(CompanyMock.id));
        assert (seller.getName().equals(CompanyMock.name));
        assert (seller.getGlobalId().equals(CompanyMock.globalId));
        assert (seller.getTaxId().equals(CompanyMock.taxId));
    }
    
    @Test
    public void canSetUniversalCommunication() {
        
        Company seller = new Company(CompanyMock.id, CompanyMock.name, CompanyMock.globalId, CompanyMock.taxId); 
        seller.setUniversalCommunication(UniversalCommunicationMock.uriId);
        assert (seller.getUniversalCommunication().getUriId().equals(UniversalCommunicationMock.uriId));
    }

   @Test	
   public void canChangeUniversalCommunication() {
       
        Company seller = new Company(CompanyMock.id, CompanyMock.name, CompanyMock.globalId, CompanyMock.taxId);
        seller.setUniversalCommunication(UniversalCommunicationMock.uriId);
        
        seller.setUniversalCommunication(UniversalCommunicationMock.newuriId);
        assert (seller.getUniversalCommunication().getUriId().equals(UniversalCommunicationMock.newuriId));
   }
   
   @Test
    public void getAllDataFromAddressInstanceCase(){
        
        Company seller = new Company(CompanyMock.id, CompanyMock.name, CompanyMock.globalId, CompanyMock.taxId);
        
        Address address = seller.getAddressInstance();
        address.setLine1(AddressMock.line1);
        address.setLine2(AddressMock.line2);
        address.setLine3(AddressMock.line3);
        address.setLine4(AddressMock.line4);
        address.setLine5(AddressMock.line5);
        address.setStreet(AddressMock.street);
        address.setCitySubDivision(AddressMock.citySubDivision);
        address.setCity(AddressMock.city);
        address.setCountrySubDivision(AddressMock.countrySubDivision);
        address.setCountry(AddressMock.country);
        
        assert (address.getLine1().equals(AddressMock.line1));
        assert (address.getLine2().equals(AddressMock.line2));
        assert (address.getLine3().equals(AddressMock.line3));
        assert (address.getLine4().equals(AddressMock.line4));
        assert (address.getLine5().equals(AddressMock.line5));
        assert (address.getStreet().equals(AddressMock.street));
        assert (address.getCitySubDivision().equals(AddressMock.citySubDivision));
        assert (address.getCity().equals(AddressMock.city));
        assert (address.getCountrySubDivision().equals(AddressMock.countrySubDivision));
        assert (address.getCountry().equals(AddressMock.country));
    }

}

