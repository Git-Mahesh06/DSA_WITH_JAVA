public class toweroh {

    public static int toh(int n,String s,String  m,String  d){

        if(n>0){
            toh(n-1,"A","C","B");
            System.out.println("Move disc from"+s+"to"+d);
            toh(n-1,"B","A","c");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(toh(3,"A","B","C"));
    }
}
