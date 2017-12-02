package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class ProfileTest extends Profile {
	
    @Test
    public void testProfile(){
        String id = "12345";
        String name = "Prayuth";
		String globalId = "11111";
		String taxId = "22222";
		
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
