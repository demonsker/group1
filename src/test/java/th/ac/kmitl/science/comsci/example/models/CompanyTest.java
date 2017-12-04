package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class CompanyTest {
    
    @Test
    public void shouldInitPropertyViaConstuctorCorrectly(){
        String id = "id57050269";
        String name = "Patipon Taweechat";
        String globalId = "GId57050269";
        String taxId = "TId57050269";

        Company seller = new Company(id, name, globalId, taxId);
        	
        assert (seller.getId().equals(id));
        assert (seller.getName().equals(name));
        assert (seller.getGlobalId().equals(globalId));
        assert (seller.getTaxId().equals(taxId));
    }
    
    @Test
    public void canSetUniversalCommunication() {
        String id = "id57050269";
        String name = "Patipon Taweechat";
        String globalId = "GId57050269";
        String taxId = "TId57050269";
        Company seller = new Company(id, name, globalId, taxId);
        
        String uriId = "Cat202@gmail.com";
        seller.setUniversalCommunication(uriId);
        assert (seller.getUniversalCommunication().getUriId().equals(uriId));
    }

   @Test	
   public void canChangeUniversalCommunication() {
        String id = "id57050269";
        String name = "Patipon Taweechat";
        String globalId = "GId57050269";
        String taxId = "TId57050269";
        String uriId = "Cat202@gmail.com";
        Company seller = new Company(id, name, globalId, taxId);
        seller.setUniversalCommunication(uriId);
        
        String newUriId = "Dog202@gmail.com";
        seller.setUniversalCommunication(newUriId);
        assert (seller.getUniversalCommunication().getUriId().equals(newUriId));
   }
   
   @Test
    public void getAllDataFromAddressInstanceCase(){
        String id = "id57050269";
        String name = "Patipon Taweechat";
        String globalId = "GId57050269";
        String taxId = "TId57050269";
        String []resultArray = new String[9];

        Company seller = new Company(id, name, globalId, taxId);
        
        Address address = seller.getAddressInstance();
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

