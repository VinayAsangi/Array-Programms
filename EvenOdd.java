package ArrayProgramms;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter n elements of array: ");
        for (int i=0;i<ar.length;i++){
            ar[i]= sc.nextInt();
        }
        isBig(ar);
    }
    static void isBig(int[] n){
        int count1=0,count2=0;
        for (int i=0;i<n.length;i++){
            if(n[i]%2==0)
                count1++;
            else
                count2++;
        }
        System.out.println("Number of even elements: "+count1);
        System.out.println("Number of even elements: "+count2);
    }
}
