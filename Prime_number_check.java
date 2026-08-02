// Welcome to CodeCollab!
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Prime number check
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = true;
        for(int i = 2;i<n; i++){
            if(n%i ==0){
                ans = false;
            }
            
        }
        if(ans){
            System.out.print("Prime number");
        }
        else{
            System.out.print("Not a prime");
        }
    }
}
