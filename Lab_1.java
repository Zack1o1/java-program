package LAB_Report;
/*1. Write a program in Java to:
    a. create a class named “Student” with its member variables and member functions.
    name. Create its objects.
    c. Show how the member variables and functions can be accessed.
 */
class Student{
    String stdName;
    int stdId;

    public void displayInfo(){
        System.out.println("Name:"+stdName);
        System.out.println("ID:"+stdId);
    }
}

public class Lab_1 {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.stdName = "Zack";
        std1.stdId = 1;
        std1.displayInfo();

    }
}
