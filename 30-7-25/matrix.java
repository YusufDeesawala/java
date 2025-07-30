import java.util.*;

class matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        System.out.println();

        int [][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print("Enter the value at (" + i + "," + j + "): " );
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println();
        }

        sc.close();


    }
}