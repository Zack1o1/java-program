package LAB_Report;
/*
2. Write a program in Java to demonstrate the usage of access modifiers: public, private,
protected and default.
*/
class AccessModifier{
    int defaultValue;               // this is visible within the package only
    public int publicValue;         // this is visible everywhere
    protected int protectedValue;   // this is visible within the package and subclasses
    private int privateValue;       // this is visible within the class only

    public void setPrivateValue(int privateValue) {
        this.privateValue = privateValue;
    }
    public int getPrivateValue() {
        return privateValue;
    }
}
class AccessModifierProtected extends AccessModifier{

    public void setProtValue(int protectedValue){
        this.protectedValue = protectedValue;
    }
    public int getProtValue(){
       return protectedValue;
    }
}
public class Lab_2 {
    public static void main(String[] args) {
        AccessModifier am = new AccessModifier();
        AccessModifierProtected amp = new AccessModifierProtected();
        // Access Modifiers are used for encapsulation purposes for security reason

        am.defaultValue = 1;
        System.out.println("Default Value:"+am.defaultValue);
        // Default access modifier is written without any keyword
        // We can access default modifier within the same package
        // In this package "defaultValue" is initialized as default modifier in the class "AccessModifier"
        // Therefore I can access it in the same class "AccessModifier"
        // child class as it is in the same package and in the main function too

        am.publicValue = 2;
        System.out.println("Public Value:"+ am.publicValue);
        // Public access modifier is achieved using "public" keyword
        // we access the defaultValue of Public modifier everywhere within or outside the package subclasses
        // In this package "publicValue" is initialized as Public modifier in the class "AccessModifier"
        // So, it accessible everywhere in the subclass, main function

        am.protectedValue = 3;
        System.out.println("Protected Value(same package):"+ am.protectedValue);
        amp.setProtValue(4);
        System.out.println("Protected Value(childClass):"+ amp.getProtValue());
        // Protected access modifier is written with "protected" keyword
        // we can access the defaultValue of Protected keyword within the package or subclasses
        // Here, in this program, I have initialized "protectedValue" as Protected modifier
        // and also created subclass "AccessModifierProtected"
        // now I can access this protected protectedValue within the class AccessModifier and its subclass

        am.setPrivateValue(5);
        System.out.println("Private Value:"+ am.getPrivateValue());
        // Private access modifier is written with "private" keyword
        // we can access private modifier defaultValue within same class only
        // Here, the defaultValue of privateValue is initialized as Private defaultValue
        // So, I can access this in the same class AccessModifier only
        // to access this defaultValue we can make getter and setter in the same class
        // I have made the setPrivateValue and getPrivateValue methods to set and get defaultValue of the private modifier
        // It is beneficial to use private modifier if we don't wanna give direct access to the variable
    }
}
