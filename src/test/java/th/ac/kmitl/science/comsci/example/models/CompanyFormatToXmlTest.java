package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.converters.CompanyFormatToXml;
import th.ac.kmitl.science.comsci.example.models.mocks.CompanyMock;

public class CompanyFormatToXmlTest {
 
    @Test
    public void testConstructor() {
        
        Company buyer = new Company(CompanyMock.id, CompanyMock.name, CompanyMock.globalId, CompanyMock.taxId);
        CompanyFormatToXml companyFormatToXml = new CompanyFormatToXml(buyer,"buyer");
        
        assert(!companyFormatToXml.getXml().equals(null));  
    }
    
    @Test
    public void testSetHeadtag() {
        
        Company buyer = new Company(CompanyMock.id, CompanyMock.name, CompanyMock.globalId, CompanyMock.taxId);
        CompanyFormatToXml companyFormatToXml = new CompanyFormatToXml(buyer,"buyer");
        
        assert(companyFormatToXml.getHeadTag().equals("BuyerCITradeParty"));
        
        companyFormatToXml.setHeadTag("seller");
        
        assert(companyFormatToXml.getHeadTag().equals("SellerCITradeParty"));
    }
}