class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
class Stacks<T> {
    private Node<T> top;

    public Stacks() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        T poppedElement = top.data;
        top = top.next;
        return poppedElement;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return top.data;
    }

    public void display() {
        Node<T> current = top;
        while(null != current) {
            System.out.print(current.data  + " ");
            current = current.next;
        }
        System.out.println();
    }

}

public class InfixtopostfixconversionLinkedList {

    static boolean isOperand(char c) {
        return  !(c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '(' || c == ')');
    }

    static int outPrecedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 3;
            case '^':
                return 6;
            case '(':
                return 7;
            case ')':
            default:
                return 0;
        }
    }

    static int inPrecedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 2;
            case '*':
            case '/':
                return 4;
            case '^':
                return 5;
            case '(':
            default:
                return 0;
        }
    }

    static String inToPost(String infix) {
        Stacks<Character> st = new Stacks<>();
        int i = 0;
        StringBuilder postfix = new StringBuilder();
        while (i < infix.length()) {
            char temp = infix.charAt(i);
            if(isOperand(temp)) {
                postfix.append(temp);
                i++;
            } else {
                if(st.isEmpty() || outPrecedence(temp) > inPrecedence(st.peek())) {
                    st.push(temp);
                    i++;
                } else if(st.isEmpty() || outPrecedence(temp) < inPrecedence(st.peek())) {
                    postfix.append(st.pop());
                } else {
                    st.pop();
                    i++;
                }
            }
        }
        while (!st.isEmpty()) {
            postfix.append(st.pop());
        }
        return postfix.toString();
    }

    public static void main(String[] args) {
        String infix = "((a^b^c)*(d-e*d))";
        System.out.println(inToPost(infix));
    }
}
