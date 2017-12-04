package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class UniversalCommunicationTest{
    
    @Test
    public void shouldInitPropertyViaConstuctorCorrectly(){
        String uriId = "Cat202@gmail.com";
        UniversalCommunication mail = new UniversalCommunication(uriId); 
        assert (mail.getUriId().equals(uriId)); 
    }
    
    @Test
    public void canChangeURL(){
        String uriId = "Cat202@gmail.com";
        UniversalCommunication mail = new UniversalCommunication(uriId);   
        String newUriId = "Dog202@gmail.com";
        mail.setUriId(newUriId);
        assert (mail.getUriId().equals(newUriId));
    }
}

