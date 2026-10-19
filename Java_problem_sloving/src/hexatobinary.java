public class hexatobinary {
    static String[] s={"000","001","010","011","100","101","110","111","1000","1001","1010","1011","1100","1101","1110","1111"};

    static String convert(String binary){
        StringBuilder res=new StringBuilder();
        for(int i=0;i<=binary.length()-1;i++){
            char c=binary.charAt(i);
            int val;
            if(Character.isDigit(c)){
                val=c-'0';
            }
            else{
                val=Character.toUpperCase(c)-'A'+10;
            }
            res.append(s[val]);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String hexa="2b";
        System.out.println("Binary is : "+convert(hexa));
    }
}
