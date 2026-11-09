import java.util.*;// Welcome to CodeCollab!
public class Main {
    public static String reverseStr(String str){
        Stack<Character> s = new Stack<>();
        int idx= 0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder newstr = new StringBuilder();
        while(!s.isEmpty()){
            newstr.append(s.pop());
        }
        return newstr.toString();
    }

    public static void main(String[] args) {
        String s = "aryan";
        System.out.println(reverseStr(s));
    }
}
