package AlgoPrepArray;

import java.util.Scanner;

public class PairExist {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int k=sc.nextInt();
            System.out.println(pairExist(arr,k));

        }
        public static boolean pairExist(int[] arr, int k){
            for(int i=0;i<arr.length;i++){
                int required=k-arr[i];
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]==required){
                        return true;
                    }

                }

            }
            return false;

        }


}
