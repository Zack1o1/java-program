package LAB_Report;

/*
 * Program in Java to demonstrate object destruction using finalize() method.
 */

/*
 * Facts about Destructors and finalize() method in Java:
 *
 * 1. Java does not have destructors like some other programming languages (e.g., C++).
 * 2. Instead of destructors, Java uses a garbage collector to automatically manage memory.
 * 3. The `finalize()` method is provided in Java classes to perform cleanup operations before an object is garbage collected.
 * 4. `finalize()` method syntax:
 *      - It is a protected method defined in the `Object` class.
 *      - Any class can override `finalize()` to add specific cleanup behavior.
 *      - Syntax: protected void finalize() throws Throwable { ... }
 * 5. Execution of `finalize()`:
 *      - The JVM calls `finalize()` on an object before reclaiming its memory.
 *      - There is no guarantee when `finalize()` will be called, or even if it will be called at all.
 *      - It's not recommended to rely on `finalize()` for critical resource cleanup due to its non-deterministic nature.
 * 6. Garbage Collection:
 *      - Java's garbage collector automatically identifies and deletes objects that are no longer referenced (garbage).
 *      - Objects become eligible for garbage collection when they are no longer reachable by any live thread.
 * 7. Best Practices:
 *      - Use `finalize()` only for non-critical cleanup tasks, such as closing files or releasing resources.
 *      - For critical resources (e.g., file handles, database connections), use explicit `close()` methods or try-with-resources.
 * 8. System.gc() and `finalize()`:
 *      - Calling `System.gc()` suggests the JVM to run the garbage collector, but it does not guarantee immediate execution.
 *      - `finalize()` may be called after `System.gc()`, but the exact timing is not guaranteed.
 */

class ObjectDestruction {
    // Method called by garbage collector before destroying the object
    public void finalize() {
        System.out.println("Object is destroyed");
    }
}

public class Lab_8 {
    public static void main(String[] args) {
        ObjectDestruction obj1 = new ObjectDestruction();
        obj1.finalize(); // Explicitly calling finalize() (not recommended in practice)
        System.gc(); // Suggesting JVM to run garbage collector (not recommended in practice)
    }
}
