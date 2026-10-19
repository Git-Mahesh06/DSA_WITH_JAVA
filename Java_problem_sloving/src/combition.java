public class combition {

    private static int[][] ma;

     static int combi(int n,int r)
    {
        if(ma==null){
            ma=new int[n+1][r+1];
        }
        if(ma[n][r]!=0)
            return ma[n][r];int result;
        if(n==r || r==0){
            result=1;
        }
        else{
            result=combi(n-1,r-1)+combi(n-1,r);
        }
        ma[n][r]=result;
    ;return result;
    }

    public static void main(String[] args) {
        System.out.println(combi(5,3));
    }
}
