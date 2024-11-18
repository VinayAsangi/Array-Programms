package ArrayProgramms;

public class NthBiggest {
    static int nthBig(int[] a,int n){
        for (int i = 0; i < a.length; i++) {
            int count=0;
            for (int j = 0; j <a.length ; j++) {
                if(a[i]<a[j])
                    count++;
            }
            if(count==n-1)
                return a[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a={23,45,67,65,43,78,58};
        int ans=nthBig(a,1);
        System.out.println(ans);
    }
}
