package ArrayProgramms;

import java.util.Scanner;

public class PrimeElements {
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

            for (int j=2;j<=n[i];j++)
            {

                int k =n[i];
                while (k > 0) {
                    if (n[i] % k == 0)
                        count1++;
                    k--;
                }
            }
            if (count1 == 2)
                count2++;
        }

        System.out.println(count2);
    }
}
