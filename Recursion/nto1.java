public class Main {
    static void oneton(int n){
        if (n > 10) {
            return;
        }
        oneton(n + 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        oneton(1);
    }
}
