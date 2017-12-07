package th.ac.kmitl.science.comsci.example.models.mocks;

import th.ac.kmitl.science.comsci.example.models.UniversalCommunication;

public class UniversalCommunicationMock {
    
    public static String uriId = "Cat202@gmail.com";
    public static String newuriId = "Dog202@gmail.com"; 
    
    public static UniversalCommunication getUniversalCommunicationMock() {
        return new UniversalCommunication(uriId);
    }
    
    public static UniversalCommunication getNewUniversalCommunicationMock() {
        return new UniversalCommunication(newuriId);
    }
}
