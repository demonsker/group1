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
	
        canInitialUniversalCommunication(seller);
        cannotChangeUniversalCommunication(seller);
	
    }

    public void canInitialUniversalCommunication(Company seller) {
    
        String Email = "Cat202@gmail.com";
        String urlID = "www.cat202.com";
        seller.initialUniversalCommunication(urlID, Email);
        assert (seller.getUniversalCommunication().getEmail().equals(Email));
        assert (seller.getUniversalCommunication().getUrlID().equals(urlID));
    }

	
   public void cannotChangeUniversalCommunication(Company seller) {
        String newEmail = "Dog202@gmail.com";
        String newurlID = "www.Dog202.com";
        String Email = "Cat202@gmail.com";
        String urlID = "www.cat202.com";
        
        seller.initialUniversalCommunication(newurlID, newEmail);
        assert (seller.getUniversalCommunication().getEmail().equals(Email));
        assert (seller.getUniversalCommunication().getUrlID().equals(urlID));
   }

}

