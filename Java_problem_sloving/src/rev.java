import java.util.Scanner;

public class rev {
    static int[] a=new int[5];
    static int[] b=new int[5];
    public static void revs(int[] a){
        for(int i=a.length-1,j=0;i>=0;i--,j++){
            b[j]=a[i];
        }
        for(int i=0;i<a.length;i++){
            a[i]=b[i];
        }
    }

    public static void revr(int[] a1,int i,int j){
        if(j>=i){
            int t=a1[i];
            a1[i]=a1[j];
            a1[j]=t;
            revr(a1,i+1,j-1);
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        for(int i=0;i<5;i++){
            a[i]=in.nextInt();
        }
        revs(a);
        for(int i = 0; i<a.length;i++)
            System.out.print(a[i]+" ");
        revr(a,0,a.length-1);
        System.out.println("\n");
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
