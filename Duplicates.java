package ArrayProgramms;

public class Duplicates {
    public static void main(String[] args) {
        int[] x={3,-1,2,-2,3,-1,4};
        newArray(x);
    }
    static void newArray(int[] a){
        for(int i=0;i<a.length;i++){
            int count=1;
            for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                        count++;
                    }
            }
            if(count>1)
                System.out.println(a[i]+" "+count);
        }

    }
}
