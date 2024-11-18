package ArrayProgramms;

import java.util.Scanner;

public class Reversearray {
    public static void main(String[] args) {

        int[] ar = {1,2,3};

        reverse(ar);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
    static void reverse(int[] x){
        int i=0,j=x.length-1;
        while(i<j){
            int temp=x[i];
            x[i]=x[j];
            x[j]=temp;
            i++;
            j--;
        }

    }
}
