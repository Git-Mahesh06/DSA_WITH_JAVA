import org.w3c.dom.ls.LSOutput;

class test1{
    int p;
    int q;
}
class test {
    int a;
    int b;
    test1 t1=new test1();
}

public class main12{
    public static void main(String[] args) {
        test t;
        t=new test();
        t.a=10;
        t.t1.p=20;
        System.out.println(t.a+" this is from test");
        System.out.println(t.t1.p+" this form test1");
    }
}
