package task_11.task_11_1.dao;

import task_11.task_11_1.Department;

import java.sql.Connection;
import java.sql.SQLException;

public class DepartmentDAO extends AbstractDAO{

    public DepartmentDAO(Connection connection){
        super(connection);
    }

    public Department findDepartmentByID(int dep_id){
        String query = "SELECT * FROM Departments WHERE ID = " + dep_id + ";";
        Department department = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String phone = resultSet.getString("telephone");
                department = new Department(name, phone);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return department;
    }





}
