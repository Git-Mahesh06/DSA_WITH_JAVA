
class Stack<T> {
    private final T[] array;
    private int top;

    @SuppressWarnings("unchecked")
    public Stack(int size) {
        array = (T[]) new Object[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == array.length - 1;
    }

    public void push(T element) {
        if (isFull()) {
            throw new RuntimeException("Stack Overflow");
        }
        array[++top] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }

        T element = array[top];
        array[top] = null;
        top--;
        return element;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return array[top];
    }

    // index = 0 means top element
    public T peek(int index) {
        if (index < 0 || index > top) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return array[top - index];
    }

    public T stackTop() {
        return peek();
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

public class Genericstackinfixtopostfix {

    static boolean operand(char x) {
        return x != '+' && x != '-' &&
                x != '*' && x != '/';
    }

    static int precedence(char x) {
        if (x == '+' || x == '-') {
            return 1;
        } else if (x == '*' || x == '/') {
            return 2;
        }
        return 0;
    }

    static String intopostfix(String infix) {
        Stack<Character> sc =
                new Stack<>(infix.length());

        StringBuilder postfix = new StringBuilder();

        int i = 0;

        while (i < infix.length()) {
            char x = infix.charAt(i);

            if (Character.isWhitespace(x)) {
                i++;
            } else if (operand(x)) {
                postfix.append(x);
                i++;
            } else {
                while (!sc.isEmpty() &&
                        precedence(sc.stackTop()) >= precedence(x)) {
                    postfix.append(sc.pop());
                }

                sc.push(x);
                i++;
            }
        }

        while (!sc.isEmpty()) {
            postfix.append(sc.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        String s = "a+b*c-d/e";

        System.out.println("Infix expression is " + s);
        System.out.println("Postfix expression is " + intopostfix(s));
    }
}
