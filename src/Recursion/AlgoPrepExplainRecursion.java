package Recursion;

public class AlgoPrepExplainRecursion {
    public static void main(String[] args) {
        int n=3;
        System.out.println("Sum of Natural number from 1 to "+ n+":"+sumNatural(n));
        System.out.println("no more problems today");


    }
    public static int sumNatural(int n){
        if(n==1) return n;
        int temp=sumNatural(n-1);
        return temp+n;
    }

}
