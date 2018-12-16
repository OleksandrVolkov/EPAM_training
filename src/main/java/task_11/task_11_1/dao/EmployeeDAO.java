package task_11.task_11_1.dao;

import task_11.task_11_1.Department;
import task_11.task_11_1.Employee;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO extends AbstractDAO{
    DepartmentDAO departmentDAO = new DepartmentDAO(ConnectionManager.getConnection());

     public EmployeeDAO(Connection connection){
        super(connection);
     }

    public List<Employee> findEmployeesByDepartment(int dep_id){
        String query = "SELECT * FROM Employees WHERE departmentID = " + dep_id + ";";
        List<Employee> employees = new ArrayList<>();

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String position = resultSet.getString("position");
                int department_id = resultSet.getInt("departmentID");
                Department department = departmentDAO.findDepartmentByID(dep_id);
                employees.add(new Employee(name, surname, position, department));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public Employee findEmployeeById(int id){
        String query = "SELECT * FROM Employees WHERE id = " + id + ";";
        Employee employee = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String position = resultSet.getString("position");
                int department_id = resultSet.getInt("departmentID");
                Department department = departmentDAO.findDepartmentByID(department_id);
                employee = new Employee(name, surname, position, department);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }


}
