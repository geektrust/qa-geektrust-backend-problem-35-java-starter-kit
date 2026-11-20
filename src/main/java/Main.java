import java.util.*;
import java.io.*;

public class Main {

    static long[] peakWindow(int n, long w, long[] timestamps) {
        // TODO: return new long[]{maxCount, endTimestampOfEarliestPeakWindow}
        return new long[]{0, 0};
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long w = Long.parseLong(st.nextToken());
        long[] timestamps = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            timestamps[i] = Long.parseLong(st.nextToken());
        }
        long[] result = peakWindow(n, w, timestamps);
        System.out.println(result[0] + " " + result[1]);
    }
}
