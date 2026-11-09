// Welcome to CodeCollab!
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String digits = "69";
        String[] chars = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> ans = new ArrayList<>();
        solve(digits,0,"",chars,ans);
        System.out.print(ans);

    }
    public static void solve(String digits, int index, String curr, String[] chars, ArrayList<String> ans){
        if(index == digits.length()){
            ans.add(curr);
            return;
        }
        int digit = digits.charAt(index)-'0';
        String letters = chars[digit];
        for(int i = 0; i<letters.length(); i++){
            char ch = letters.charAt(i);
            solve(digits,index+1,curr+ch,chars,ans);
        }

    }
}
