import java.util.*;

class oddSum {
    public static int sum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if (i % 2 != 0){
                sum = sum + i;
            }else{
                continue;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int num = sc.nextInt();

        int sumOfOdd = sum(num);

        System.out.println(sumOfOdd);
    }
}