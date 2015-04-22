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

    public String chargeProject(String instance, String id) {
        return projectDAOimpl.charge(instance, id);
    }

    public void createProject(String instance, String name) {
        projectDAOimpl.createProject(instance, name);
    }

    public void delete(String instance, String id) {
        projectDAOimpl.delete(instance, id);
    }

    public List<Project> chargeAll(String instance) {
        return projectDAOimpl.chargeAll(instance);
    }

    public void update(String instance, String id,String name){
        projectDAOimpl.update(instance, id, name);
    }
}
