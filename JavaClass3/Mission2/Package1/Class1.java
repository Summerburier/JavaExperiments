package Mission2.Package1;
import Mission2.Package2.Class2;

public class Class1 {
     public void method1() {
        System.out.println("Class1.method1");
        Class2 c2 = new Class2();
        c2.method2();
    }
}
