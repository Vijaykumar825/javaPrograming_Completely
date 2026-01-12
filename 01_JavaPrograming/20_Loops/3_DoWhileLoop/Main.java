//Irrespective of the code it atleast execute once

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";

        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();

        } while (!input.equals("quit"));
    }

}
