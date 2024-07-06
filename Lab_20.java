package LAB_Report;
/*
 * 20. Write a program in Java to show method overloading by changing the number of parameters.
 *
 * Key Points about Method Overloading:
 *
 * 1. Definition:
 *    - Method overloading is a feature that allows a class to have more than one method having the same name, if their parameter lists are different.
 *    - It provides flexibility by enabling a method to perform different tasks based on the number or type of parameters.
 *
 * 2. Method Overloading Rules:
 *    - Methods can be overloaded by changing the number of parameters, changing the type of parameters, or both.
 *    - Return type may or may not be different for overloaded methods.
 *
 * Example Explanation:
 *
 * 1. Class Definition:
 *    - `MethodOverloading` class defines three `add` methods, each with a different number of parameters.
 *    - These methods demonstrate method overloading by changing the number of parameters while keeping the method name the same.
 *
 * 2. Main Method:
 *    - `Lab_20` class contains the `main` method.
 *    - An instance of `MethodOverloading` is created (`mo`).
 *    - Different overloaded `add` methods are called with varying numbers of arguments (`1`, `1, 2`, `1, 2, 3`).
 *    - Results of method calls (`sum1`, `sum2`, `sum3`) are printed to the console.
 */


class MethodOverloading{
    public int add(int a){
        return a;
    }
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }
}
public class Lab_20 {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        int sum1 = mo.add(1);
        int sum2 = mo.add(1,2);
        int sum3 = mo.add(1,2,3);
        System.out.print("Sum1: "+ sum1 +"\n" + "Sum2: "+ sum2 + "\n" + "Sum3: " + sum3);
    }
}
