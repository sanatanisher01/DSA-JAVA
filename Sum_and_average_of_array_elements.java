// Welcome to CodeCollab!
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Sum & average of array elements
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum = "+ sum);
        System.out.print("Avg = "+ sum/n);
        
    }
}
