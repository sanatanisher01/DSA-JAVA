// Welcome to CodeCollab!
public class Main {
    public static boolean palin(String str, int s, int e){
        if(s>=e){
            return true;
        }
        return str.charAt(s) == str.charAt(e) && palin(str, s+1, e-1);
    }
    public static void main(String[] args) {
        String str = "aryan";
        System.out.print(palin(str,0,str.length()-1));
        
    }
}
