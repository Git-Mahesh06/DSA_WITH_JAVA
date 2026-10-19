import java.util.Scanner;
public class decimaltoother {
    static int decimal(String binary){
        int decimal=0;
        int power=0;
        for(int i=binary.length()-1;i>=0;i--){
            int d=binary.charAt(i)-'0';
            decimal+=d*Math.pow(2,power);
            power++;
        }
        return decimal;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String b=in.next();
        System.out.println(decimal(b));
    }
}
