import java.util.*;
public class contest89_1{
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);

        int t = dev.nextInt();
        for(int i=0; i<t; i++){
            Float n = dev.nextFloat();
            int x = dev.nextInt();
            float z = n/2;
            if(x>=z)
            System.out.println("YES");
            else
            System.out.println("NO");
        }

        dev.close();
    }
}