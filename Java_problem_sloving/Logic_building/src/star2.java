public class star2 {
    public static void right(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void triangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Blankstar(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("b");
            }
            for(int k=0;k<2*i+1;k++)
            {
                if(k%2==0){
                    System.out.print("*");
                }
                else{
                    System.out.print("b");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        right(5);
     triangle(5);
        Blankstar(5);
    }

}
