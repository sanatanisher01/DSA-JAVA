import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int result = 1;
        for(int i = 0; i < p; i++){
            result = result * n;
        }
        System.out.print(result);
    }
}