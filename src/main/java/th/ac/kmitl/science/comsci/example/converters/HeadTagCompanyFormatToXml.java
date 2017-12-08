package th.ac.kmitl.science.comsci.example.converters;

public enum HeadTagCompanyFormatToXml{
  buyer("BuyerCITradeParty"), 
  seller("SellerCITradeParty"), 
  ; 
  
  private final String checker;
	  
  HeadTagCompanyFormatToXml(String checker) {
      this.checker = checker;
  }
  
  public String getheadTag() {
      return this.checker;
  }
}
