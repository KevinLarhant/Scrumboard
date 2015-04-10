package beans;

/**
 * Created by tamiand on 10/04/2015.
 */
public class Project {

    private String name;
    private String id;
    private String dateCreated;

    private String dateDeleted = null;

    public Project(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
