
class nd<T>{
    T data;
    nd next;
}

class stackLL<T> {
    nd<T> top;
    stackLL(){
        top=null;
    }
    void push(T val){
        nd<T> t=new nd<T>();
        t.data=val;
        t.next=top;
        top=t;
    }
    T pop(){
        nd<T> p=top;
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
        nd<T> t=top;
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
        nd<T> p=top;
        while(p!=null){
            System.out.print(p.data+" ");
            p=p.next;
        }
        System.out.println();
    }
}
public class GenericstackLinkedlist{
    public static void main(String[] args) {
        stackLL<Character> ss=new stackLL<Character>();
        ss.push('M');
        ss.push('A');
        ss.push('H');
        ss.display();
        // System.out.println(ss.pop());
        ss.display();
        System.out.println(ss.peek(3));

    }
}