package task_11.task_11_1;

import task_11.task_11_1.dao.ConnectionManager;
import task_11.task_11_1.dao.EmployeeDAO;
import task_11.task_11_1.dao.TaskDAO;

public class Main {
    public static void main(String[] args){
          EmployeeDAO employeeDAO = new EmployeeDAO(ConnectionManager.getConnection());
//        System.out.println(employeeDAO.findEmployeesByDepartment(2));
          TaskDAO taskDAO = new TaskDAO(ConnectionManager.getConnection());
//        System.out.println(taskDAO.findAllTasks());
//        taskDAO.createTaskForEmployee(new Task("new dsecription"), 2);
          System.out.println(taskDAO.findTasksByEmployee(2));
    }
}
