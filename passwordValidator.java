// ------------------ password validator--------------------------
 
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password : ");
        String str = sc.nextLine();

        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        // boolean hasSpecial = false;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z'){
                hasUpper = true;
            }
            if(ch>='a' && ch<='z'){
                hasLower = true;
            }
            if(ch>='0' && ch<='9'){
                hasDigit = true;
            }
        }

        if(hasDigit && hasUpper && hasLower && str.length()>=8){
            System.out.println("Password is Valid");
        }
        else{
            System.out.println("-----FEEDBACK-----");
            if(!hasDigit){
                System.out.println("Password must have one Digit");
            }
            if(!hasUpper){
                System.out.println("Password must have one Upper Case");
            }
            if(!hasLower){
                System.out.println("Password must have one Lower Case");
            }
        }

        sc.close();
    }
}
