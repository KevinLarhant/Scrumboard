package service;

import beans.Project;

import java.util.List;

/**
 * Created by tamiand on 26/03/2015.
 */
public interface ProjectService {

    public String chargeProject(String instance, String id);

    public void createProject(String instance, String name);

    public void delete(String instance, String id);

    public List<Project> chargeAll(String instance);
}
