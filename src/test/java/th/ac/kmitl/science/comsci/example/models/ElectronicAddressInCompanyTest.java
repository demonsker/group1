package th.ac.kmitl.science.comsci.example.models;


import org.junit.Test;

public class ElectronicAddressInCompanyTest{

    @Test
    public void shouldInitPropertyViaConstuctorCorrectly(){

        String id = "id57050269";
        String name = "Patipon Taweechat";
        String globalId = "GId57050269";
        String taxId = "TId57050269";
        String Email = "Cat";
        String urlID = "www.cat.com";

        Company seller = new Company(id, name, globalId, taxId);

        seller.setElectronicAddress(urlID, Email);

        assert (seller.getId().equals(id));
        assert (seller.getName().equals(name));
        assert (seller.getGlobalId().equals(globalId));
        assert (seller.getTaxId().equals(taxId));
	assert (seller.getTaxId().equals(taxId));
        assert (seller.getElectronicAddress().getEmail().equals(Email));
        assert (seller.getElectronicAddress().getUrlID().equals(urlID));

    }
}
