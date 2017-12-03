package th.ac.kmitl.science.comsci.example.models;


import org.junit.Test;

public class ElectronicAddressInCompanyTest{

    @Test
    public void shouldInitPropertyViaConstuctorCorrectly(){

        String id = "id57050269";
        String name = "Patipon Taweechat";
        String globalId = "GId57050269";
        String taxId = "TId57050269";
        String Email = "Cat202@gmail.com";
        String urlID = "www.cat202.com";
        
        Company seller = new Company(id, name, globalId, taxId);
        
        seller.setElectronicAddress(urlID, Email);
        assert (seller.getElectronicAddress() != null);
        assert (seller.getElectronicAddress().getEmail().equals(Email));
        assert (seller.getElectronicAddress().getUrlID().equals(urlID));
        
        String newemail = "dog202@gmail.com";
        String newurlID = "www.dog202.com";
        seller.getElectronicAddress().setEmail(newemail);
        seller.getElectronicAddress().setURIID(newurlID);
        
        assert (seller.getElectronicAddress().getEmail().equals(newemail));
        assert (seller.getElectronicAddress().getUrlID().equals(newurlID));

    }
}
