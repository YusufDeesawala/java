import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        while (n > 0){
            System.err.println(a);
            int c = a + b;
            a = b; 
            b = c;
            n -= 1;
        }


    }
}
