
public class reverse {
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        return rev;
    }

//    public int rev1(int n){
//
//        int r1=0;
//        if(n>0){
//            int r=n%10;
//            System.out.println(r);
//            r1=r1*10+r;
//            rev1(n/10);
//        }
//        return r1;
//    }

    public static void main(String[] args) {
        System.out.println("Reverse "+reverse(1234));
//        System.out.println("Reverse1 "+rev1(1234));

    }
}
