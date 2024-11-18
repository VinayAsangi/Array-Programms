package ArrayProgramms;

import java.util.Scanner;

public class Specialtwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter "+n+" two digit elements: ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        isSpecial(ar);
    }

    static void isSpecial(int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            int m = ar[i];
            int temp = m, sum = 0, pro = 1;
            while (m != 0) {
                int r = m % 10;
                sum = sum + r;
                pro = pro * r;
                m = m / 10;
            }
            int total = sum + pro;
            if (temp == total)
                count++;
        }
        System.out.println(count);
    }

}
