package dao;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.net.UnknownHostException;

public class MongoDao implements ServletContextListener {

    private static MongoClient mongoClient;
    private static DB db;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        try {
            mongoClient = new MongoClient();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        db = mongoClient.getDB("ScrumboardDb");
    }

    @Override
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
}
