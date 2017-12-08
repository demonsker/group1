package th.ac.kmitl.science.comsci.example.models;

public class CompanyFormatToXml {
    
    private String headTag;
    private String companyId;
    private String companyGlobalId;
    private String companyName;
    private String companyTax;
    private String xml;
      
    public CompanyFormatToXml (Company company, String headTag) {
           
           this.headTag = changeFormat(headTag);
           this.companyId = company.getId();
           this.companyGlobalId = company.getGlobalId();
           this.companyName = company.getName();
           this.companyTax = company.getTaxId();
           setXml();
    }
    
    public void setXml() {
         String xml = "<ram:"+this.headTag+"> "
                     +"\n\t<ram:ID> "+this.companyId+" </ram:ID>"
                     +"\n\t<ram:GlobalID> "+this.companyGlobalId+" </ram:GlobalID>"
                     +"\n\t<ram:Name> "+this.companyName+" </ram:Name>"
                     +"\n</ram:"+this.headTag+">"
                     +"\n<ram:SpecifiedClLegalOrganization> "
                     +"\n\t<ram:ID> "+this.companyTax+" </ram:ID>"
                     +"\n</ram:SpecifiedClLegalOrganization> ";  
        this.xml = xml;
    }
    
    private String changeFormat(String headTag) {
        
         if( headTag == "buyer")
                headTag = "BuyerCITradeParty";
           else
                headTag = "SellerCITradeParty";
         
        return headTag;
    }
    
    public String getXml() {
        return this.xml;
    }
    
    public String getHeadTag() {
        return this.headTag;
    }
    
    public void setHeadTag(String headTag)  {
        this.headTag = changeFormat(headTag);
    }
    
    public String getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
    
     public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
     public String getCompanyGlobalId() {
        return this.companyGlobalId;
    }
    
    public void setCompanyGlobalId(String companyGlobalId) {
        this.companyGlobalId = companyGlobalId;
    }
    
     public String getCompanyTax() {
        return this.companyTax;
    }
    
    public void setCompanyTax(String companyTax) {
        this.companyTax = companyTax;
    }
  
}
