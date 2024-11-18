package ArrayProgramms;
import java.util.Scanner;
public class ZigZag {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6,7};
        int[] c=merge(a,b);
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }

    static int [] merge(int[] a,int[] b){
        int[] z=new int[a.length+b.length];
        int i=0,k=0;
        while(i<a.length&&i<b.length){
            z[k]=a[i];
            k++;
            z[k]=b[i];
            k++;
            i++;
        }
        while(i<a.length){
            z[k]=a[i];
            k++;
            i++;
        }
        while(i<b.length){
            z[k]=b[i];
            k++;
            i++;
        }

        return z;
    }
}
