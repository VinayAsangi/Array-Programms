package ArrayProgramms;

public class CommanElements {
    public static void main(String[] args) {
        int [] a={1,2,3};
        int[] b={1,2,3};
        int[] c=comman(a,b);
        for (int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
    static int[] comman(int[] a ,int[] b){
        if(a.length<b.length){
            int[] x=new int[a.length];
            for(int i=0;i<a.length;i++){
                for(int j=0;j<b.length;j++){
                    if (a[i]==b[j])
                        x[i]=b[j];
                }
            }
            return x;
        }
        else if (a.length>b.length){
            int[] x=new int[b.length];
            for(int i=0;i<b.length;i++){
                for(int j=0;j<a.length;j++){
                    if (b[i]==a[j])
                        x[i]=a[j];
                }
            }
            return x;
        }
        else {
            int[] x=new int[a.length];
            for(int i=0;i<a.length;i++){
                for(int j=0;j<b.length;j++){
                    if (a[i]==b[j])
                        x[i]=b[j];
                }
            }
            return x;
        }

    }
}
