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
        
        String Email = "Cat202@gmail.com";
        String uriID = "www.cat202.com";
        seller.setUniversalCommunication(uriID, Email);
        assert (seller.getUniversalCommunication().getEmail().equals(Email));
        assert (seller.getUniversalCommunication().getURIID().equals(uriID));
    }

   @Test	
   public void canChangeUniversalCommunication() {
        String id = "id57050269";
        String name = "Patipon Taweechat";
        String globalId = "GId57050269";
        String taxId = "TId57050269";
        String Email = "Cat202@gmail.com";
        String uriID = "www.cat202.com";
        Company seller = new Company(id, name, globalId, taxId);
        seller.setUniversalCommunication(uriID, Email);
        
        String newEmail = "Dog202@gmail.com";
        String newuriID = "www.Dog202.com";
        seller.setUniversalCommunication(newuriID, newEmail);
        assert (seller.getUniversalCommunication().getEmail().equals(newEmail));
        assert (seller.getUniversalCommunication().getURIID().equals(newuriID));
   }

}

