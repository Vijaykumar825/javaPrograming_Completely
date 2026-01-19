
/**
 * Encapsulation in Java
 *
 */
class Shape {

    public void area() {
        System.out.println("Area of Shape");
    }
}

// Single Inheritance
class Triangle extends Shape {

    public void area(double l, double h) {
        System.out.println(0.5 * l * h);
    }
}

// Multilevel Inheritance
class EquilateralTriangle extends Triangle {

    public void area(double l) {
        System.out.println((Math.sqrt(3) / 4) * l * l);
    }
}

// Hierarchical Inheritance
class Circle extends Shape {

    public void area(double r) {
        System.out.println(Math.PI * r * r);
    }
}

public class Main {

    public static void main(String[] args) {

        Triangle t = new Triangle();
        t.area(10, 5);

        EquilateralTriangle et = new EquilateralTriangle();
        et.area(6);

        Circle c = new Circle();
        c.area(7);
    }
}
