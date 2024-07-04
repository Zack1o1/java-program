package LAB_Report;
/*
7. Write a program in Java to demonstrate parameterized constructor.
 */

class ParamCons{
    int age;
    String name;
    public ParamCons(int age){
      this.age = age;
    }
    public ParamCons(String name){
        this.name = name;
    }
    public void display(){
        if( name!=null )
            System.out.println("Name:"+name);
        else
            System.out.println("Age:"+age);
    }
}

public class Lab_7 {
    public static void main(String[] args) {
        /*
         * Facts about Constructors in Java:
         * 1. A constructor is a special method that is called when an object is instantiated.
         * 2. The constructor is used to initialize the state of an object.
         * 3. Constructors do not have a return type, not even void.
         * 4. Constructors must have the same name as the class they are in.
         * 5. There are two types of constructors:
         *    - Default Constructor: Takes no arguments. If no constructor is defined, Java provides a default constructor.
         *    - Parameterized Constructor: Takes arguments to initialize an object with specific values.
         * 6. Constructor Overloading: A class can have multiple constructors with different parameters (different signatures).
         * 7. If a class has at least one constructor, Java does not provide a default constructor.
         * 8. A constructor can call another constructor in the same class using `this()` (Constructor Chaining).
         * 9. Constructors can have access modifiers to control the visibility: public, private, protected, or default (package-private).
         * 10. Static constructors do not exist in Java; all constructors are instance-level.
         */

        ParamCons pc = new ParamCons(10);
        pc.display();
        ParamCons pc1 = new ParamCons("Hello");
        pc1.display();
    }
}
