package dao;

/**
 * Created by tamiand on 10/04/2015.
 */
public interface TaskDao {

	public void createTask(String instance, String name, String text);

	public void deleteTask(String instance, String idTask);

	public void update(String instance, String id, String name, String text);
}
