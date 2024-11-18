package ArrayProgramms;

public class InsertEle {
    static int[] insertele(int[] a,int in,int ele){
        if(in<0||in>a.length){
            System.out.println("Index out of bound");
            return a;
        }
        int[] b=new int[a.length+1];
        b[in]=ele;
        for (int i = 0; i < a.length; i++) {
            if(i<in)
                b[i]=a[i];
            else
                b[i+1]=a[i];
        }
        return b;
    }

    public static void main(String[] args) {
        int[] b={23,4,5,65,7,8};
        int[] ans=insertele(b,2,6);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
