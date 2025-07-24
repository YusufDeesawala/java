import java.util.*;

class evenNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 0; i < n + 1; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }else{
                continue;
            }
        }


    }
}