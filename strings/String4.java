//Qs. Input an email from the user. You have to create a username from the email by 
//deleting the part after '@'. Display that username to the user.

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        String userName = "";

        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                break;
            } else {
                userName = userName + email.charAt(i);
            }
        }
        System.out.println(userName);
    }
}
