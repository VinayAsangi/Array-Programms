package ArrayProgramms;
import java.util.Scanner;
public class MergeTwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of first array: ");
        int m= sc.nextInt();
        int[] a=new int[m];
        System.out.println("Enter elements of first array: ");
        for(int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Enter size of Second array: ");
        int n= sc.nextInt();
        int[] b=new int[n];
        System.out.println("Enter elements of Second array: ");
        for(int i=0;i<b.length;i++){
            b[i]= sc.nextInt();
        }
        int[] c=merge(a,b);
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
    static int [] merge(int[] a,int[] b){
        int[] z=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            z[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            z[a.length+i]=b[i];
        }

        return z;
    }
}
