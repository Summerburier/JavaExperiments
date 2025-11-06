import Mission1.Employee;
import Mission2.Package2.Class2;
import Mission3.Cylinder;

public class App {
    public static void main(String[] args) {
        System.out.println("=== 任务1：Employee类测试 ===");
        // 创建2-3个员工实例
        Employee e1 = new Employee();
        Employee e2 = new Employee("张三");
        Employee e3 = new Employee("李四");
        
        // 设置员工的department和salary
        e1.setDepartment("北京");
        e1.setSalary(8000);
        
        e2.setDepartment("上海");
        e2.setSalary(12000);
        
        e3.setDepartment("深圳");
        e3.setSalary(15000);
        
        // 输出每个员工的信息
        System.out.println("员工1: 部门=" + e1.getDepartment() + ", 薪资=" + e1.getSalary());
        System.out.println("员工2: 部门=" + e2.getDepartment() + ", 薪资=" + e2.getSalary());
        System.out.println("员工3: 部门=" + e3.getDepartment() + ", 薪资=" + e3.getSalary());
        
        // 输出当前员工总数
        System.out.println("当前员工总数: " + Employee.showCount());
        
        System.out.println("\n=== 任务2：Class1和Class2交互测试 ===");
        // 测试Class2调用Class1的方法
        Class2 class2 = new Class2();
        class2.method2();
        
        System.out.println("\n=== 任务3：Circle和Cylinder类测试 ===");
        // 创建一个圆柱体实例
        Cylinder cylinder = new Cylinder(5.0, 10.0); // 半径为5.0，高度为10.0的圆柱体
        
        // 计算并打印圆柱体的半径和体积
        System.out.println("圆柱体的半径: " + cylinder.getRadius());
        System.out.println("圆柱体的体积: " + cylinder.getVol());
    }
}