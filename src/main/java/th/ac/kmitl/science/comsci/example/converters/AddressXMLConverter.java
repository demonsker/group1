package th.ac.kmitl.science.comsci.example.converters;

import th.ac.kmitl.science.comsci.example.models.Address;
import th.ac.kmitl.science.comsci.example.models.CityCodeMapping;
import th.ac.kmitl.science.comsci.example.models.CitySubDivisionCodeMapping;
import th.ac.kmitl.science.comsci.example.models.CountrySubDivisionCodeMapping;

public class AddressXMLConverter  {
    
    public static String getXml(Address address) {
    CityCodeMapping cityCodeMapping = new CityCodeMapping();
    CountrySubDivisionCodeMapping countrySubDivisionCodeMapping = new CountrySubDivisionCodeMapping();
    CitySubDivisionCodeMapping citySubDivisionMapping = new CitySubDivisionCodeMapping();
     // TODO Add Instance CountryCodeMapping
    
    String xml = "<ram:PostalCLTradeAddress> \n"
                +"\t<ram:LineOne>"+address.getLineOne()+"</ram:LineOne> \n"
                +"\t<ram:LineTwo>"+address.getLineTwo()+"</ram:LineTwo> \n"
                +"\t<ram:LineThree>"+address.getLineThree()+"</ram:LinThree> \n"
                +"\t<ram:LineFour>"+address.getLineFour()+"</ram:LineFour> \n"
                +"\t<ram:LineFive>"+address.getLineFive()+"</ram:LineFive> \n"
                +"\t<ram:StreetName>"+address.getStreet()+"</ram:StreetName> \n"
                +"\t<ram:Cityname>"+cityCodeMapping.mapper(address.getCity())+" </ram:CityName> \n"
                +"\t<ram:CitySubDivisionID>"+citySubDivisionMapping.mapper(address.getCitySubDivision())+"</ram:CitySubDivisionID> \n"
                +"\t<ram:CountryID>"+address.getCountry()+"</ram:CountryID>\n"
                +"\t<ram:CountrySubDivisionID>"+countrySubDivisionCodeMapping.mapper(address.getCountrySubDivision())+"</ram:CountrySubDivisionID> \n"
                +"<ram:PostalCLTradeAddress>\n";   
        return xml;
    }
    
}
