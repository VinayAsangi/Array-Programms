package ArrayProgramms;

import java.util.Scanner;

public class CopyofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        Copy(ar);
    }
    static void Copy(int[] x){
        int[] copar =new int[x.length];
        for (int i=0;i<x.length;i++){
            copar[i]=x[i];
        }
        System.out.println("reverse of an array: ");
        for(int i = 0; i< copar.length; i++){
            System.out.print(copar[i]+" ");
        }
    }
}
