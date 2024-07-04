package LAB_Report;
/*
6. Write a program in Java to demonstrate default (no-arg) constructor
 */
class NoArgConstructor{
    public NoArgConstructor(){
        System.out.println("Default constructor is initiated!");
    }
    public void display(){
        System.out.println("Done!");
    }
}
public class Lab_6 {
    public static void main(String[] args) {
        // In java, constructor is used to initialize the object
        // constructor is made using the class name itself without return type
        // If we do not make constructor in class, the default constructor is called without any arguments
        // constructor is called at the time of initialization of object
        NoArgConstructor ar = new NoArgConstructor();
        ar.display();

        // here as we make object of ar, and it does not take any arguments so the default constructor
        // is called
    }
}
