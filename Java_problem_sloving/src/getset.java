public class getset {
    static int[] a=new int[10];
    static int size=4;

    public static int Get(int in) throws Exception{
        if(in<0 || in>=size)
            throw new Exception("Invalid");
        return a[in];
    }
    public static void set(int x,int in) throws Exception{
        if(in<0||in>=size)
            throw new Exception("invalid");
        a[in]=x;
    }

    public static void main(String[] args) throws Exception {
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        System.out.println(Get(2));
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
        set(10, 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
