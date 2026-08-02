// Welcome to CodeCollab!
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Automorphic number
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int square = num * num;
        int count = 0;
        int org = num;
        int mod = 1;
        while(num>0){
            count +=1;
            num = num/10;
        }
        for (int i = 0; i<count; i++){
            mod = mod *10;
        }
        int check = square % mod;
        if(check == org){
            System.out.print("Automorphic Number");
        }
        else{
            System.out.print("Not a Automorphic Numberr");
        }
    }
}
