
class  qnnd{
    int data;
    qnnd next;
    qnnd(int data){
        this.data=data;
        next=null;
    }
}
class methodsqeue{
    qnnd r,f,head;
    methodsqeue(){
        r=f=head=null;
    }
    void enqueue(int val){
        qnnd t=new qnnd(val);
        if(f==null){
            head=r=f=t;
        }
        f.next=t;
        f=t;
    }
    int dequeue(){
        if(r==null || f==null){
            throw new RuntimeException("Queue is empty");
        }
        int e=r.data;
        if(f==r)
            f=r=null;
        else{
            r=r.next;
        }
        return e;
    }
    void display(){
        qnnd h=r;
        while(h!=null){
            System.out.print(h.data+" ");
            h=h.next;
        }
    }
}
public class queueusinglinkedlist {
    public static void main(String[] args) {

    methodsqeue ms=new methodsqeue();
    ms.enqueue(10);
    ms.enqueue(20);
    ms.enqueue(30);
    ms.display();
        System.out.println(ms.dequeue());
    ms.display();
    }
}
