package LAB_Report;
//  11. Write a program in Java to implement hierarchical inheritance.
/*
Facts about Hierarchical Inheritance in Java:
1. Hierarchical inheritance occurs when multiple subclasses inherit from a single superclass.
2. Use the `extends` keyword to implement inheritance.
3. Subclasses inherit all non-private fields and methods from the superclass.
4. Subclasses can override superclass methods using the `@Override` annotation.
5. `super` keyword is used to access superclass methods and constructors.
6. Each subclass can provide its own specific implementation of the inherited methods.
7. Hierarchical inheritance promotes code reuse and a structured class hierarchy.
8. Public and protected members of the superclass are accessible in the subclasses.
9. Private members of the superclass are not directly accessible in the subclasses.
10. Changes in the superclass can affect all subclasses, which should be considered in design.
*/

class Cat{
    public String catName = "cat";
    public void display(){
        System.out.println("I am a "+catName);
    }
}
class Soori extends Cat{
    @Override
    public void display() {
        super.catName = "Soori";
        super.display();
//        System.out.println("I am "+catName);
    }
}
class Lusu extends Cat{
    @Override
    public void display() {
        super.catName = "Lusu";
        super.display();
//        System.out.println("I am "+catName);
    }
}

public class Lab_11 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.display();
        Soori s = new Soori();
        s.display();
        Lusu l = new Lusu();
        l.display();
    }
}
