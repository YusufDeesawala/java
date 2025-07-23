import java.util.*;

class oddoreve{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("The number is an even number.");
        }
        else{
            System.out.println("The number is an odd number.");
        }

    }
}