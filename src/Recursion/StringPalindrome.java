package Recursion;

public class StringPalindrome {
    static boolean isPalindrome(String s){
        return helperPalindrome(s,0,s.length()-1);

    };


    static boolean helperPalindrome(String s, int l, int r){
        if(l>=r) return true;
        if(s.charAt(l)==s.charAt(r)){
            return helperPalindrome( s, l+1, r-1);
        }
        else return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abcdba"));


    }



}
