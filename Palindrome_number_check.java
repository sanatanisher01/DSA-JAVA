// Welcome to CodeCollab!
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Palindrome number check
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int org = num;
        int rev = 0;
        while(num > 0){
            rev = rev *10 + (num%10);
            num = num / 10;
        }
        if( rev == org){
            System.out.print("Palindrome number");

        }
        else{
            System.out.print(" Not a palindrome number");
        }

    }
}
