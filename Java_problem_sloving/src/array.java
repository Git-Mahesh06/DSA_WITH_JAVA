import java.util.Scanner;


public class array {
    public static int traverse(int[] n){
        for(int i=0;i< n.length;i++){
            System.out.println(n[i]);
        }
        return 0;
    }
    public static int sum(int[] n){
        int s=0;
        for(int x:n){
            s+=x;
        }
        return s;
    }
    public static int larger(int[] n){
        int sum=0;
        for(int x:n){
            if(x>sum){
                sum=x;
            }
        }
        return sum;
    }
public static void prin(int n){
   Scanner in=new Scanner(System.in);
    int[] a=new int[n];
    for(int i=0;i<a.length;i++){
        a[i]=in.nextInt();
    }
    for(int i=a.length;i>=0;i--){
        System.out.println(" "+i);
    }

}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] a={1,45,3,4,5};
        traverse(a);
        System.out.println(sum(a));
        System.out.println(larger(a));
        int n=in.nextInt();
        prin(n);
    }
}
