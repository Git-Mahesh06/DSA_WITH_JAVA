public class trid {
    public static void doubletri(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int k=2*i-1;k>0;k--)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void num12(int n){
        for(int i=1;i<n;i++) {
        for(int j=i;j<n;j++){
            System.out.print(" ");
        }
        for(int j=n;j>n-i;j--){
            System.out.print(j+"");
        }
        for(int l=n-i+1;l<=n;l++)
            System.out.print(l+"");
        System.out.println();
        }
    }


    public static void main(String[] args) {
       // doubletri(5);
        num12(5);
    }
}
