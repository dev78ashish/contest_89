import java.util.*;

public class contest89_2 {
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);

        int[] arr = new int[4];

        int t = dev.nextInt();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 4; j++) {
                arr[j] = dev.nextInt();
            }
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[j];
            }
            int max = arr[0]; 
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j]; 
                }
            }
            if(max>sum-max)
            System.out.println("YES");
            else
            System.out.println("NO");
        }

        dev.close();
    }
}
