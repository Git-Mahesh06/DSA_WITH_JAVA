import java.util.Arrays;

public class uniob {
    public static int[] union(int[] a,int[] b){
        int[] c=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
            c[i]=a[i];
        int k=a.length,j=0;
        for (int i=0;i<b.length;i++) {
            for (j= 0; j < k; j++) {
                if (b[i] == c[j]) {
                    break;
                }
            }    if(k==j) {
                    c[k++] = b[i];
                }

        }
        return c;
    }

    public static void inter(int[] a,int[] b){
        int[] c=new int[a.length+b.length];
        int k=0;
        boolean f=false;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]) {
                    f=true;
                }
            }
            if(f){
                c[k]=a[i];
                k+=1;
            }
        }
        for(int i=0;i<k;i++)
            System.out.print(c[i]+" ");
    }

    public static void diff(int[] a,int[] b){
        int[] c=new int[a.length+b.length];
        int k=0;
        boolean f=false;
        for(int i=0;i<a.length;i++) {
            int j;
            for (j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    f=true;
                    break;

                }
        }
            if(!f)
            {c[k++]=a[i];}

    }
        for(int i=0;i<k;i++)
            System.out.print(a[i]+" ");
    }

    public static void main(String[] args) {
        int[] a={1,5,2,4,6};
        int[] b={2,3,6,4,9};
        System.out.println(Arrays.toString(union(a,b)));

        inter(a,b);
        System.out.println("\n");
        diff(a,b);
    }
}
