public class Main {
    static void oneton(int n){
        if (n > 10) {
            return;
        }
        System.out.println(n);
        oneton(n + 1);
    }
    public static void main(String[] args) {
        oneton(1);
    }
}
