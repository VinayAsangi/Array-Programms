package ArrayProgramms;

public class Unique {
    public static void main(String[] args) {
        int[] x={3,1,2,6,2,3,1,4,5};
        newArray(x);
    }
    static void newArray(int[] a){
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count==1)
                System.out.println(a[i]+" ");
        }
    }
}
