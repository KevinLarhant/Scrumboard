package daoImpl;

import java.util.Date;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import dao.TaskDao;

public class TaskDAOImpl implements TaskDao {

	static Logger log = Logger.getLogger(ProjectDAOImpl.class);

	Client client = new Client(Constants.collectionTask);

	public void createTask(String instance, String name, String text) {

		String id = name + Long.toString((new Date()).getTime());

		DBObject toAdd = new BasicDBObject();
		toAdd.put(Constants.id, id);
		toAdd.put(Constants.taskName, name);
		toAdd.put(Constants.taskText, text);
		toAdd.put(Constants.taskDateCreate,
				new DateTime().toDateTime(DateTimeZone.UTC).toString());

		this.client.setDb(instance);
		this.client.save(toAdd);

	}

	public void deleteTask(String instance, String idTask) {
		this.client.delete(instance, idTask);
	}

	public void update(String instance, String id, String name, String text) {
		this.client.setDb(instance);

		this.client.getCollection().update(
				new BasicDBObject(Constants.id, id),
				new BasicDBObject("$set", new BasicDBObject(Constants.taskName, name)), true, false);

	}

}
