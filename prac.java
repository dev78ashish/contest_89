import java.util.*;

public class prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int maxScore = 0;
            boolean[] seen = new boolean[n+1]; // to keep track of which numbers are already seen
            for (int i = 0; i < n; i++) {
                int j = i;
                while (j < n && !seen[a[j]]) {
                    seen[a[j]] = true;
                    j++;
                }
                maxScore = Math.max(maxScore, j-i);
                seen[a[i]] = false;
            }
            System.out.println(maxScore);
        }
        sc.close();
    }
}
