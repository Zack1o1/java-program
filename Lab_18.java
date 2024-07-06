package LAB_Report;
/*
* 18. Write a program in Java to demonstrate interface in Java.
*
* Key Points about Interfaces:
*
* 1. Definition:
*    - An interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
*    - Interfaces cannot contain instance fields or constructors.
*
* 2. Abstract Methods:
*    - All methods in an interface are abstract by default (implicitly abstract and public).
*    - Starting from Java 8, interfaces can also have default methods (with a default implementation) and static methods.
*
* 3. Implementing Interfaces:
*    - A class that implements an interface must provide implementations for all of its abstract methods.
*    - The `implements` keyword is used to implement an interface.
*
* 4. Multiple Inheritance:
*    - A class can implement multiple interfaces, allowing for a form of multiple inheritance.
*    - This is useful for defining capabilities that can be shared across different classes.
*
* 5. Interface vs Abstract Class:
*    - Interfaces cannot contain constructors, while abstract classes can.
*    - A class can implement multiple interfaces but can only extend one class.
*    - Interfaces are ideal for defining common behavior that can be shared across unrelated classes.
*
* 6. Polymorphism:
*    - Interfaces allow for polymorphic behavior, enabling a class to be referenced by its interface type.
*
* Example Explanation:
*
* 1. Interface Declaration:
*    - `InterfaceClass` is an interface with one abstract method `display`.
*
* 2. Class Implementation:
*    - `InterfaceClassImpl` implements the `InterfaceClass` interface and provides an implementation for the `display` method.
*
* 3. Main Class:
*    - `Lab_18` contains the `main` method.
*    - An instance of `InterfaceClassImpl` is created, and its `display` method is called.
*/


interface InterfaceClass{
    void display();
}
class InterfaceClassImpl implements InterfaceClass{
    @Override
    public void display() {
        System.out.println("Interface Class Implemented");
    }
}
public class Lab_18 {
    public static void main(String[] args){
        InterfaceClassImpl im = new InterfaceClassImpl();
        im.display();
    }
}
