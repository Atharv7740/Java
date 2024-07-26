package Recursion;

public class StringOccurance {
    static int findString(String s, String t){
       return  helperFindString(s,t,0);

    }
    static int helperFindString(String s, String t, int i){
        if(i>s.length()-t.length()){
            return 0;
        }

            int subStringAns= helperFindString(s,t,i+1);

        boolean firstStringMatch= s.substring(i,i+t.length()).equals(t);

        if(firstStringMatch) {
            return subStringAns+1;
        }
        else return subStringAns;

    }

    public static void main(String[] args) {
        System.out.println(findString("abababbaabaaba","a"));
    }
}

