public class Octaltobinary {
    static String[] s={"000","001","010","011","100","101","110","111"};

    public static String convert(String binary){
        StringBuilder res=new StringBuilder();
        for(int i=0;i<=binary.length()-1;i++){
            int v=binary.charAt(i)-'0';
            res.append(s[v]);

        }
        return res.toString();
    }

    public static void main(String[] args) {
        String octal="12";
        System.out.println("Binary number is : "+convert(octal));
    }
}
