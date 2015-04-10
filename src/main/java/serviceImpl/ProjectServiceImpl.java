package serviceImpl;

import beans.Project;
import dao.ProjectDao;
import daoImpl.ProjectDAOImpl;
import service.ProjectService;

import java.util.List;

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

    @Override
    public void delete(String instance, String id) {
        projectDAOimpl.delete(instance, id);
    }

    @Override
    public List<Project> chargeAll(String instance) {
        return projectDAOimpl.chargeAll(instance);
    }


}
