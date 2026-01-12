
import java.awt.Point;

public class Main {

    public static void main(String[] args) {
        /*byte x = 1;
        byte y = 2;
        x = 2;*/
        Point point1 = new Point(1, 1
        );
        Point point2 = point1;
        point1.x = 2;

        System.out.println(point2);
    }

}
//for 1st -->here x and y are completly independent


//here for 2nd--> here the x and y value are dependent on each other i.e the point1 and point2 are pointing toward the same refrence id so either one of them changed the other one automatically chnages 
