public class gcdlcm {
    public static int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static int gcd1(int a,int b){
        while(a!=b){
            if(a>b)
                a=a-b;
            if(b>a)
                b=b-a;
        }
        return a;
    }
    public static int lcm(int a,int b){
        int l1=gcd(a,b);
        return (a*b)/l1;
    }
    public static void fibn(int n){
        int a=0;
        int b=1,c=0;
        while(n>0){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            n--;
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
     //   System.out.println("GCD "+(gcd(24,36)));
       // System.out.println("GCD1 "+(gcd1(68,12)));
        //System.out.println("LCM "+lcm(24,16));
        fibn(8);
    }
}
