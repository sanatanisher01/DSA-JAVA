import java.util.*;
public class P_4_Accept_name_age_and_print_formatted_output{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("Hello "+name+", you are "+age+" years old");
    }
}
