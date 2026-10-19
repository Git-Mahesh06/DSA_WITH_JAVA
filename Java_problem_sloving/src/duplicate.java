import java.sql.Struct;

public class duplicate {
    public static void duo(int[] a){
        int k=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                a[k]=a[i-1];
                k++;
            }
        }
        for(int i=0;i<k+1;i++){
            System.out.print(" "+a[i]);
        }
    }
    public static void revvvv(int[] a){
        int i=0;
        int j=a.length-1;
        while(j>=i){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
        for(int k=0;k<a.length;k++)
         System.out.print(a[k]+" ");
    }
    public static void sorrt(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println();
        for(int k=0;k<a.length;k++)
            System.out.print(a[k]+" ");
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
       // duo(a);
        revvvv(a);
        sorrt(a);
    }
}
