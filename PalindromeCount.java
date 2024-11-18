package ArrayProgramms;

import java.util.Scanner;

public class PalindromeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int ans=palindromeCount(ar);
        System.out.println("Number of Palindrome "+ans);
    }
    static int palindromeCount(int[] x){
        int count=0;
        for(int i=0;i<x.length;i++){
            boolean rs=isPalindrome(x[i]);
            if(rs==true)
                count++;
        }
        return count;
    }
    static boolean isPalindrome(int n){
        int temp=n,rev=0;
        do{
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }while(n!=0);
        return temp==rev;
    }
}
