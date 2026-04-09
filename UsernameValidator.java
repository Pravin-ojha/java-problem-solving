// -------------------------- username validator -----------------------


import java.util.*;
// import java.util.Arrays

public class UsernameValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username : ");
        String str = sc.nextLine();

        if(str.length()<5 || str.length()>15){
            System.out.println("Invalid Username Length");
            return;
        }
        if(str.charAt(0)<'a' || str.charAt(0)>'z'){
            System.out.println("First character must be Lower Case");
            return;
        }
        
        boolean hasDigit = false;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9'){
                hasDigit = true;
            }
            if(!((ch>='a' && ch<='z') || (ch>='0' && ch<='9'))){
                System.out.println("Invalid character Found");
                return;
            }
        }

        if(!hasDigit){
            System.out.println("Username must contain minimum one digit");
            return;
        }

        System.out.println("Valid Username");

        sc.close();
    }
}
