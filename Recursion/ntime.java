// Welcome to CodeCollab!
public class Main {
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println("Aryan");
        print(n-1);
    }
    public static void main(String[] args) {
        print(5);
    }
}
