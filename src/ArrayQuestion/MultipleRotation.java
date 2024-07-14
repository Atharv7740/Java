package ArrayQuestion;

public class MultipleRotation {
    protected int mul1;
    public int mul2;
    public static void main(String[] args)  {
        int a[]={1,2,3,4,5};
        int b[]={2,3};

        int ans[][]=new int[b.length][a.length];






    }
    static void printArray(int a[]){
        for(int e: a ){
            System.out.println(e);
        }

    }


    static void rotateFunction(int a[], int k){
        for(int i=0;i<k;i++){
            int temp=a[i];
            int n=a.length;
            for (int j=0; j<n-1; j++){
                a[j]=a[j+1];
            }
            a[n-1]=temp;
        }


    }

}
