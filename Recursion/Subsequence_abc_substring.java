// Welcome to CodeCollab!
public class Main {
    public static void subsequence(String str, int ind, String curr){
        if(ind == str.length()){
            System.out.println(curr);
            return;
        }
        subsequence(str,ind+1,curr);
        subsequence(str,ind+1,curr+str.charAt(ind));
} 
    public static void subsequence2(String str, int ind, String curr){
        System.out.println(curr);
        for(int i=ind; i<str.length();i++){
            subsequence2(str,i+1,curr+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequence2(str,0,"");
    }
}
