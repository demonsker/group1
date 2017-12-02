package th.ac.kmitl.science.comsci.example.models;

public abstract class Profile {
    
    private String id;
    private String name;
    private String globalId;  
    private String taxId;
    //TODO Create variable type of address class
    
    public String getTaxId() {
        return taxId;
    }
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }
    public String getGlobalId() {
        return globalId;
    }
    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
