package LAB_Report;
/*
 * 17. Write a program in Java to demonstrate the abstract class in Java.
 *
 * Key Points about Abstract Classes:
 *
 * 1. Definition:
 *    - An abstract class is declared using the 'abstract' keyword.
 *    - It can have abstract methods (methods without a body) as well as concrete methods.
 *
 * 2. Abstract Methods:
 *    - Abstract methods do not have a body; they are declared with a semicolon.
 *    - Any subclass inheriting an abstract class must either implement all abstract methods or be declared abstract itself.
 *
 * 3. Concrete Methods:
 *    - Abstract classes can have methods with implementation (concrete methods).
 *    - Subclasses can use these methods directly or override them if needed.
 *
 * 4. Constructor:
 *    - Abstract classes can have constructors.
 *    - Constructors of an abstract class are called when an instance of a subclass is created.
 *
 * 5. Fields:
 *    - Abstract classes can have fields (both instance variables and static variables).
 *    - These fields can be initialized within the abstract class.
 *
 * 6. Inheritance:
 *    - An abstract class can extend another class (either abstract or concrete).
 *    - A class can only extend one abstract class due to Java's single inheritance model.
 *
 * 7. Cannot be Instantiated:
 *    - You cannot create an instance of an abstract class directly.
 *    - You can have references of an abstract class type pointing to objects of its concrete subclass.
 *
 * 8. Usage:
 *    - Abstract classes are used to provide a common base class with shared code and force certain subclasses to implement specific methods.
 *    - They are useful in designing large systems with a clear hierarchy and shared functionality.
 *
 * Example Explanation:
 *
 * 1. Abstract Class Declaration:
 *    - 'AbstractClass' is an abstract class.
 *    - It has one method 'display' with an empty implementation, which is a concrete method.
 *
 * 2. Subclass Implementation:
 *    - 'AbstractChild' extends 'AbstractClass'.
 *    - It overrides the 'display' method to provide its specific implementation.
 *
 * 3. Main Class:
 *    - 'Lab_17' contains the 'main' method.
 *    - An instance of 'AbstractChild' is created and its 'display' method is called, printing "Abstract class implemented".
 *
 * Additional Facts:
 *
 * - Abstract Classes vs Interfaces:
 *   - Abstract classes can have both abstract and concrete methods, whereas interfaces (prior to Java 8) could only have abstract methods. From Java 8 onwards, interfaces can have default and static methods.
 *   - A class can implement multiple interfaces but can only extend one abstract class.
 *
 * - Abstract Classes in Hierarchies:
 *   - They are often used in frameworks and libraries to provide a base class that can be extended by users to implement specific behavior while reusing the common functionality.
 */

abstract class AbstractClass {
    public abstract void display();
}

class AbstractChild extends AbstractClass {
    @Override
    public void display() {
        System.out.println("Abstract class implemented");
    }
}

public class Lab_17 {
    public static void main(String[] args) {
        AbstractChild ab = new AbstractChild();
        ab.display();
    }
}
