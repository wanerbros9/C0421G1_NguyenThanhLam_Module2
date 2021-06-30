package case_study.models;

public class Employee extends Person {
    private String employeeID;
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String birth, String sex, String citizenID, String phone, String email, String employeeID, String level, String position, double salary) {
        super(name, birth, sex, citizenID, phone, email);
        this.employeeID = employeeID;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "employeeID='" + employeeID + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
