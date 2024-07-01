package LAB_Report;
//  15. Write a program in Java to demonstrate the final class.
/*
Facts about Final Classes in Java:

1. Final Classes:
   - A final class in Java cannot be subclassed or inherited.
   - It is declared using the 'final' keyword before the class definition.
   - Final classes are typically used when a class is complete and should not be extended or modified.

2. Usage:
   - Final classes provide security and performance benefits.
   - They prevent unintended changes to critical implementations.
   - Useful for utility classes, where extending the class could lead to unexpected behavior.

3. Characteristics:
   - Final classes cannot have subclasses.
   - All methods in a final class are implicitly final (cannot be overridden), although this is redundant to declare.

4. Example:
   - In the provided example, class A is declared as final, and it contains a method display().
   - This method cannot be overridden by any subclass because class A itself cannot be subclassed.

5. Best Practices:
   - Use final classes judiciously, where extension is not required and could potentially compromise design integrity.
*/
final class A{
    public void display(){
        System.out.println("I am final");
        System.out.println("No one can inherit me");
    }
}

public class Lab_15 {
    public static void main(String[] args){
        A a = new A();
        a.display();
    }
}
