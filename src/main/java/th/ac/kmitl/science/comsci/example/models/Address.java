package th.ac.kmitl.science.comsci.example.models;

public class Address {
    private String houseNumber;
    private String village;
    private String citySubDivisionSection;
    private String street;
    private String alley;
    private String citySubDivision;
    private String city;
    private String countrySubDivision;
    private String country;
    
    public void setHouseNumber(String houseAddress){
        this.houseNumber = houseAddress; 
    }
    
    public String getHouseNumber(){
        return houseNumber;
    }
    
    public void setVillage(String village){
        this.village = village;
    }
    
    public String getVillage(){
        return village;
    }
    
    public void setCitySubDivisionSection(String citySubDivisionSection){
        this.citySubDivisionSection = citySubDivisionSection;
    }
    
    public String getCitySubDivisionSection(){
        return citySubDivisionSection;
    }
    
    public void setStreet(String street){
        this.street = street;
    }
    
    public String getStreet(){
        return street;
    }
    
    public void setAlley(String alley){
        this.alley = alley;
    }
    
    public String getAlley(){
        return alley;
    }
    
    public void setCitySubDivision(String citySubDivision){
        this.citySubDivision = citySubDivision;
    }
    
    public String getCitySubDivision(){
        return citySubDivision;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setCountrySubDivision(String countrySubDivision){
        this.countrySubDivision = countrySubDivision;
    }
    
    public String getCountrySubDivision(){
        return countrySubDivision;
    }
    
    public void setCountry(String country){
        this.country = country;
    }
    
    public String getCountry(){
        return country;
    }
    
    public String[] getAddress(){
        String []getAddress = {houseNumber,
                               village,
                               citySubDivisionSection,
                               street,
                               alley,
                               citySubDivision,
                               city,
                               countrySubDivision,
                               country};
        return getAddress;
    }
}
