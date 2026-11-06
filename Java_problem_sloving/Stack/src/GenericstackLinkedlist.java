
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
    boolean isemp(){
        return top==null;
    }
}
class Queueusingstack<T>{
    stackLL<T> s1;
    stackLL<T> s2;
    Queueusingstack(){
        s1=new stackLL<T>();
        s2=new stackLL<T>();
    }
    boolean isempty(){
        return s1.isemp() && s2.isemp();
    }
    void enqueue(T val){
        s1.push(val);
    }
    T dequeue(){
        if(s2.isemp()){
            if(s1.isemp()){
                throw new RuntimeException("NO elements");
            }
            else{
                while(!s1.isemp())
                    s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
}

public class GenericstackLinkedlist{
    public static void main(String[] args) {
//        stackLL<Character> ss=new stackLL<Character>();
//        ss.push('M');
//        ss.push('A');
//        ss.push('H');
//        ss.display();
//        // System.out.println(ss.pop());
//        ss.display();
//        System.out.println(ss.peek(3));
        Queueusingstack<Object> qq=new Queueusingstack<>();
        qq.enqueue(10);
        qq.enqueue(20);
        qq.enqueue(30);
        qq.enqueue(40);
        qq.s1.display();
        System.out.println();
        qq.dequeue();
        qq.enqueue(50);
        qq.enqueue(60);
        //qq.s1.display();
        System.out.println();
        qq.s1.display();
        qq.s2.display();
    }
}