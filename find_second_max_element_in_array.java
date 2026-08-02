// Welcome to CodeCollab!
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //find_second_max_element_in_array.java
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();

        }
        int max1 = arr[0];
        int max2 = 0;
        for(int i = 1; i<n; i++){
            if(arr[i]>max1){
        
                max1=arr[i];
            }
        }
        for(int i = 1; i<n; i++){
            if(arr[i] != max1 && arr[i] > max2){
                max2 = arr[i];
            }
        }
        System.out.print(max2);

    }
}
