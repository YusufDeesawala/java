import java.util.*;

class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input");
        } else if (n == 1) {
            System.out.println("1 is not Prime");
        } else if (n == 2) {
            System.out.println("2 is Prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(n + " is Prime");
            } else {
                System.out.println(n + " is not Prime");
            }
        }

        sc.close(); 
    }
}
