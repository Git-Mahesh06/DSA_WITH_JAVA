public class matrixtraversal {

    public static void toprightbottom(int[][] a){
        int n=a.length;
        for(int d=0;d<=2*n-1;d++){
            if(d<n){
                int i=0,j=(n-d+1)-1;
                while(j<n){
                    System.out.print(a[i][j]+" ");
                    i++;
                    j++;
                }
                System.out.println();
            }
            else{
                int i=(d-n+1)-1,j=0;
                while(i<n){
                    System.out.print(a[i][j]+" ");
                    i++;
                    j++;
                }
                System.out.println();
            }
        }
    }
    public static void topleftbottom(int[][] a){
        int n=a.length;
        for(int d=0;d<=2*n-1;d++){
            if(d<n){
                int i=0,j=d;
                while(j>=0){
                    System.out.print(a[i][j]+" ");
                    i++;
                    j--;
                }
                System.out.println();
            }
            else{
                int i=(d-n+1)-1,j=n-1;
                while(i<=n-1){
                    System.out.print(a[i][j]+" ");
                    i++;
                    j--;
                }
                System.out.println();
            }
        }
    }
public static void zigzag(int[][] a){
        int n=a.length;
        int j;
        for(int i=0;i<n;i++){
            if(i%2==0)
                j=0;
            else
                j=n-1;
            for(int k=0;k<n;k++){
                System.out.print(a[i][j]+" ");
                if(i%2==0)
                    j++;
                else j--;
            }
            System.out.println();
        }
}

    public static void main(String[] args) {
        int[][] a={{1,2,3,4},
                   {2,3,4,5},
                   {4,5,6,7},
                   {6,7,8,9}};
//        toprightbottom(a);
//    topleftbottom(a);
    zigzag(a);
    }
}
