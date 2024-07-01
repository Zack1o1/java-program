package LAB_Report;
// 12. Write a program in Java to implement multilevel inheritance.
/*
Facts about Multilevel Inheritance in Java:
1. Multilevel inheritance occurs when a class is derived from another class, which is also derived from another class.
2. Use the `extends` keyword to implement inheritance at each level.
3. Public and protected members of the superclass are accessible in all derived classes.
4. Private members of the superclass are not directly accessible in derived classes.
5. Subclasses can override methods of their superclass using the `@Override` annotation.
6. `super` keyword is used to access methods and fields of the immediate superclass.
7. Multilevel inheritance promotes code reuse across multiple levels of the hierarchy.
8. Each level in the hierarchy can provide its own specific implementation of inherited methods.
9. Changes in a superclass can affect all its subclasses, which should be managed carefully in design.
*/
class GrandFather{
    protected String name = "GrandFather";
    public void display(){
        System.out.println("This is "+name);
    }
}
class Father extends GrandFather{
    @Override
    public void display() {
        super.name = "Father";
        System.out.println("This is "+name);
    }
}
class Son extends Father{
    @Override
    public void display() {
        super.name = "Son";
        System.out.println("This is "+ name);
    }
}

public class Lab_12 {
    public static void main(String[] args){
        GrandFather g = new GrandFather();
        g.display();
        Father f = new Father();
        f.display();
        Son s = new Son();
        s.display();
    }
}
