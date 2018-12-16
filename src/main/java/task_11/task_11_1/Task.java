package task_11.task_11_1;

public class Task {
    private String description;
    private Employee employee;

    public Task(String description, Employee employee) {
        this.description = description;
        this.employee = employee;
    }
    public Task(String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", employee=" + employee +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
