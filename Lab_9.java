package LAB_Report;
/*
9. Write a program in Java to implement the chain of constructors.
 */
class ChainCons {
    int age;
    String name;
    public ChainCons(int age){
        this.age = age;
    }
    public ChainCons( String name){
        this(10);
        this.name = name;
    }

    public void display(){
        if( name!=null )
            System.out.println("Name:"+name+" Age:"+age);
        else
            System.out.println("Age:"+age);
    }
}

public class Lab_9 {
    public static void main(String[] args) {
        //        A constructor can call another constructor in the same class using `this()` (Constructor Chaining).
        // *    - Constructor chaining is used to reduce the duplication of code.
        //                *    - The `this()` call must be the first statement in the constructor.
        //                *    - It allows one constructor to reuse the code inside another constructor.
        // *    - It can be used to provide default values or to simplify complex initializations.
        ChainCons pc = new ChainCons(20);
        pc.display();
        ChainCons pc1 = new ChainCons("Hello");
        pc1.display();
    }
}

