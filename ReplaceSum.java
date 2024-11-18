package ArrayProgramms;

public class ReplaceSum {
    public static void main(String[] args) {
        int[] x={10,11,12};
        int[] ans=newArray(x);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    static int[] newArray(int[] a){
        int[] b=new int[a.length];
        for(int i=0;i<a.length;i++){
            int sum=0;
            while(a[i]>0){
                int r=a[i]%10;
                sum=sum+r;
                a[i]=a[i]/10;
            }
            b[i]=sum;
        }
        return b;
    }
}
