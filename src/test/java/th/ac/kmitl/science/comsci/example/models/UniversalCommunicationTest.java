package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class UniversalCommunicationTest{
    
    @Test
    public void shouldInitPropertyViaConstuctorCorrectly(){
        String uriId = "www.Cat202.com";
        String email = "Cat202@gmail.com";
        UniversalCommunication mail = new UniversalCommunication(uriId,email);
        
        assert (mail.getUriId().equals(uriId));
        assert (mail.getEmail().equals(email));
       
    }
    
    @Test
    public void canChangeURLandEmail(){
        String uriId = "www.Cat202.com";
        String Email = "Cat202@gmail.com";
        UniversalCommunication mail = new UniversalCommunication(uriId,Email);
        
        String newEmail = "Dog202@gmail.com";
        String newUriId = "www.Dog202.com";
        mail.setEmail(newEmail);
        mail.setUriId(newUriId);
        assert (mail.getUriId().equals(newUriId));
        assert (mail.getEmail().equals(newEmail));
    }
}

