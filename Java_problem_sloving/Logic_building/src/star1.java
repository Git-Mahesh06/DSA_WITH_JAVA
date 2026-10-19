public class star1 {
    public static void square(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void tri(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void right(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void star2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        square(5);
         tri(5);
//        right(5);
        star2(5);
    }
}
