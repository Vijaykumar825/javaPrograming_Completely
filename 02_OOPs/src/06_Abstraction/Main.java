
/**
 * Data hiding is the process of protecting members of a class from unintendedd changes whereas, abstraction is hiding the implementation details and showing only important/useful parts to the user.
 */
abstract class Animal {

    abstract void walk();

    Animal() {
        System.out.println("Animal constructor called");
    }

    public void eat() {
        System.out.println("eats food");
    }
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse constructor called");
    }

    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {

    Chicken() {
        System.out.println("Chicken constructor called");
    }

    public void walk() {
        System.out.println("walks on 2 legs");
    }
}

public class Main {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}


/**
 * 
 */