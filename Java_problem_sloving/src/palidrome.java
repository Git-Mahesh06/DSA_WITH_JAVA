import java.util.Scanner;

public class palidrome {

    public static boolean pali(String s){
        int l=0;
        int r=s.length()-1;
        while(r>l){
            if(s.charAt(l)!=s.charAt(r)) {
                return false;
            }
            l+=1;
            r-=1;
        }
        return true;
    }
    public static boolean pan(String s,int l,int r){
        if(l>=r) return true;
        if(s.charAt(l)!=s.charAt(r)) return false;
        else return pan(s,l+1,r-1);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        if(pan(s,0,s.length()-1)){
            System.out.println("It is palidrome");
        }
        else{
            System.out.println("Not palidrome");
        }
    }
}
