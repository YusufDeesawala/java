import java.util.*;

class eBecomesI {
    public static String converter(String word){
        String newString = "";
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == 'e'){
                newString = newString + "i";
            }else if (word.charAt(i) == 'E'){
                newString = newString + "I";
            }else{
                newString = newString + word.charAt(i);
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String word = sc.nextLine();

        System.out.println("The result is : " + converter(word));
    }
}