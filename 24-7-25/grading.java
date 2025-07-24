import java.util.*;

class grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose (1 or 0)? ");
        int choice = sc.nextInt();

        do { 
            System.out.print("Enter the marks (out of 100): ");
            int marks = sc.nextInt();

            if(marks >= 90){
                System.out.println("This is good");
            }else if(marks >= 60 && marks <= 89){
                System.out.println("This is also good");
            }else if(marks >= 0 && marks <= 59){
                System.out.println("This is good as well");
            }else{
                System.out.println("Out of range");
            }

            System.out.print("Choose (1 or 0)? ");
            choice = sc.nextInt();

        } while (choice == 1);
    }
}