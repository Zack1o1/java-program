package LAB_Report;
//  14. Write a program in Java to demonstrate final methods and final variables.
/*
Facts about Final Variables and Final Methods in Java:

Final Variables:
1. Final variables in Java are constants and cannot be changed once initialized.
2. They are declared using the 'final' keyword.
3. Final variables must be initialized either at the time of declaration or in the constructor.
4. They are often used to declare constants, such as mathematical constants or configuration parameters.

Final Methods:
1. Final methods in Java cannot be overridden by subclasses.
2. They are declared using the 'final' keyword before the return type in the method declaration.
3. Final methods ensure that the method's implementation remains unchanged across all subclasses.
4. They are useful when a method's behavior should not be altered or extended by subclasses.
5. Final methods are typically used for critical operations or methods that define fundamental behaviors in a class hierarchy.
*/
class Final{
    final double pi = 3.14;
    final public void display(){
        System.out.println("Hi, I am final "+ pi +"PI");
    }
}
class FinalChild extends Final{
    public void displayF(){
        System.out.println("Shit! I can't change u PI");
    }
}
public class Lab_14 {
    public static void main(String[] args){
        Final f = new Final();
        f.display();
        FinalChild fc = new FinalChild();
        fc.displayF();
    }
}
