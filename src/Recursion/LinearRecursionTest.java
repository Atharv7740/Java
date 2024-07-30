package Recursion;

public class LinearRecursionTest {
    public static void main(String[] args) {

    }
    static void bar(int n){
        if (n>0){
            System.out.println(n);
            bar(n-1);
            bar(n-1);
            bar(n-2);

        }
    }
}

