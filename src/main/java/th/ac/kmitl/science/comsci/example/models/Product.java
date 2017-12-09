package th.ac.kmitl.science.comsci.example.models;

public class Product {
    
    private String id;     
    private String name;
    private String globalId; 

    public Product(String id, String name, String globalId){
        this.id = id;
        this.name = name;
        this.globalId = globalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
