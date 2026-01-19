
/*class Pen {

    String color;
    String type;//ballpoin;gel

    public void write() {
        System.out.println("Writing Something");
    }

    public void printColor() {
        System.out.println(this.color);

    }

}

class Student {

    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    Student() {
        System.out.println("Constructor called");
    }
}

public class OOPS {

    public static void main(String[] args) {

        /*Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";
        pen1.printColor();
        pen2.printColor();
 */
 /* Student s1 = new Student();
        s1.name = "vijay";
        s1.age = 22;
        s1.printInfo();

    }

}*/
//constructores this is an example for copy constructor
class Student {

    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    Student() {

    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

}

public class OOPS {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 24;
        Student s2 = new Student(s1);
        s2.printInfo();
    }

}
