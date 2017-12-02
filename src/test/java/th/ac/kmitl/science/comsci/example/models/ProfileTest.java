package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class ProfileTest extends Profile {
	
    @Test
    public void testProfile(){
        String id = "id57050269";
        String name = "Patipon Taweechat";
        String globalId = "GId57050269";
        String taxId = "TId57050269";
		
        setId (id);
        setName (name);
        setGlobalId (globalId);
        setTaxId (taxId);
		
        assert (getId().equals(id));
        assert (getName().equals(name));
        assert (getGlobalId().equals(globalId));
        assert (getTaxId().equals(taxId));
    }
}
