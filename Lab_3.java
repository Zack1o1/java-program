package LAB_Report;
/*
3. Write a program in Java to demonstrate encapsulation or data hiding: demonstrate how getter
and setter methods can be used to access and manipulate the private variables
 */
class CricketPlayer{
    private String name;
    private String nationality;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class Lab_3 {
    public static void main(String[] args) {
        // we can hide the data using private access modifier
        // we can manipulate private variable using getter and setter methods

        CricketPlayer player = new CricketPlayer();
        player.setName("Lalit Rajbanshi");
        player.setAge(24);
        player.setNationality("Nepal");
        System.out.println("Player Info:");
        System.out.println("Player: "+player.getName());
        System.out.println("Age: "+player.getAge());
        System.out.println("Nationality: "+player.getNationality());

    }
}
