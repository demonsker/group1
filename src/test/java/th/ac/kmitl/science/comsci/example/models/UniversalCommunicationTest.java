package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class UniversalCommunicationTest{
    
    @Test
    public void shouldInitPropertyViaConstuctorCorrectly(){
        String uriID = "www.Cat202.com";
        String Email = "Cat202@gmail.com";
        UniversalCommunication mail = new UniversalCommunication(uriID,Email);
        
        assert (mail.getURIID().equals(uriID));
        assert (mail.getEmail().equals(Email));
       
    }
    
    @Test
    public void canChangeURLandEmail(){
        String uriID = "www.Cat202.com";
        String Email = "Cat202@gmail.com";
        UniversalCommunication mail = new UniversalCommunication(uriID,Email);
        
        String newEmail = "Dog202@gmail.com";
        String newuriID = "www.Dog202.com";
        mail.setEmail(newEmail);
        mail.setURIID(newuriID);
        assert (mail.getURIID().equals(newuriID));
        assert (mail.getEmail().equals(newEmail));
    }
}

