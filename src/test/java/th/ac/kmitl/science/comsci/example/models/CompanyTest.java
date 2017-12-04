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

}

