package ArrayProgramms;

import java.util.Scanner;

public class Biggestelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter n elements of array: ");
        for (int i=0;i<ar.length;i++){
            ar[i]= sc.nextInt();
        }
        int rs=isBig(ar);
        System.out.println("Biggest element from an array: "+rs);
    }
    static int isBig(int[] ar){
        int big= ar[0];
        for (int i = 0; i< ar.length; i++){
            if(ar[i]>big)
                big= ar[i];
        }
        return big;
    }
}
