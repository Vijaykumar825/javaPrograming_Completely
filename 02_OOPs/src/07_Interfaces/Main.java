
/**
 * The proper abstraction i.e hiding or removing the useless data is only achieved by interfaces in Java.
 * defined using the interface keyword.
 * Interfaces can not have constructors because they cannot be used to create objects directly.
 */
interface Animal {

    void walk();

    void eat();
}

class Horse implements Animal {

    Horse() {
        System.out.println("Horse constructor called");
    }

    public void walk() {
        System.out.println("walks on 4 legs");
    }

    public void eat() {
        System.out.println("eats food");
    }
}

public class Main {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}
