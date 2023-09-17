
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] value = {234, 79, 4342, 789};
        System.out.println(Arrays.toString(value));
        int[] a = {5, 6, 7};
        int[] b = {5, 6, 7};

        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.compare(a, b));

        int[] c = {5, 6, 7};
        System.out.println(Arrays.compare(a, c));

        int[] d = {5, 6, 9};
        System.out.println(Arrays.compare(a, d));

        int[] e = {5, 6, 6};
        System.out.println(Arrays.compare(a, e));

        int[] f = {5, 6, 7, 10};
        System.out.println(Arrays.compare(a, f));

        int[] g = {5, 6};
        System.out.println(Arrays.compare(a, g));

        int[] h = {5, 6, 7, 10};
        int[] i = {5, 6, 8};
        System.out.println(Arrays.compare(h, i));

        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] firstElements = Arrays.copyOf(values, 5);
        System.out.println(Arrays.toString(firstElements));

        int[] fragment = Arrays.copyOfRange(values, 2,4);
        System.out.println(Arrays.toString(fragment));

        int[] val = new int[20];
        Arrays.fill(val, -1);
        System.out.println(Arrays.toString(val));
    }
}
