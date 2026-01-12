//Used when the no of iteratiions are unknown

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int i = scanner.nextInt();

        while (i < 5) {
            System.out.println(i);
            i += 1;
        }
    }
}
