import java.sql.SQLOutput;
import java.util.Scanner;

public class armstrong {
    public static int count(int n){
        if(n<=0) return 0;
        else return 1+count(n/10);
    }
    public static int power(int a,int b){
        if(b==0) return 1;
        else return a*power(a,b-1);
    }
    public static int arm(int n){
        int s=0;
        int m=n;
        while(n>0){
            int r=n%10;
            s=s+power(r,count(m));
            n/=10;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(arm(in.nextInt()));
    }
}
