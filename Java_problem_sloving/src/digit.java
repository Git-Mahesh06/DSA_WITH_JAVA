public class digit{
    static double divide(int dividend, int divisor) {
        return (double) dividend / divisor;
    }

    static int remainder(int dividend, int divisor) {
        return dividend % divisor;
    }


    public static void main(String[] args) {
        System.out.println("Division : " + divide(125, 10));
        System.out.println("Remainder : " + remainder(125, 10));
    }
}
