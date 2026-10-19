public class bitd {
    public static void nbits(int n) {
        if ((n & 1) == 1) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }

    }
    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0){
            if ((n & 1) == 1) { // Number is odd
                count = count + 1;
            }
            // else  count = count;
            n = n / 2;
        }
        return count;
    }
    public static int settingbit(int n,int k){
        int m=1<<k;
        int m1=m|n;
        return m1;
    }
    public static void checking(int n,int k)
    {
        if((n & (1<<k))==0){
            System.out.println("False");
        }else {
            System.out.println("True");
        }}
    public static void toggling(int n,int k){
        int m= (n ^ (1<<k));
        StringBuilder s=new StringBuilder();
        System.out.println(m);
        while(m>0){
            int r=m%2;
            s.insert(0,r);
            m/=2;
        }
        System.out.println(s.toString());
    }
    public static void clearning(int n,int k){
        int m= (n & ~(1<<k));
        StringBuilder s=new StringBuilder();
        System.out.println(m);
        while(m>0){
            int r=m%2;
            s.insert(0,r);
            m/=2;
        }
        System.out.println(s.toString());

    }
    public static void miss(int[] a){
        int n=a.length;
        int r=0;
        for(int i=1;i<=n;i++){
            r=r^i;
            for(int j=0;j<n;j++){
                r=r^a[j];
            }
        }
        if(r==0) System.out.println("True");
        else System.out.println("False");
    }
    public static void missnum(int[] a){
        int n=a.length;
        int n1=a[0];
        int r=1;
        for(int i=1;i<n;i++){
            n1^=a[i];
        }
        for(int i=2;i<=n;i++){
            r=r^i;
        }
        int m=n1^r;
        System.out.println(m);
    }
    public static void dup(int[] a) {
        int r = 1;
        int ar=a[0];
        for(int i=1;i<a.length;i++)
            ar^=a[i];
        for(int i=2;i<=a.length;i++)
            r^=i;

        int d=ar^r;
        System.out.println(d);
    }
    public static void main(String[] args) {
        int[] a={1,2,3,3,4,5};
//        nbits(11);
//        System.out.println(countSetBits(15));
//        System.out.println(settingbit(10,2));
//    checking(14,2);
//        toggling(10,2);
//    clearning(14,2);
//    miss(a);
//     missnum(a);
    dup(a);
    }

}
