import java.util.Arrays;

public class mergearray {
    public static int[] ar(int[] a,int[] b){
        int[] c=new int[a.length+b.length];
        int k=0;
        for(int i=0;i<a.length;i++){
            c[k]=a[i];
            k++;
        }
        for(int i=0;i<b.length;i++)
        {    c[k]=b[i];
            k++;
        }
        return c;
    }
    public static int[] merge(int[] a,int[] b){
        int[] c=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
//            if(a[i]==b[j]){
//                c[k]=a[i];
//                i++;
//                k++;
//                j++;
//            }
            else{
                c[k++]=b[j++];
            }
        }
        for(;i<a.length;i++)
            c[k++]=a[i];
        for(;j<b.length;j++)
            c[k++]=b[j];

        return c;
    }

    public static void main(String[] args) {
        int[] b={1,2,3,6,7,45};
        int[] a={2,3,4,5,10,11,34,132,6798};
        System.out.println(Arrays.toString(ar(a,b)));
        System.out.println(Arrays.toString(merge(a,b)));
    }
}
