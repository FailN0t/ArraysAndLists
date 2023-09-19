import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40};
        ArrayList<Integer> values = new ArrayList<>();
        values.addAll(Arrays.asList(numbers));
        for (Integer value : values) {
            System.out.println(value);
        }

        Integer[] nums = values.toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums));
    }
}
