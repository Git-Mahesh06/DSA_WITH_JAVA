class nds<T>{
    T data;
    nds next;
}

class stackLLl<T> {
    nds<T> top;
    stackLLl(){
        top=null;
    }
    void push(T val){
        nds<T> t=new nds<>();
        t.data=val;
        t.next=top;
        top=t;
    }
    T pop(){
        nds<T> p=top;
        T x;
        if(p==null)
            throw new RuntimeException("Stackunderflow");
        x=p.data;
        top=top.next;
        p.next=null;
        p=null;
        return x;
    }
    T peek(int index){
        nds<T> t=top;
        for(int i=0;i<index-1 && t!=null;i++)
            t=t.next;
        T x;
        if(t==null) {
            throw new RuntimeException("Stackunderflow");
        }
        x = t.data;
        return x;
    }
    void display(){
        nds<T> p=top;
        while(p!=null){
            System.out.print(p.data+" ");
            p=p.next;
        }
        System.out.println();
    }
    boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }
    T stackTop(){
        return top.data;
    }
}
public class InfixtopostfixconversionLinkedList {
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
static String infixtopost(String infix){
        StringBuilder postfix=new StringBuilder();
        stackLLl<Character> sc=new stackLLl<Character>();
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
        String infix="a+b*c-d/e";
        System.out.println("Infix "+infix);
        System.out.println("Postfix "+infixtopost(infix));

    }
}
