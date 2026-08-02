// Welcome to CodeCollab!
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Strong number check
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;
        int orginal = num;
        while(num > 0){
            int digit = num%10;
            int fact = 1;
            for(int i = 1; i <= digit; i++){
                fact = fact * i;
            }
            ans = ans + fact;
            fact = 0;
            num = num / 10;
        }
        if(orginal == ans){
            System.out.print("Strong Number");

        }
        else{
            System.out.print("Not a Strong Number");
        }
    }
}
