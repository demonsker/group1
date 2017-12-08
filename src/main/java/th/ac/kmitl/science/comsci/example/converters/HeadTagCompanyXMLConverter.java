package th.ac.kmitl.science.comsci.example.converters;

public enum HeadTagCompanyXMLConverter{
  buyer("BuyerCITradeParty"), 
  seller("SellerCITradeParty"), 
  ; 
  
  private final String checker;
	  
  HeadTagCompanyXMLConverter(String checker) {
      this.checker = checker;
  }
  
  public String getheadTag() {
      return this.checker;
  }
}
