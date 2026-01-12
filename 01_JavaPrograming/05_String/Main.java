
public class Main {

    public static void main(String[] args) {
        String message = "Hello World" + "!!     ";
        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.err.println(message.startsWith("Hello"));
        System.err.println(message.length());
        System.err.println(message.indexOf("H"));
        System.err.println(message.replace("!", "*"));
        System.err.println(message.toLowerCase());
        System.out.println(message.trim());

    }
}
