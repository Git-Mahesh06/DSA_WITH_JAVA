public class num {
    public static void number(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void mulnum(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void seqnum(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();

        }
    }
    public static void seqnu(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((num%10)+" ");
                num++;
            }
            System.out.println();

        }
    }

    public static void zo(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int v=(i+j)%2;
                System.out.print(v+" ");
            }
            System.out.println();
        }
    }
    public static void ABC(int n){
        char ch='A';
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
//                ch++;
            }
            ch++;
            System.out.println();
        }
    }
    public static void ABCD(int n){

        for(int i=1;i<=n;i++){
        char ch='A';
            for(int j=1;j<=i;j++){

                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void revabc(int n){
        char ch='A';
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=2*i;k++) {
                System.out.print(ch + "");
                ch++;
            }
            System.out.println();
        }
    }

    public static void trinum(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+"");
            }
//            System.out.println();
            for(int l=i-1;l>=1;l--)
                System.out.print(l+"");
            System.out.println();
        }
    }

    public static void doublesatr(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int j=n;j>=1;j--) {
            for (int i = j; i >= 1; i--)
            {       System.out.print("*");}
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        number(5);
//        mulnum(5);
//        seqnum(5);
//        seqnu(8);
//zo(5);
//ABC(5);
//        ABCD(5);
//    revabc(5);
    trinum(5);
    //doublesatr(5);
    }

}
