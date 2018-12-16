package task_11.task_11_1.dao;

import task_11.task_11_1.Employee;
import task_11.task_11_1.Task;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaskDAO extends AbstractDAO {
    EmployeeDAO employeeDAO = new EmployeeDAO(ConnectionManager.getConnection());

    public TaskDAO(Connection connection){
        super(connection);
    }
    public List<Task> findTasksByEmployee(int emp_id){
        String query = "SELECT * FROM Tasks WHERE employee_id = " + emp_id + ";";
        List<Task> tasks = new ArrayList<>();

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                String description = resultSet.getString("description");
                int employee_id = resultSet.getInt("employee_id");
                Employee employee =  employeeDAO.findEmployeeById(employee_id);

                tasks.add(new Task(description, employee));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    public List<Task> findAllTasks(){
        String query = "SELECT * FROM Tasks;";
        List<Task> tasks = new ArrayList<>();

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                String description = resultSet.getString("description");
                int employee_id = resultSet.getInt("employee_id");
                Employee employee =  employeeDAO.findEmployeeById(employee_id);

                tasks.add(new Task(description, employee));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    public boolean createTaskForEmployee(Task task, int emp_id){

        String query = "INSERT INTO Tasks(description, employee_id) VALUES(" +"\""+task.getDescription() +"\","
                + emp_id +
                ")";

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }


}

