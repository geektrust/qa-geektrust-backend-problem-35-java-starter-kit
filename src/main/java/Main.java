import java.util.*;
import java.io.*;

public class Main {

    static long[] peakWindow(int n, long w, long[] timestamps) {
        // TODO: return new long[]{maxCount, endTimestampOfEarliestPeakWindow}
        return new long[]{0, 0};
    }

    public static void main(String[] args) throws IOException {
        // The checker passes each input line as one command-line argument.
        // When run without arguments, the input is read from standard input instead.
        String line1;
        String line2;
        if (args.length >= 2) {
            line1 = args[0];
            line2 = args[1];
        } else {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            line1 = br.readLine();
            line2 = br.readLine();
        }
        StringTokenizer st = new StringTokenizer(line1);
        int n = Integer.parseInt(st.nextToken());
        long w = Long.parseLong(st.nextToken());
        long[] timestamps = new long[n];
        st = new StringTokenizer(line2);
        for (int i = 0; i < n; i++) {
            timestamps[i] = Long.parseLong(st.nextToken());
        }
        long[] result = peakWindow(n, w, timestamps);
        System.out.println(result[0] + " " + result[1]);
    }
}
