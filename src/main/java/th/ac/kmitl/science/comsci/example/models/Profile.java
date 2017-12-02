package th.ac.kmitl.science.comsci.example.models;

public abstract class Profile {
    
    private String id;
    private String name;
    //TODO Create variable type of address class
    
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
