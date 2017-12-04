package th.ac.kmitl.science.comsci.example.models;

public class UniversalCommunication {

    private String uriId = "";

    private String email = "";
    
    public UniversalCommunication(String uriId,String email){
        this.uriId = uriId;
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUriId() {
        return uriId;
    }
    
    public void setUriId(String uriId) {
        this.uriId = uriId;
    }

}
