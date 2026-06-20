import java.util.*;
public class P_8_Compound_Interest_calculation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        int n = sc.nextInt();
        double amount = p * Math.pow((1 + r / (n * 100)), n * t);
        double ci = amount - p;
        System.out.println("Compound Interest: " + ci);
        System.out.println("Total Amount: " + amount);
    }
}