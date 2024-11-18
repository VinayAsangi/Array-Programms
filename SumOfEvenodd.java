package ArrayProgramms;

import java.util.Scanner;

public class SumOfEvenodd {
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
        System.out.println("Even elements sum: "+ans[0]);
        System.out.println("Odd elements sum: "+ans[1]);
    }
    static int[] count(int[] x){
        int esum=0,osum=0;
        for(int i=0;i<x.length;i++){
            if (x[i]%2==0)
                esum=esum+x[i];
            else
                osum=osum+x[i];
        }
        int[] rs={esum,osum};
        return rs;
    }
}
