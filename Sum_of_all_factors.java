// Welcome to CodeCollab!
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Sum of all factors
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 2; i<num; i++){
            if(num % i == 0){
                sum +=i;
            }
        }
        System.out.print(sum);
    }
}
