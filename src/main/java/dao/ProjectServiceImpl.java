package dao;

import daoImpl.ProjectDAOImpl;
import service.ProjectService;

/**
 * Created by tamiand on 26/03/2015.
 */
public class ProjectServiceImpl implements ProjectService {

    private ProjectDao projectDAOimpl = new ProjectDAOImpl();

    @Override
    public String chargeProject(String instance, String id) {
        return projectDAOimpl.charge(instance, id);
    }

    @Override
    public void createProject(String instance, String name) {
        projectDAOimpl.createProject(instance, name);
    }
}
