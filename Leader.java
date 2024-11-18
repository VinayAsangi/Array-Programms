package ArrayProgramms;

public class Leader {
    public static void main(String[] args) {
        int[] a={1,7,5,3,6,2};
        int[] ans=leader(a);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    static int[] leader(int[] a){
        int[] b=new int[a.length];
        for(int i=0;i<a.length;i++){
            int k=0,temp=a[i];
            for(int j=i+1;j<a.length;j++){
                if(temp>a[j])
                    temp=a[j];
            }
            if(temp==a[i])
                b[k++]=a[i];
        }
        return b;
    }
}
