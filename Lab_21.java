package LAB_Report;
/*
 * 21. Write a program in Java to show method overloading by changing the datatype of parameters.
 *
 * Key Points about Method Overloading with Object Return Type:
 *
 * 1. Definition:
 *    - Method overloading allows a class to have multiple methods with the same name but different parameter types.
 *    - Using `Object` as the return type allows flexibility in handling different types of return values from overloaded methods.
 *
 * 2. Reason for Using Object:
 *    - `Object` is the superclass of all classes in Java, providing a universal type that can hold any Java object reference.
 *    - By using `Object` as the return type, each overloaded method (`display`) can return values of different types (`String`, `Integer`, `Double`) without needing separate method signatures.
 *    - This approach simplifies the example by consolidating the return type handling into a single superclass.
 *
 * Example Explanation:
 *
 * 1. Class Definition:
 *    - `MethodOverloadDT` class defines three `display` methods, each with a different parameter type (`String`, `int`, `double`).
 *    - Each method returns an `Object`, allowing them to handle different types of return values dynamically.
 *
 * 2. Main Method:
 *    - `Lab_21` class contains the `main` method.
 *    - An instance of `MethodOverloadDT` (`md`) is created.
 *    - Different overloaded `display` methods are called with arguments of different types (`String`, `int`, `double`).
 *    - Results of method calls (`name`, `age`, `salary`) are stored in `Object` variables and printed to the console.
 */
class MethodOverloadDT{
    public Object display(String name){
        return name;
    }
    public Object display(int age){
        return age;
    }
    public Object display(double salary){
        return salary;
    }
}
public class Lab_21 {
    public static void main(String[] args) {
        MethodOverloadDT md = new MethodOverloadDT();
        Object name = md.display("Lalit");
        Object age = md.display(20);
        Object salary = md.display(50000.0);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: Rs." + salary);
    }
}
