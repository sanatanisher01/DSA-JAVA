// Welcome to CodeCollab!
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Print each digit of a number 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num>0){
            System.out.print(num % 10);
            num = num/10;
        }
        
    }
}
