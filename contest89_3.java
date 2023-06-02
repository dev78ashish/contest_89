import java.util.*;
public class contest89_3 {
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);


        int t = dev.nextInt();
        for(int i=0; i<t; i++){
            String str = dev.next();
            String a = str.substring(0, 2);
            String b = str.substring(3, 5);
            int c=Integer.parseInt(a); 
            int d=Integer.parseInt(b);
            if(c<=12 && d<=12)
            System.out.println("BOTH"); 
            if(c>12)
            System.out.println("DD/MM/YYYY");
            if(d>12)
            System.out.println("MM/DD/YYYY");
        }


        dev.close();
    }
}
