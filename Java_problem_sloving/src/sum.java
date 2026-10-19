public class sum {
public static int loop(int n){
    int s=0;
    for(int i=0;i<=n;i++){
        s+=i;
    }
    return s;
    }

public static int recur(int n){
    if(n<1){
        return 0;
    }
    return n+recur(n-1);
}
public static int fact(int n){
    if(n==0) return 1;
    else return n*fact(n-1);
}
public static long power(int a,int b){
    if(b==0) return 1;
    else return  a*power(a,b-1);
}
public static long p(int a,int b){
    long pr=1;
    for(int i=1;i<=b;i++){
        pr*=a;
    }
    return pr;
}
public static long log(int a,int b)
{
    int c=0;
    while(b>1){
        b=b/a;
        c+=1;
    }
    return c;
}
public static long lo(int a,int b){
    if(b<a){
        return 0;
    }
    return 1+lo(a,b/a);

}
public static int GCD(int a,int b){
    if(a==0) return b;
    else return GCD(b%a,a);
}
    public static void main(String[] args) {
        System.out.println(loop(5));
        System.out.println(recur(5));
        System.out.println(fact(5));
        System.out.println(power(2,5));
        System.out.println(p(2,5));
        System.out.println((log(2,32)));
        System.out.println(lo(2,32));
        System.out.println(GCD(12,128));
    }
}

