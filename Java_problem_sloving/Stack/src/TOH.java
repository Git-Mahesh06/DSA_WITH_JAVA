public class TOH {
    static void tohh(int n,int A,int B,int C){
        if(n>0){
            tohh(n-1,A,C,B);
            System.out.println("Moves disk from "+A+" to " +C);
            tohh(n-1,B,A,C);
        }
    }
    public static void main(String[] args) {
        tohh(3,1,2,3);
    }
}
