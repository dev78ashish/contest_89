import java.util.Scanner;

public class contest89_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            long[] a = new long[n];
            a[0] = 1;
            for (int i = 1; i < n; i++) {
                a[i] = 2 * a[i - 1];
            }
            long[] c = new long[n];
            for (int i = 0; i < n; i++) {
                c[i] = b[i] * a[i];
            }
            long p = 0, q = 0, s = 0;
            for (int i = 0; i < n; i++) {
                s += c[i];
                if (s > 0) {
                    p += i + 1;
                } else {
                    q += i + 1;
                }
            }
            System.out.println(Math.abs(p - q));
        }
        sc.close();
    }
}
