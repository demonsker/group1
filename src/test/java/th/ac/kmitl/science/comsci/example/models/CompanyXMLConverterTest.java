package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.converters.CompanyXMLConverter;
import th.ac.kmitl.science.comsci.example.models.mocks.CompanyMock;

public class CompanyXMLConverterTest {
 
    @Test
    public void testConverterToXML() {
        
        Company buyer = new Company(CompanyMock.id, CompanyMock.name, CompanyMock.globalId, CompanyMock.taxId);
        
        String XML = CompanyXMLConverter.getXml(buyer,"buyer");
        assert(!XML.equals(null));  
    }
    
}