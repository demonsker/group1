package th.ac.kmitl.science.comsci.example.models;



public class Address {
    
    private String houseAddress;
    private String Village;
    private int citySubDivisionSection;
    private String Street;
    private String Alley;
    private String citySubDivision;
    private String City;
    private String countrySubDivision;
    private String Country;
    
    public Address(){  
        houseAddress = "";
        Village = "";
        citySubDivisionSection = 0;
        Street = "";
        Alley = "";
        citySubDivision = "";
        City = "";
        countrySubDivision = "";
        Country = "";   
    }
    
    public void setHouseAddress(String houseAddress){
        this.houseAddress = houseAddress; 
    }
    
    public String getHouseAddress(){
        return houseAddress;
    }
    
    public void setVillage(String Village){
        this.Village = Village;
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
    
    public void setStreet(String Street){
        this.Street = Street;
    }
    
    public String getStreet(){
        return Street;
    }
    
    public void setAlley(String Alley){
        this.Alley = Alley;
    }
    
    public String getAlley(){
        return Alley;
    }
    
    public void setCitySubDivision(String citySubDivision){
        this.citySubDivision = citySubDivision;
    }
    
    public String getCitySubDivision(){
        return citySubDivision;
    }
    
    public void setCity(String City){
        this.City = City;
    }
    
    public String getCity(){
        return City;
    }
    
    public void setCountrySubDivision(String countrySubDivision){
        this.countrySubDivision = countrySubDivision;
    }
    
    public String getCountrySubDivision(){
        return countrySubDivision;
    }
    
    public void setCountry(String Country){
        this.Country = Country;
    }
    
    public String getCountry(){
        return Country;
    }
    
    public void setAddress(String houseAddress,
                           String Village,
                           int citySubDivisionSection,
                           String Street,
                           String Alley,
                           String citySubDivision,
                           String City,
                           String countrySubDivision,
                           String Country){
        this.houseAddress = houseAddress;
        this.Village = Village;
        this.citySubDivisionSection = citySubDivisionSection;
        this.Street = Street;
        this.Alley = Alley;
        this.citySubDivision = citySubDivision;
        this.City = City;
        this.countrySubDivision = countrySubDivision;
        this.Country = Country;
    }
    
    public String[] getAddress(){
        String []getAddress = {houseAddress,
                               Village,
                               Integer.toString(citySubDivisionSection),
                               Street,
                               Alley,
                               citySubDivision,
                               City,
                               countrySubDivision,
                               Country};
        
        return getAddress; 
    }
    
}
