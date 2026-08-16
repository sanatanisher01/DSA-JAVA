// Welcome to CodeCollab!
import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int right = arr.length-1;
        int left = 0;
        while(left<right){
            if(arr[left]<0){
                left++;
                
                
            }
            else if(arr[right]>=0){
                right --;
            }
            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
