// Welcome to CodeCollab!
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //sum of digits
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num>0){
            sum = sum + (num%10);
            num = num/10;

        }
        System.out.print(sum);
    }
}
