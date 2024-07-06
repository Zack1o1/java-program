package LAB_Report;
/*
 * 19. Write a program in Java to show how multiple inheritance by using interfaces.
 *
 * Key Points about Multiple Inheritance using Interfaces:
 *
 * 1. Definition:
 *    - Multiple inheritance is a feature where a class can inherit from more than one parent class.
 *    - In Java, multiple inheritance is achieved using interfaces because Java does not support multiple inheritance with classes to avoid the "diamond problem."
 *
 * 2. Interfaces in Java:
 *    - An interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
 *    - Interfaces cannot contain instance fields or constructors.
 *
 * 3. Implementing Multiple Interfaces:
 *    - A class can implement multiple interfaces, thereby inheriting the abstract methods of all the interfaces.
 *    - This allows a class to inherit behavior from multiple sources.
 *
 * 4. Diamond Problem:
 *    - The diamond problem arises in languages that support multiple inheritance with classes.
 *    - It occurs when a class inherits from two classes that have a common ancestor.
 *    - If both parent classes provide an implementation for the same method from their common ancestor, there is ambiguity as to which method implementation should be inherited by the child class.
 *    - Java avoids the diamond problem by allowing multiple inheritance only through interfaces, where methods are abstract by default and do not contain implementations.
 *
 * Example Explanation:
 *
 * 1. Interface Declarations:
 *    - `Dad` and `Mom` interfaces each declare one method: `dadEye` and `momFace`, respectively.
 *
 * 2. Class Implementation:
 *    - `Daughter` class implements both `Dad` and `Mom` interfaces.
 *    - It provides implementations for the `dadEye` and `momFace` methods.
 *    - An additional method `inherit` is defined to call both `dadEye` and `momFace`.
 *
 * 3. Main Class:
 *    - `Lab_19` contains the `main` method.
 *    - An instance of `Daughter` is created, and the `inherit` method is called to demonstrate multiple inheritance.
 */
interface Dad{
    void dadEye();
}
interface Mom{
    void momFace();
}
class Daughter implements Dad,Mom{
    @Override
    public void dadEye() {
        System.out.println("Dad Eye");
    }
    @Override
    public void momFace() {
        System.out.println("Mom Face");
    }
    public void inherit(){
        dadEye();
        momFace();
    }
}
public class Lab_19 {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.inherit();
    }
}
