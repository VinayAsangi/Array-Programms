package ArrayProgramms;

import java.util.Scanner;

public class PosNegCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int[] ans=count(ar);
        System.out.println("Positive count: "+ans[0]);
        System.out.println("Negative count: "+ans[1]);
    }
    static int[] count(int[] x){
        int pos=0,neg=0;
        for(int i=0;i<x.length;i++){
            if (x[i]>0)
                pos++;
            else
                neg++;
        }
        int[] rs={pos,neg};
        return rs;
    }
}
