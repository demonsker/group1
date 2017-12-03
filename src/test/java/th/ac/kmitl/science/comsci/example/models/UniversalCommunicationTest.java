package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class UniversalCommunicationTest{
    
    @Test
    public void shouldInitPropertyViaConstuctorCorrectly(){
        String urlID = "www.Cat202.com";
        String Email = "Cat202@gmail.com";

        UniversalCommunication mail = new UniversalCommunication(urlID,Email);	
        assert (mail.getUrlID().equals(urlID));
        assert (mail.getEmail().equals(Email));
        canChangeURLandEmail(mail);
    }
    
    public void canChangeURLandEmail(UniversalCommunication mail){
        String newEmail = "Dog202@gmail.com";
        String newurlID = "www.Dog202.com";
        
        mail.setEmail(newEmail);
        mail.setURIID(newurlID);
        assert (mail.getUrlID().equals(newurlID));
        assert (mail.getEmail().equals(newEmail));
    }
}

