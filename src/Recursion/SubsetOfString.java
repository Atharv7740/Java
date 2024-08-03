package Recursion;

public class SubsetOfString {
    public static void main(String[] args) {
        subsetOfGivenString("abc");

    }
    public static void subsetOfGivenString(String s){
        helperForFindingSubset(s,0," ");

    }
    public static void helperForFindingSubset(String s, int Index, String Current){
        if(Index==s.length()){
            System.out.println(Current);
            return;
        }
        helperForFindingSubset(s,Index+1,Current+s.charAt(Index));
        helperForFindingSubset(s,Index+1,Current);
    }
}
