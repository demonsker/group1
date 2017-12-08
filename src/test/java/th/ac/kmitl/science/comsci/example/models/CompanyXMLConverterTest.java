package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.converters.CompanyXMLConverter;
import th.ac.kmitl.science.comsci.example.models.mocks.CompanyMock;

public class CompanyXMLConverterTest {
 
    @Test
    public void testConstructor() {
        
        Company buyer = new Company(CompanyMock.id, CompanyMock.name, CompanyMock.globalId, CompanyMock.taxId);
        CompanyXMLConverter companyXMLConverter = new CompanyXMLConverter(buyer,"buyer");
        
        assert(!companyXMLConverter.getXml().equals(null));  
    }
    
    @Test
    public void testSetHeadtag() {
        
        Company buyer = new Company(CompanyMock.id, CompanyMock.name, CompanyMock.globalId, CompanyMock.taxId);
        CompanyXMLConverter companyXMLConverter = new CompanyXMLConverter(buyer,"buyer");
        
        assert(companyXMLConverter.getHeadTag().equals("BuyerCITradeParty"));
        
        companyXMLConverter.setHeadTag("seller");
        
        assert(companyXMLConverter.getHeadTag().equals("SellerCITradeParty"));
    }
}