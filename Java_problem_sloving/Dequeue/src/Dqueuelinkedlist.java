class dqnodes{
    int data;
    dqnodes next;
    dqnodes(int data){
        this.data=data;
        next=null;
    }
}
class dqmethods{
    dqnodes head=null,r=null,f=null;
    void insertlast(int val){
        dqnodes t=new dqnodes(val);
        if(r==null){
            head=r=f=t;
        }
        r.next=t;
        r=t;
    }
    void insertfront(int val){
        dqnodes t=new dqnodes(val);
        if(f==null){
            head=r=f=t;
        }
        t.next=f;
        f=t;
    }
    int deletelast(){
        if(f==r){
            f=r=null;
            throw new RuntimeException("No elements");
        }
        dqnodes h=f;
        while(h.next!=null){
            r=h;
            h=h.next;
        }
        r.next=null;
        int e=h.data;
        return e;
    }
    int deletefront(){
        if(f==r){
            f=r=null;
        }
        dqnodes n=f;
        f=f.next;
        int e=n.data;
        n=null;
        return e;
    }
    void display(){
        dqnodes cur=f;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }

    }
}
public class Dqueuelinkedlist {
    public static void main(String[] args) {
        dqmethods dqm=new dqmethods();
        dqm.insertlast(10);
        dqm.insertlast(20);
        dqm.insertlast(30);
        dqm.insertlast(40);
        dqm.display();
        System.out.println();
        dqm.deletelast();
        dqm.display();
        dqm.insertlast(50);
        dqm.display();
        dqm.insertfront(60);
        System.out.println();
        dqm.display();
        System.out.println(dqm.deletefront());
        System.out.println();
        dqm.display();
    }
}
