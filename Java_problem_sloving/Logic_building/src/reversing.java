import java.util.Arrays;

public class reversing {

    public static void rev1(int[] a,int i,int j){

        while(j>i){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i+=1;
            j-=1;
        }
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        rev1(a,0, a.length-1);
        for (int i=0;i<a.length;i++)
            System.out.println(a[i]+" ");

    }
}
