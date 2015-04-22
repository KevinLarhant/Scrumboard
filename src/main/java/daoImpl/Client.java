package daoImpl;

import com.mongodb.*;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.net.UnknownHostException;

public class Client implements ServletContextListener {

    private MongoClient mongoClient;
    private DB db;
    private String collectionName;

    public Client(String collectionName){
        this.collectionName = collectionName;
        try {
            mongoClient = new MongoClient();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }


    public void contextInitialized(ServletContextEvent servletContextEvent) {
        try {
            mongoClient = new MongoClient();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        db = mongoClient.getDB("ScrumboardDb");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        mongoClient.close();
    }

    public void insert(DBObject dbObject, String collectionName) {
        db.getCollection(collectionName).insert(dbObject);
    }

    public MongoClient getMongoClient() {
        return mongoClient;
    }

    public DB getDb() {
        return db;
    }

    public void setDb(String idInstance) {
        db = mongoClient.getDB(idInstance);
    }

    public void save(DBObject dbObject) {
        db.getCollection(this.collectionName).save(dbObject);
    }

    public DBCollection getCollection() {
        return db.getCollection(this.collectionName);
    }

    public void delete(String idInstance, String idObject) {
        setDb(idInstance);
        this.getCollection().remove(QueryBuilder.start(Constants.id).is(idObject).get());
    }
}
