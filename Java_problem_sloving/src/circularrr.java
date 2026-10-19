class Nodis{
    public int data;
    public Nodis link;

    public Nodis(int data){
        this.data=data;
        this.link=null;
    }
}
public class circularrr {
    private static Nodis head;
    public static void createarray(int[] a){
        head=new Nodis(a[0]);
        Nodis h=head,l=head;
        for(int i=1;i<a.length;i++){
            Nodis c=new Nodis(a[i]);
            h.link=c;
            h=c;
        }
        h.link=head;
    }
    public static void display(){
        Nodis c=head;
        do{
            System.out.print(c.data+" ");
            c=c.link;
        }while(c!=head);

    }
    public static void insert(int index,int val){
        if(index==0){
            Nodis t=new Nodis(val);
            if(head==null){
                t.link=t;
                head=t;
            }
            else{
                t.link=head;
                Nodis p=head;
                while(p.link!=head){
                    p=p.link;
                }
                p.link=t;
                head=t;
            }
        }
        else{
            Nodis t= new Nodis(val);
            Nodis p=head;
            for(int i=0;i<index-1 && p.link!=head;i++){
                p=p.link;
            }
            t.link=p.link;
            p.link=t;
        }
    }
    public static int delete(int index){
       int x=0;
        if(index==1){
            if(head!=null){
                Nodis t=head;
                if(head.link==head){
                    head=null;
                    x=head.data;
                }
                else{
                    Nodis p=head;
                    while(p.link!=head){
                        p=p.link;
                    }
                    head=head.link;
                    p.link=head;
                    x=t.data;
                }
            }
        }
        else{
        Nodis p=head,t=head;
        for(int i=0;i<index-2 && p.link!=head;i++){
            p=p.link;
        }
        Nodis p1=p.link;
        p.link=p1;
        x=p1.data;
        }
        return x;
    }
    public static void main(String[] args) {
        int[] A={10,20,30,40};
        createarray(A);
        display();
        insert(0,10);
        insert(3,10);
        System.out.println();
        display();
        System.out.println();
        System.out.println(delete(1));
    }
}
