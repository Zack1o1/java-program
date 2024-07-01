package LAB_Report;
// 16. Write a program in Java to demonstrate nested classes in Java (Inner class concept).
/*
Facts about Nested Classes (Inner Classes) in Java:

1. Nested Classes:
   - Java allows you to define a class within another class, known as nested classes.
   - Nested classes are divided into two types: static nested classes and non-static (inner) classes.

2. Inner Classes:
   - Inner classes are non-static nested classes that are associated with an instance of their outer class.
   - They have access to all members (fields and methods) of the outer class, including private members.

3. Accessing Members:
   - Inner classes can access both static and non-static members of the outer class directly.
   - They can access outer class fields and methods using the 'this' keyword followed by the outer class object.

4. Example:
   - In the provided example, class Lab_16 contains an outer class with an inner class Inner.
   - Inner class Inner accesses a private member 's' of the outer class.
   - It also accesses the outer class method 'outerClassMethod()' using 'outerClassMethod()' syntax.

5. Usage:
   - Inner classes are useful for improving encapsulation and logical grouping of classes.
   - They help maintain the organization and clarity of code by grouping related classes together.

6. Best Practices:
   - Use inner classes when a class is logically tied to its outer class and will not be used outside of it.
   - Static nested classes are preferred when the inner class does not require access to instance-specific data of the outer class.
*/
public class Lab_16 {
    private String s = "I am outer class field";
    public void outerClassMethod(){
        System.out.println("I am outer class method");
    }
    class Inner{
        public void display(){

            System.out.println("I am inner class method");
            System.out.println("I can access outer class field :" + s);
            System.out.println("I can access outer class method");
            outerClassMethod();
        }
    }
    public static void main(String[] args){
        Lab_16 ob = new Lab_16();
        System.out.println(ob.s);
        ob.outerClassMethod();

        Lab_16.Inner obIn = ob.new Inner();
        obIn.display();
    }
}
