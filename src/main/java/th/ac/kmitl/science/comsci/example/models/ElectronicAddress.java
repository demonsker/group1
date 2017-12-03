package th.ac.kmitl.science.comsci.example.models;

public class ElectronicAddress {

    private String urlID = "";

    private String email = "";
    
    public ElectronicAddress(String urlID,String email){
        this.urlID = urlID;
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrlID() {
        return urlID;
    }
    
    public void setURIID(String urlID) {
        this.urlID = urlID;
    }

}
