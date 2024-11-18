package ArrayProgramms;

public class Frequency {
    public static void main(String[] args) {
        int[] x={3,1,2,2,3,1,4};
        newArray(x);
    }
    static void newArray(int[] a){
        boolean[] rs=new boolean[a.length];
        for(int i=0;i<a.length;i++) {
            if (rs[i] == false) {
                int count = 1;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        rs[j] = true;
                    }
                }
                System.out.println(a[i] + " " + count);
            }
        }

    }
}
