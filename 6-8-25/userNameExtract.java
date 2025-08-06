import java.util.*;

class userNameExtract {
    public static String user(String email){
        String userName = "";
        for (int i = 0; i < email.length(); i++){
            if (email.charAt(i) == '@'){
                break;
            }else{
                userName = userName + email.charAt(i);
            }
        }
        return userName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String email = sc.nextLine();

        System.out.println("Your username is: " + user(email));
    }
}