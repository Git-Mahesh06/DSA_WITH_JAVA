import java.util.Scanner;

public class binary {
    static String convertbi(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder res = new StringBuilder();
        while (num > 0) {
            int rem = num % 2;
            num /= 2;
            res.insert(0, rem);
        }
        return res.toString();
    }

    static String octal(int num){
        if(num==0){
            return "0";
        }
        StringBuilder res=new StringBuilder();
        while(num>0){
            int rem=num%8;
            num/=8;
            res.insert(0,rem);
        }
        return res.toString();
    }
    static char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    static String hexa(int num){
        if(num==0){
            return "0";
        }
        StringBuilder res=new StringBuilder();
        while(num>0){
            int rem=num%16;
            num/=16;
            res.insert(0,map[rem]);
        }
        return res.toString();
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.println("Binary of num is: "+convertbi(num));
        System.out.println("Octal number is :"+octal(num));
        System.out.println("Hexadecimal number is :"+hexa(num));
    }
}
