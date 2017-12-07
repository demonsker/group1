package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.mocks.UniversalCommunicationMock;

public class UniversalCommunicationTest{
    
    @Test
    public void shouldInitPropertyViaConstuctorCorrectly(){
        UniversalCommunication mail = new UniversalCommunication(UniversalCommunicationMock.uriId); 
        assert (mail.getUriId().equals(UniversalCommunicationMock.uriId)); 
    }
    
    @Test
    public void canChangeURL(){
        UniversalCommunication mail = new UniversalCommunication(UniversalCommunicationMock.uriId);   
        mail.setUriId(UniversalCommunicationMock.newuriId);
        assert (mail.getUriId().equals(UniversalCommunicationMock.newuriId));
    }
}

