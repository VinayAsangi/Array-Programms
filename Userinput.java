package ArrayProgramms;

import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        for (int i=0;i<=ar.length-1;i++){
            System.out.println(ar[i]);
        }
    }
}
