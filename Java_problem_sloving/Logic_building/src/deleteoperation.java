import java.lang.module.FindException;

public class deleteoperation {
    public static void deleteend(int[] a){
        a[a.length-1]=0;
        for(int i=0;i< a.length;i++)
            System.out.print(a[i]+" ");
    }
    public static void deletefront(int[] a){
        a[0]=0;
        System.out.println();
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    public static void deleteati(int[] a,int index)
    {
        for(int i=index+1;i< a.length; i++) {
            a[index] = a[index + 1];
            index++;
        }
        System.out.println();
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        deleteend(a);
        deletefront(a);
        deleteati(a,2);
    }

}
