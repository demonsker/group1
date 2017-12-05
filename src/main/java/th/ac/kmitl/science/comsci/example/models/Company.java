package th.ac.kmitl.science.comsci.example.models;

public class Company {
    
    private String id;
    private String name;
    private String globalId;  
    private String taxId;
    private UniversalCommunication universalCommunication;
    private Address address = new Address();
    
    public Company(String id, String name, String globalId, String taxId){
        setId (id);
        setName (name);
        setGlobalId (globalId);
        setTaxId (taxId);
    }

    public void setUniversalCommunication(String uriId){
        this.universalCommunication = new UniversalCommunication(uriId);      
    }
    
    public UniversalCommunication getUniversalCommunication(){
        return universalCommunication;
    }
    
    public Address getAddressInstance(){
        return address;
    }
	
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

