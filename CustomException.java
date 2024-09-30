package practice;

import java.util.*;

// create class that extends Exception class
class InvalidAge extends Exception{
    // have constructor with super to send error message
    public InvalidAge(String message){
        super(message);
    }
}
// now create custom exception class
public class CustomException {
    // make the method static and throws the exception class created above
    public static void checkAge(int age) throws InvalidAge{
        if(age < 18){
            throw new InvalidAge("Under Age can't drive"); // throw error
        }
        else {
            System.out.println("You can drive");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        try{
            checkAge(age);
        }
        catch(InvalidAge e){
            System.out.println(e.getMessage());
        }
    }
}
