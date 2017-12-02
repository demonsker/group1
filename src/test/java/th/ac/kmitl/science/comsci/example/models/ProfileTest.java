package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class ProfileTest extends Profile {
	
    @Test
    public void testProfile(){
        String id = "12345";
        String name = "Prayuth";
		
        setId (id);
        setName (name);
		
        assert (getId().equals(id));
        assert (getName().equals(name));
    }
}
