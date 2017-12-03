package th.ac.kmitl.science.comsci.example.models;


import org.junit.Test;

public class ElectronicAddressTest{
    
    @Test
    public void shouldInitPropertyViaConstuctorCorrectly(){
        String urlID = "www.Cat202.com";
        String Email = "Cat202@gmail.com";

        ElectronicAddress mail = new ElectronicAddress(urlID,Email);	
        assert (mail.getUrlID().equals(urlID));
        assert (mail.getEmail().equals(Email));
        
    }
}

