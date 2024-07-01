package LAB_Report;
import LAB_Report.Package.ImportExample;
/*
5. Write a program in Java to access or import and use the classes of a package and in another
package
 */

public class Lab_5 {
    public static void main(String[] args) {
        ImportExample im = new ImportExample();     // created an instance of imported class
        im.displayMessage();

        // import keyword is useful to import the class from another file
    }
}
