package dao;

/**
 * Created by tamiand on 26/03/2015.
 */
public interface ProjectDao {

    public String charge(String instance, String idProject);

    public void createProject(String instance, String name);
}
