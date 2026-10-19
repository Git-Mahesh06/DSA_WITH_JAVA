public class permutation {

    public static void perm(String ans,String s){
        if(s.length()==0){
            System.out.println(ans);
        }
        else{
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                String l,r;
                l=s.substring(0,i);
                r=s.substring(i+1);
                perm(ans+ch,l+r);
            }
        }
    }

    public static void main(String[] args) {
        perm(" ","ABC");
    }
}
