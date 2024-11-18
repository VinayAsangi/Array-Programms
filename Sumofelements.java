package ArrayProgramms;

import java.util.Scanner;

public class Sumofelements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter n elements of array: ");
        for (int i=0;i<ar.length;i++){
            ar[i]= sc.nextInt();
        }
        int rs= isSum(ar);
        System.out.println("Sum of elements in an array: "+rs);
    }
    static int isSum(int[] n){
        int sum=0;
        for (int i=0;i<n.length;i++){
                sum=sum+n[i];
        }
        return sum;
    }
}
