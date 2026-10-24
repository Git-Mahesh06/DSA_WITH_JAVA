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
        public static void main(String[] args)
            {
            String exp="((a + b) * (c - d))";
           System.out.println(parenthesisbalance(exp));
            System.out.println(isbracket(exp));
        }
    }


