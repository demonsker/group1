package th.ac.kmitl.science.comsci.example.models;

public class Address {
    private String houseAddress;
    private String village;
    private int citySubDivisionSection;
    private String street;
    private String alley;
    private String citySubDivision;
    private String city;
    private String countrySubDivision;
    private String country;
    
    public Address(){  
        houseAddress = "";
        village = "";
        citySubDivisionSection = 0;
        street = "";
        alley = "";
        citySubDivision = "";
        city = "";
        countrySubDivision = "";
        country = "";   
    }
    
    public Address(String houseAddress,
                   String village,
                   int citySubDivisionSection,
                   String street,
                   String alley,
                   String citySubDivision,
                   String city,
                   String countrySubDivision,
                   String country){
        this.houseAddress = houseAddress;
        this.village = village;
        this.citySubDivisionSection = citySubDivisionSection;
        this.street = street;
        this.alley = alley;
        this.citySubDivision = citySubDivision;
        this.city = city;
        this.countrySubDivision = countrySubDivision;
        this.country = country;
    }
    
    public void setHouseAddress(String houseAddress){
        this.houseAddress = houseAddress; 
    }
    
    public String getHouseAddress(){
        return houseAddress;
    }
    
    public void setVillage(String village){
        this.village = village;
    }
    
    public String getVillage(){
        return houseAddress;
    }
    
    public void setCitySubDivisionSection(int citySubDivisionSection){
        this.citySubDivisionSection = citySubDivisionSection;
    }
    
    public int getCitySubDivisionSection(){
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
        String []getAddress = {houseAddress,
                               village,
                               Integer.toString(citySubDivisionSection),
                               street,
                               alley,
                               citySubDivision,
                               city,
                               countrySubDivision,
                               country};
        return getAddress;
    }
}
