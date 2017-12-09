package th.ac.kmitl.science.comsci.example.converters;

import th.ac.kmitl.science.comsci.example.models.Address;
import th.ac.kmitl.science.comsci.example.models.CityNameMapping;
import th.ac.kmitl.science.comsci.example.models.CitySubDivisionMapping;
import th.ac.kmitl.science.comsci.example.models.CountrySubDivisionNameMapping;

public class AddressXMLConverter implements XMLConverter {
    
    private String xml;
    private String lineOne;
    private String lineTwo;
    private String lineThree;
    private String lineFour;
    private String lineFive;
    private String streetName;
    private String citySubDivision;
    private String country;
    private String city;
    
    private int cityId;
    private int countryId;
    private int countrySubDivisionId;
    private int citySubDivisionId;
    
    CityNameMapping cityNameMapping = new CityNameMapping();
    CountrySubDivisionNameMapping countrySubDivisionMapping = new CountrySubDivisionNameMapping();
    CitySubDivisionMapping citySubDivisionMapping = new CitySubDivisionMapping();
    // Add Class CountryNameMapping 
    
    public AddressXMLConverter(Address address) {
     
        this.lineOne = address.getLineOne();
        this.lineTwo = address.getLineTwo();
        this.lineThree = address.getLineThree();
        this.lineFour = address.getLineFour();
        this.lineFive = address.getLineFive();
        this.streetName = address.getStreet();
        
        this.cityId = cityNameMapping.mapper(address.getCity());
        this.countrySubDivisionId = countrySubDivisionMapping.mapper(address.getCountrySubDivision());
        this.citySubDivisionId = citySubDivisionMapping.mapper(address.getCitySubDivision());
        // this.countryId = countryMapping.mapper(address.getCountry());
        setXml();      
    }
    
    public void setXml() {
        String xml = "<ram:PostalCLTradeAddress> \n"
                +"\t<ram:LineOne> "+lineOne+" </ram:LineOne> \n"
                +"\t<ram:LineTwo> "+lineTwo+" </ram:LineTwo> \n"
                +"\t<ram:LineThree> "+lineThree+" </ram:LinThree> \n"
                +"\t<ram:LineFour> "+lineFour+" </ram:LineFour> \n"
                +"\t<ram:LineFive> "+lineFive+" </ram:LineFive> \n"
                +"\t<ram:StreetName> "+streetName+" </ram:StreetName> \n"
                +"\t<ram:Cityname> "+cityId+" </ram:CityName> \n"
                +"\t<ram:CitySubDivisionID> "+citySubDivisionId+" </ram:CitySubDivisionID> \n"
                +"\t<ram:CountryID> "+countryId+" </ram:CountryID> \n"
                +"\t<ram:CountrySubDivisionID> "+countrySubDivisionId+" </ram:CountrySubDivisionID> \n"
                +"<ram:PostalCLTradeAddress> \n";
        this.xml = xml;
    }
    
    @Override
    public String getXml() {
        setXml();
        return xml;
    }
    
     @Override
    public boolean isEmptyXML() {
        return xml == null;
    }
    
    public void SetCityToId(String Name) {
       this.cityId = cityNameMapping.mapper(Name);
       setXml();
    }
    
    public void SetCitySubDivisionNameToId(String Name) {
       this.citySubDivisionId = citySubDivisionMapping.mapper(Name);
       setXml();
    }
    
    public void SetCountrySubDivisionNameToId(String Name) {
       this.countrySubDivisionId = countrySubDivisionMapping.mapper(Name);
       setXml();
    }
    
    public int getCitySubDivisionId() {
        return this.citySubDivisionId;
    }
    
    public int getCountySubDivisionId() {
        return this.countrySubDivisionId;
    }
    
    public int getCityId() {
        return this.cityId;
    }
    
    public String getLineOne() {
        return lineOne;
    }

    public String getLineTwo() {
        return lineTwo;
    }
   
    public String getLineThree() {
        return lineThree;
    }

    public String getLineFour() {
        return lineFour;
    }

    public String getLineFive() {
        return lineFive;
    }
   
    public String getStreetName() {
        return streetName;
    }

    public String getCitySubDivision() {
        return citySubDivision;
    }
   

    public String getCountry() {
        return country;
    }
    
     public String getCity() {
        return this.city;
    }
     
}
