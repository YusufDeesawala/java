import java.util.*;

class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int linear[] = new int[size];

        for (int i = 0; i < linear.length; i++){
            System.out.print("Element at "+ i + " : ");
            linear[i] = sc.nextInt();
        }

        System.out.println("Array Successfully Created!");
        System.out.println();

        System.out.print("Enter Target: ");
        int target = sc.nextInt();   


        for(int i = 0; i < linear.length; i++){
            if( linear[i] == target){
                System.out.println("Target found at " + i);
            }else{
                continue;
            }
        }

    }
}