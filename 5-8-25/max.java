import java.util.*;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
         int max = 0;

        for (int i = 0; i < size; i++){
            System.out.print("Enter the element at " + "[" + i + "]: ");
            arr[i] = sc.nextInt();  
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("The maximum is: " + max);


        sc.close();
        

        
    }
    
}
