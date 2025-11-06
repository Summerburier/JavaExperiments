package Mission1;

public class Employee {
    private String name;
    private String department;
    private double salary;
    private static int count = 0;
    public Employee() {
        count++;
    }
    public Employee(String name) {
        this.name = name;
        count++;
    }
    public String getName() {
        return name;
    }
     public String getDepartment() {
        return department;
    }
     public void setDepartment(String department) {
        this.department = department;
    }
     public double getSalary() {
        return salary;
    }
     public void setSalary(double salary) {
        this.salary = salary;
    }
     public static int showCount() {
        return count;
    }

}
