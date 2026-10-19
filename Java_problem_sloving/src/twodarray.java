import java.util.Arrays;

public class twodarray {
    public static void traverse(){
        int[][] a={{1,2,3,4,5,4,3},{3,4,5,6},{6,7,8}};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void jaggedarray(){
        int[][] a={{1,2,3,4,5,4,3},{3,4,5,6},{6,7,8}};
        for(int[] x:a){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
    public static void addition() {
        int[][] a = {{1, 2, 3, 4}, {3, 4, 5, 6}, {6, 7, 8, 8}};
        int b[][] = new int[][]{{1, 2, 3, 4}, {2, 3, 4, 5}, {4, 5, 6, 7}};
        int[][] c = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void mul(){
        int[][] a = {{1, 2, 3, 4}, {3, 4, 5, 6}, {6, 7, 8, 8},{1,2,3,4}};
        int b[][] = new int[][]{{1, 2, 3, 4}, {2, 3, 4, 5}, {4, 5, 6, 7},{1,2,3,4}};
        int[][] c = new int[4][4];
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    for(int k=0;k<4;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void tran(){
        int[][] a={{1,2,3},{5,6,7}};
        int r=a.length;
        int c=a[0].length;
        int[][] b=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[j][i]=a[i][j];
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static class diagonal {
        int[] arr;

        public diagonal(int n) {
            arr = new int[n];
        }

        public void set(int i, int j, int val) {
            if (i > arr.length || j > arr.length) {
                throw new IndexOutOfBoundsException();
            }
            arr[i - 1] = (i == j) ? val : 0;
        }

        public int get(int i, int j) {
            if (i > arr.length || j > arr.length) {
                throw new IndexOutOfBoundsException();
            }
            return (i == j) ? arr[i - 1] : 0;
        }

        public void display() {
            for (int i = 1; i <= arr.length;i++){
                for(int j=1;j<=arr.length;j++){
                    System.out.print(get(i,j)+" ");
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
//        traverse();
//    jaggedarray();
//    addition();
//    mul();
//    tran();
    diagonal d=new diagonal(4);
    d.set(1,1,10);
    d.set(2,2,20);
    d.set(3,3,30);
    d.set(4,4,40);
    d.display();
    System.out.println();

        System.out.println(d.get(1,1));
        System.out.println(d.get(2,2));
        System.out.println(d.get(3,3));
        System.out.println(d.get(4,4));
    }

}
