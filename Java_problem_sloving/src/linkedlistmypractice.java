class linkedliss
{
    class Nodes
    {
        int data;
        Nodes next;
        public Nodes(int data)
        {
            this.data=data;
            next=null;
        }
    }
    Nodes head;
    public linkedliss(Nodes Head){
        this.head=Head;
    }
    public linkedliss(){
        this.head=null;
    }
    public void insert(int index,int val){
        if(index==0){
            Nodes p=new Nodes(val);
            p.next=head;
            head=p;
        }
        else{
            Nodes p=head;
            for(int i=0;i<index && p!=null;i++){
                p=p.next;
            }
            if(p!=null) {
                Nodes t = new Nodes(val);
                t.next=p.next;
                p.next=t;
            }
        }
    }
    public void delete(int index){
        Nodes p=head,q=null;
        int x=0;
        if(index==0){
            x=p.data;
            head=p.next;
            p=null;
        }
        else{
            for(int i=0;i<index-1 && p!=null;i++){
                p=p.next;
            }
            if(p!=null){
                q=p.next;
                x=q.data;
                p.next=q.next;
                //q=null;
            }
        }
        System.out.println("Deleted element is "+x);
    }
    public int linearsearch(int key){
        Nodes q=null,p=head;
        while(p!=null){
            if(p.data==key){
                if(p!=head) {
                    q.next = p.next;
                    p.next = head;
                    head = p;
                }
                return p.data;
            }
            q=p;
            p=p.next;
        }
        return 0;
    }
    public int large(){
        Nodes p=head;
        int m=0;
        while(p!=null){
            if(p.data>m){
                m=p.data;
            }
            p=p.next;
        }
        return m;
    }
    public void display(){
        Nodes c=head;
        while(c!=null){
            System.out.print(c.data+" ");
            c=c.next;
        }
    }
    public void remove(int val){
        Nodes p=head,q=null;
        while(p!=null){
            if(p.data==val)
                break;
            q=p;
            p=p.next;
        }
        if(p!=null){
            if(p==head){
                head=head.next;
            }
            else{
                q.next=p.next;
            }
            p=null;
        }
    }
    public void reverse(){
        Nodes p=head;
        Nodes q=null,r=null;
        while(p!=null){
            r=q;
            q=p;
            p=p.next;
            q.next=r;
        }
        head=q;
    }
    public void recrev(Nodes head){
        if(head!=null){
            recrev(head.next);
            System.out.print(head.data+" ");
    }}
    public void recre(Nodes p,Nodes q){
        if (p!=null){
            recre(p.next,p);
            p.next=q;
        }
        else{
            head=q;
        }
    }
    public boolean issorted(){
        Nodes p=head;
        while(p.next!=null){
            if(p.data>p.next.data)
                return false;
            p=p.next;
        }
        return true;
    }
    public void issortedplace(int val){
        Nodes p=head,q=null;
        while( p.data<=val && p!=null){
            q=p;
            p=p.next;
        }
        Nodes t=new Nodes(val);
        t.next=p;
        if(q!=null) q.next=t;
        else head=t;
    }
    public void insertionsort(Nodes head){
        Nodes head2=head.next;
        head.next=null;
        while(head2!=null){
            Nodes t=head2;
            head2=head2.next;
            Nodes p=head,q=null;
            while(p!=null && p.data<=t.data){
                q=p;
                p=p.next;
            }
            t.next=p;
            if(q==null) head=t;
            else q.next=t;
        }
        display();
    }
    public void concat(Nodes head1){
        Nodes p=head;
        while(p!=null && p.next!=null){
            p=p.next;
        }
        if(head==null){
            head=head1;
        }
        else{
            p.next=head1;
        }
    }
}
public class linkedlistmypractice {
    public static void main(String[] args) {
        linkedliss l=new linkedliss();
        int[] a={20,20,10,40,60,10};

        for (int i=0;i<a.length;i++){
            l.insert(i,a[i]);
        }
        l.insert(4,60);
//        l.display();
//        System.out.println();
////        System.out.println(l.linearsearch(30));
////        System.out.println(l.count());
////        l.delete(1);
//        l.display();
//        System.out.println();
////        l.remove(10);
//        l.reverse();
//        l.display();
//        System.out.println();
//        l.recrev(l.head);
//            l.recre(l.head,null);
//        System.out.println();
//            l.display();
        System.out.println();
//        System.out.println(l.issorted());
//        l.issortedplace(34);
        l.display();
//        System.out.println();
//        l.insertionsort(l.head);
//        l.display();
//        System.out.println();
        l.issortedplace(10);
        l.display();

    }
}
