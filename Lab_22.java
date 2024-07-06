package LAB_Report;
/*
22. Write a program in Java to show the concept of up-casting and down-casting in Java.
*
 * Upcasting:
 * - Upcasting involves treating a subclass object as its superclass type.
 * - It is implicit and safe, as it moves up the inheritance hierarchy.
 * - Example: God demonToGod = new Demon(); // Upcasting
 * - Accessing only superclass methods is allowed: demonToGod.godPower();
 *
 * Downcasting:
 * - Downcasting involves casting a superclass reference back to its subclass type.
 * - It is explicit and requires a cast operator, potentially risking ClassCastException.
 * - Example: Demon god = (Demon) demonToGod; // Downcasting
 * - Allows accessing subclass-specific methods: god.demonPower();
 *
 * Key Points:
 * - Upcasting allows polymorphic behavior and treating objects generically.
 * - Downcasting is used to access subclass-specific behaviors or fields.
 * - Proper type checking should be ensured during downcasting to avoid runtime errors.
 */
class God{
    public void godPower(){
        System.out.println("God power");
    }
}
class Demon extends God{
    public void demonPower() {
        System.out.println("Demon power");
    }
}
public class Lab_22 {
    public static void main(String[] args) {
        System.out.println("Upcasting");
        God demonToGod = new Demon();
        demonToGod.godPower();

        System.out.println("Downcasting");
        Demon god = (Demon) demonToGod;
        god.demonPower();

    }
}
