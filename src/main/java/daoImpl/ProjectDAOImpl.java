package daoImpl;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import dao.ProjectDao;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.util.Date;

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
}
