import java.util.Arrays;

public class TestSample {

    static int failures = 0;

    static void check(String name, long[] actual, long[] expected) {
        if (Arrays.equals(actual, expected)) {
            System.out.println("PASS " + name);
        } else {
            failures++;
            System.out.println("FAIL " + name + ": expected " + Arrays.toString(expected)
                    + " but got " + Arrays.toString(actual));
        }
    }

    public static void main(String[] args) {
        check("sample 1", Main.peakWindow(8, 5, new long[]{1, 2, 3, 7, 8, 9, 10, 11}), new long[]{5, 11});
        check("sample 2", Main.peakWindow(4, 2, new long[]{5, 1, 4, 2}), new long[]{2, 2});
        if (failures > 0) {
            System.exit(1);
        }
    }
}
