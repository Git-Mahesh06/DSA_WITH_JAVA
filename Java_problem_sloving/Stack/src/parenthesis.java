import java.util.Arrays;

class Stackkk<T> {
    T[] a;
    int s;
    int top;

    public Stackkk(int size) {
        s = size;
        a = (T[]) new Object[size];
        top = -1;
    }

    void push(T val) {
        if (top == s - 1)
            System.out.println("Stack is full");
        a[++top] = val;
    }

    T pop() {
        if (top == -1)
            System.out.println("Stack is empty");
        T e = a[top--];
        return e;
    }

    void dis() {
        if (top == -1)
            System.out.println("Empty");
        for (int i = top; i >= 0; i--)
            System.out.print(" " + a[i]);
    }

    boolean isempty() {
        return top == -1;
    }
    T stacktop(){
        return a[top];
    }
}
    public class parenthesis {
        static boolean parenthesisbalance(String exp) {
            Stackkk<Character> s = new Stackkk<>(exp.length());
            for (int i = 0; i < exp.length(); i++) {
                char x = exp.charAt(i);
                if (x == '(') {
                    s.push(x);
                } else if (x == ')') {
                    if (s.isempty()) return false;
                    s.pop();
                }

            }
            return s.isempty();
        }

        static boolean isbracket(String exp) {
            Stackkk<Character> s = new Stackkk<>(exp.length());
            for (int i = 0; i < exp.length(); i++) {
                char x = exp.charAt(i);
                if (x == '(' || x == '{' || x == '[') {
                    s.push(x);
                } else if (x == ')' || x == '}' || x == ']') {
                    if (s.isempty()) return false;
                    char y = s.pop();
                    if ((x == ')' && y != '(') ||
                            (x == '}' && y != '{') ||
                            (x == ']' && y != '[')) {
                        return false;
                    }
                }
            }
            return s.isempty();
        }
        static void nextgraterelement(int[] a){
            Stackkk<Integer> ss=new Stackkk<>(a.length);
            int[] G=new int[a.length];
            int i=a.length-1;
            while(i>=0){
                if(ss.isempty()){
                    G[i]=-1;
                    ss.push(a[i]);
                    i--;
                } else if (a[i]<ss.stacktop()) {
                    G[i]=ss.stacktop();
                    ss.push(a[i]);
                    i--;
                }
                else ss.pop();
            }
            System.out.println(Arrays.toString(G));
        }
        public static void main(String[] args)
            {
            String exp="((a + b) * (c - d))";
           System.out.println(parenthesisbalance(exp));
            System.out.println(isbracket(exp));
            int[] a={2,3,1,5,4,3,2,6,3,7,5};
                System.out.println(Arrays.toString(a));
                nextgraterelement(a);
        }
    }


