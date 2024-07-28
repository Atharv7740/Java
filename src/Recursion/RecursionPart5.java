package Recursion;

public class RecursionPart5 {
    public static void main(String[] args) {
        System.out.println(
                "output of pow fn: "+pow(2,3)
        );
    }

    public static int pow(int a, int b){

        if(b==0){
            return 1;
        }
        else return pow(a,b-1)*a;
    }
}
