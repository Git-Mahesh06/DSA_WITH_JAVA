class linkss{
    public linkss prev;
    public int data;
    public linkss next;
    public linkss(int data){
        this.prev=null;
        this.data=data;
        this.next=null;
    }
}
public class dList {

    static linkss head;
    public static void create(int[] a){
        head=new linkss(a[0]);
        linkss p=head;
        for(int i=1;i<a.length;i++){
            linkss t=new linkss(a[i]);
            p.next=t;
            t.prev=p;
            p=t;
        }
        while(p!=null){
            System.out.print(p.data+" ");
            p=p.prev;
        }
    }
    public static void dis(linkss head){
        linkss p=head;
        while(p!=null){
            System.out.print(p.data+" ");
            p=p.next;
        }
    }
    public static void insert(int index,int val){
        if(index==0){
            linkss t=new linkss(val);
            t.next=head;
            head.prev=t;
            head=t;
            if(head==null)
                head=t;
        }
        else{
            linkss t=new linkss(val);
            linkss p=head;
            for(int i=0;i<index-1 && p.next!=null;i++){
                p=p.next;
            }
            t.next=p.next;
            t.prev=p;
            p.next=t;
            if(t.next!=null)
                t.next.prev=t;

            dis(t);
        }

    }
    public static int delete(int index){
        int x=0;

        if(index==0){
            linkss t=head;
            head=head.next;
            x=t.data;
        }
        else{
            linkss p=head,t=head;
            for(int i=0;i<index && p.next!=null;i++ ){
                t=p;
                p=p.next;
            }
            if(p.next==null){
                x=p.data;
                t.next=null;
            }
            else{
                x=p.data;
                t.next=p.next;
                p.next.prev=t;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int[] A={1,2,3,4};
        create(A);
        System.out.println();
        dis(head);
        insert(5,10);
        System.out.println();
        dis(head);
        System.out.println();
        System.out.println(delete(3));
        System.out.println();
        dis(head);
    }
}
