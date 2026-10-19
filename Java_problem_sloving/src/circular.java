class circdoublylink{

    class nodeis{
        nodeis prev;
        int data;
        nodeis next;

        nodeis(int data){
        this.prev=null;
        this.data=data;
        this.next=null;
        }
    }
    nodeis head;

    circdoublylink(){
        head=null;
    }
    void insert(int index,int val){
        if(index==0){
            nodeis t=new nodeis(val);
            if(head==null){
                t.next=t;
                t.prev=t;
                head=t;
            }
            else{
                t.next=head;
                t.prev=head.prev;
                t.prev.next=t;
                head.prev=t;
                head=t;
            }
        }
        else{
            nodeis t= new nodeis(val);
            nodeis p=head;
            for(int i=0;i<index-1 && p.next!=head;i++)
                p=p.next;
            t.next=p.next;
            t.prev=p;
            p.next=t;
            t.next.prev=t;

         //  display(t);
        }
    }
    void display(nodeis t){
        nodeis p=t;
        do{
            System.out.print(p.data+" ");
            p=p.prev;
        }while(p!=t);
    }
    void delete(int index){
       int x=0;
       if(index<1)
           return;
        if(index==1){
            if(head!=null){
            nodeis p=head;
            head=head.next;
            if(head!=p){
                head.prev=p.prev;
                p.prev.next=head;
                x=p.data;
                p=null;
            }
            nodeis t=head;
            x=t.data;
            t=null;
        }
        }
        else{
            nodeis p=head;
            for(int i=0;i<index-1 && p.next!=head;i++)
                p=p.next;
            p.next.prev=p.prev;
            p.prev.next=p.next;
            x=p.data;
            p=null;

        }
        System.out.println(x);
    }
}
public class circular {
    public static void main(String[] args) {

        circdoublylink dl = new circdoublylink();
        dl.insert(0,10);
        dl.insert(1,20);
        dl.insert(2,30);
        dl.insert(3,40);
        dl.insert(0,20);
        System.out.println();
        dl.display(dl.head);
        System.out.println();
        dl.delete(1);
        System.out.println();
        dl.display(dl.head);
    }
}
