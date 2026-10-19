import java.lang.reflect.Array;
import java.util.Arrays;

public class recarray {
    public static void reca(int[] a, int n) {
        if (n >= 0) {
            System.out.print(a[n] + " ");
            reca(a, n - 1);
            System.out.print(a[n] + " ");
        }
    }

    public static int rsum(int[] a, int n) {
        if (n < 0) {
            return 0;
        }

        int sum = rsum(a, n - 1);
        sum = sum + a[n];

        return sum;
    }

    int m;

    public int larger(int[] a, int i, int max) {
        if (i == a.length)
            return max;
        if (a[i] < max)
            max = a[i];
        return larger(a, i + 1, max);
    }


    public int[] revnua(int[] a, int i) {
        int rev = 0;
        if (i == a.length)
            return a;
        while (a[i] > 0) {
            int r = a[i] % 10;
            rev = rev * 10 + r;
            a[i] /= 10;
        }
        a[i] = rev;
        return revnua(a, i + 1);

    }

    public static int greater(int n) {
        int m1, r1, r, q, m;
        if (n < 0)
            return 0;
        r = n % 10;
        q=n/100;
        m=n%100;
        m1=m/10;
        System.out.println(q);
        System.out.println(m1);
    return r;
    }


    public static void main(String[] args) {
        int[] a={123,25,37,58,15,25};
       // reca(a,a.length-1);
//        System.out.println(rsum(a,a.length-1));
        recarray r=new recarray();
      int g=r.larger(a,0,a[0]);
        System.out.println(g);
//        r.revnua(a,0);
//        System.out.println(Arrays.toString(a));
//
//        System.out.println(greater(123));
    }
}
