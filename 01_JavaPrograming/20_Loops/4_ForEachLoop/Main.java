
/**
 * 1.It is a Forward loop only
 * 2.we canot access the index of this loop
 */
public class Main {

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Orange"};
        /*for (int i = 0; i < fruits.length; i++) {

            System.out.println(fruits[i]);


        }*/
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
