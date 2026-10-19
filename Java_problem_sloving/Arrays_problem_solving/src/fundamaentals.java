import java.util.Scanner;

public class fundamaentals {

    public static void store(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int sum(int[] a){
        int s=0;
        for(int  i=0;i<a.length;i++){
            s+=a[i];
        }
//        System.out.println("Sum "+s);
    return s;
    }
    public static void delete(int[] a,int index){
        int x=a[index];
        int j=0;
        for(int i=index;i<a.length-1;i++){
            a[i]=a[i+1];

        }

    }
    public static void avg(int[] a){
        int n=a.length;
        System.out.println(sum(a)/n);
    }
    int m=0;
    static int i1=0;
    public static int maximum(int[] a,int i){
        if(i>=a.length)
            return 0;
        int m=maximum(a,i+1);
        if(a[i]>m)
            i1=i;
            m=a[i];
        return i1;
    }
public static void display(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the nu. of elements");
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
//        store(a);
//        System.out.println(sum(a));
//        avg(a);
//        System.out.println(maximum(a,0));
        display(a);
        delete(a,2);
        display(a);
    }
}
