// Welcome to CodeCollab!
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Reverse a number
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        String st = "";
        while(num > 0){
            st = st + (num%10);
            num = num/10;
        }
        System.out.print(st);
    }
}
