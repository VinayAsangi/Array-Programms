package ArrayProgramms;

import java.util.Scanner;

public class Primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int ans=countPrime(ar);
        System.out.println(ans);
    }

    static int countPrime(int[] x) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            boolean rs=isprime(x[i]);
            if (rs==true)
                count++;
        }
        return count;
    }
    static boolean isprime(int n){
        for (int i=2;i<n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}