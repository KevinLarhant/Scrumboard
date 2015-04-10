package dao;

import beans.Project;

import java.util.List;

/**
 * Created by tamiand on 26/03/2015.
 */
public interface ProjectDao {

    public String charge(String instance, String idProject);

    public void createProject(String instance, String name);

    public void delete(String instance, String idProject);

    public List<Project> chargeAll(String instance);

    public void update(String instance, String idProject, String name);
}
