package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import java.util.ArrayList;

public class CityNameTest {

    @Test
    public void shouldInitPropertyViaConstuctorCorrectly(){
        
        ArrayList<String> cityname = new CityName().getCityList();
        	
        assert (cityname.get(0).equals("Phra Nakhon"));
        assert (cityname.get(1).equals("Dusit"));
        assert (cityname.get(2).equals("Nong Chok"));
        assert (cityname.get(3).equals("Bang Ruk"));
    }

}