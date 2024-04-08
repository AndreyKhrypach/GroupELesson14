import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Lesson14Program {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 6, 10, 24};
        System.out.println(Arrays.toString(numbers));
        ArrayUtils.reverse(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
