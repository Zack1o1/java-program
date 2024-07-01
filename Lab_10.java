package LAB_Report;

//  10. Write a program in Java to implement single inheritance

/*
Facts about Single Inheritance in Java:
1. Single inheritance means a class (subclass) inherits from one superclass.
2. Use the `extends` keyword to implement inheritance.
3. Subclass inherits all non-private fields and methods from the superclass.
4. Subclass can override superclass methods using the `@Override` annotation.
5. `super` keyword is used to access superclass methods and constructors.
6. Subclass can call the superclass constructor using `super()`.
7. Public and protected members of the superclass are accessible in the subclass.
8. Private members of the superclass are not directly accessible in the subclass.
9. Single inheritance promotes code reuse and simplicity in class hierarchy.
10. Changes in the superclass can affect all subclasses, highlighting a potential limitation.
*/

class BIT{
    public String bitHead = "Java";
    public void display(){
        System.out.println("This is BIT class");
    }
}
class Sem2 extends BIT{

    public void getBitHead(){
        System.out.println(super.bitHead);
    }
    public void display(){
        System.out.println("This is sem-2 BIT class");
    }
}
public class Lab_10 {
    public static void main(String[] args) {
        BIT b = new BIT();
        b.display();
        Sem2 s = new Sem2();
        s.getBitHead();
        s.display();
    }
}
