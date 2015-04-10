package daoImpl;

import beans.Project;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import dao.ProjectDao;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by tamiand on 26/03/2015.
 */
public class ProjectDAOImpl implements ProjectDao {

    static Logger log = Logger.getLogger(ProjectDAOImpl.class);

    Client client = new Client(Constants.collectionProject);

    public ProjectDAOImpl(){}

    public void createProject(String instance, String name){

        String id = name + Long.toString((new Date()).getTime());

        DBObject toAdd = new BasicDBObject();
        toAdd.put(Constants.id, id);
        toAdd.put(Constants.projectName, name);
        toAdd.put(Constants.projectDateCreate, new DateTime().toDateTime(DateTimeZone.UTC).toString());

        this.client.setDb(instance);
        this.client.save(toAdd);
    }

    public String charge(String instance, String idProject){
        DBObject criteria = new BasicDBObject();
        criteria.put(Constants.id, idProject);
        this.client.setDb(instance);
        return this.client.getCollection().findOne(criteria).toString();
    }

    public void delete(String instance, String idProject){
       this.client.delete(instance, idProject);
    }

    public List<Project> chargeAll(String instance){
        this.client.setDb(instance);

        List<Project> projects = new ArrayList<Project>();
        DBCursor cur = this.client.getCollection().find();
        for(DBObject obj : cur){
            projects.add(new Project(obj.get(Constants.projectName).toString(),
                    obj.get(Constants.id).toString()));
        }
        return projects;
    }

    public void update(String instance, String idProject, String name){
        this.client.setDb(instance);

        this.client.getCollection().update( new BasicDBObject(Constants.id, idProject),
                new BasicDBObject("$set", new BasicDBObject(Constants.projectName, name)), true, false);
    }
}
