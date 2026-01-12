
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        /*
        type-1
        
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        String nums = Arrays.toString(numbers);
        System.out.println(nums);*/

 /* Type-2
        int[] numbers = {1, 2, 3, 4, 6, 5};
        System.err.println(numbers.length);
         */
        int[] numbers = {4, 6, 5, 1, 2, 3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
