public class countofnumber {
    public static void coun(int n){
        int c=0;
        while(n>0){
            int r=n%10;
            c+=1;
            n/=10;

        }
        System.out.println(c);
    }
    public static int countdigits(int n){
        if(n<=0) return 0;
        else return 1+countdigits(n/10);
    }

    public static void main(String[] args) {
        coun(1234);
        System.out.println(countdigits(123453));    }
}
