package AlgoPrepArray;

import java.util.Scanner;

public class RotateArrayByKtimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements of Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Value of k");
        int k=sc.nextInt();
        k=k%n;

        rotateArrayByKtimes(arr,k);

    }
    public static void reverseArray(int[] arr, int start  ,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void rotateArrayByKtimes(int[] arr, int k){
        reverseArray(arr,0,arr.length-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,arr.length-1);
        printArray(arr);

    }
}

