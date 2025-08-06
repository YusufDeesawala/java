import java.util.*;

class combinedLength{

    public static int combLen(String[] list){
        int count = 0;
        int len = list.length;
        for (int i = 0; i < len; i++){
            count = count + list[i].length();
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of word you want to enter: ");
        int len = sc.nextInt();

        String [] words = new String[len];

        for (int j = 0; j < len; j++){
            System.out.print("Enter the word at " + j + " :");
            words[j] = sc.next();
        }

        System.out.println("The combined length is: " + combLen(words));

    }
}