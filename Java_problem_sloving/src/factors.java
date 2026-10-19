public class factors {
    public static int factors(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c+=1;
                System.out.print(" "+i);
            }
        }
        return c;
    }
    public static void prime(int n){
        if(factors(n)==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
    public static void fac(int n,int i){
        if(i>n)
            return;
        if(n%i==0)
            System.out.println(i);
        fac(n,i+1);
    }

    public static void main(String[] args) {
//        factors((128));
        fac(128,1);
      //  prime(55);
    }
}
