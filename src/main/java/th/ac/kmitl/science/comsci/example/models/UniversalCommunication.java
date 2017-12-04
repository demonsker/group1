package th.ac.kmitl.science.comsci.example.models;

public class UniversalCommunication {

    private String uriID = "";

    private String email = "";
    
    public UniversalCommunication(String uriID,String email){
        this.uriID = uriID;
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getURIID() {
        return uriID;
    }
    
    public void setURIID(String uriID) {
        this.uriID = uriID;
    }

}
