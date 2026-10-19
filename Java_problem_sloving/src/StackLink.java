class nd {
    int data;
    nd next;
}

class stackLL {
    nd top;
   stackLL(){
        top=null;
    }
    void push(int val){
       nd t=new nd();
       t.data=val;
       t.next=top;
       top=t;
    }
    int pop(){
       nd p=top;
       int x=0;
       if(p==null)
           throw new RuntimeException("Stackunderflow");
       x=p.data;
       top=top.next;
       p.next=null;
       p=null;
       return x;
    }
    int peek(int index){
       nd t=top;
       for(int i=0;i<index-1 && t!=null;i++)
           t=t.next;
       int x=0;
       if(t!=null) {
           x = t.data;
           return x;
       }
       return 0;
    }
    void display(){
       nd p=top;
       while(p!=null){
           System.out.print(p.data+" ");
           p=p.next;
       }
        System.out.println();
    }
}
public class StackLink{
    public static void main(String[] args) {
        stackLL ss=new stackLL();
        ss.push(10);
        ss.push(20);
        ss.push(30);
        ss.display();
       // System.out.println(ss.pop());
        ss.display();
        System.out.println(ss.peek(4));

    }
}

