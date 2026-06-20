public class P_6_Swap_two_numbers_with_without_3rd_variable{
    public static void main(String[] args) {
        int a = 10, b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = "+a+" b = "+b);
        int c = b;
        b = a;
        a = c;
        System.out.println("After 3 variable: a = "+a+" b = "+b);
    }
}