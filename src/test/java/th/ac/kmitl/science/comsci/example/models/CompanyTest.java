package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class CompanyTest {
    
    public void testCompany(){
        String id = "id57050269";
        String name = "Patipon Taweechat";
        String globalId = "GId57050269";
        String taxId = "TId57050269";

        Company company = new Company(id, name, globalId, taxId);
        	
        assert (company.getId().equals(id));
        assert (company.getName().equals(name));
        assert (company.equals(globalId));
        assert (company.equals(taxId));
    }
}
