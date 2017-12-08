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
        
        seller.setUniversalCommunication(UniversalCommunicationMock.newUriId);
        assert (seller.getUniversalCommunication().getUriId().equals(UniversalCommunicationMock.newUriId));
   }
   
   @Test
    public void getAllDataFromAddressInstanceCase(){
        
        Company seller = new Company(CompanyMock.id, CompanyMock.name, CompanyMock.globalId, CompanyMock.taxId);
        
        Address address = seller.getAddressInstance();
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
        
        assert (address.getLineOne().equals(AddressMock.lineOne));
        assert (address.getLineTwo().equals(AddressMock.lineTwo));
        assert (address.getLineThree().equals(AddressMock.lineThree));
        assert (address.getLineFour().equals(AddressMock.lineFour));
        assert (address.getLineFive().equals(AddressMock.lineFive));
        assert (address.getStreet().equals(AddressMock.street));
        assert (address.getCitySubDivision().equals(AddressMock.citySubDivision));
        assert (address.getCity().equals(AddressMock.city));
        assert (address.getCountrySubDivision().equals(AddressMock.countrySubDivision));
        assert (address.getCountry().equals(AddressMock.country));
    }

}

