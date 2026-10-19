import java.util.Arrays;

public class rotation {
    public static void left(int[] a) {
        int t = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = t;
    }

    public static void lktime(int[] a, int l,int r) {
        while(r>l){
            int t=a[l];
            a[l]=a[r];
            a[r]=t;
            l++;
            r--;
        }
    }
    public static void rotate(int[] a,int k){
        int n=a.length;
        k=k%n;
        lktime(a,0,k-1);
        lktime(a,k,n-1);
        lktime(a,0,n-1);
        for (int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }

    public static void rotate1(int[] a) {
        int t = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--)
            a[i] = a[i - 1];
        a[0] = t;
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    public static void rightrotate(int[] a,int k){
        int n=a.length;
        lktime(a,0,n-k-1);
        lktime(a,n-k,n-1);
        lktime(a,0,n-1);
        System.out.println();
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
//        left(a);
//        for(int i=0;i<a.length;i++)
//            System.out.print(a[i]+" ");

//        rotate(a,1);
//        rotate1(a);
        rightrotate(a,3);
    }
}

