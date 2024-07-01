package LAB_Report;
// 13. Write a program in Java to demonstrate method overriding.
/*
Facts about Method Overriding in Java:
1. Method overriding occurs when a subclass provides a specific implementation for a method that is already defined in its superclass.
2. Use the `@Override` annotation to indicate that a method is overridden.
3. The method in the subclass must have the same name, return type, and parameters as the method in the superclass.
4. Method overriding allows a subclass to provide a specific behavior for an inherited method.
5. The `super` keyword can be used in the subclass method to call the superclass method.
6. Overridden methods enable polymorphic behavior, allowing a superclass reference to execute subclass methods.
7. Access modifiers in the overridden method should allow for the method to be accessible in the subclass (cannot reduce visibility).
8. Only instance methods can be overridden. Static methods cannot be overridden but can be redefined in the subclass.
9. Constructors cannot be overridden.
10. Final methods cannot be overridden.
*/
class Main{
    public void display(){
        System.out.println("Override Me");
    }
}
class OverRide extends Main{
    @Override
    public void display() {
        System.out.println("Okay, I have overridden you");
    }
}
public class Lab_13 {
    public static void main(String[] args){
        Main m = new Main();
        m.display();
        OverRide o = new OverRide();
        o.display();
    }
}
