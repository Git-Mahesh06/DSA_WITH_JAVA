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
        if(c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '(' || c == ')')
            return false;
        else
            return true;
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
        String infix = "5+4*3-6/2";
        String post= inToPost(infix);
        System.out.println(post);

        stackLL<Integer> ss=new stackLL<Integer>();
        int res=0;
        int x1,x2;
        for(int i=0;i<post.length();i++){

            if(isOperand(post.charAt(i)))
            {
                ss.push(post.charAt(i)-'0');
            }
            else {
                x2 = ss.pop();
                x1 = ss.pop();
                switch (post.charAt(i)) {
                    case '+':
                        res = x1 + x2;
                        ss.push(res);
                        break;
                    case '-':
                        res = x1 - x2;
                        ss.push(res);
                        break;
                    case '*':
                        res = x1 * x2;
                        ss.push(res);
                        break;
                    case '/':
                        res = x1 / x2;
                        ss.push(res);
                        break;
                    case '^':
                        res = x1 ^ x2;
                        ss.push(res);
                        break;

                }
            }
        }
        System.out.println("Res: "+ss.pop());

    }
}
