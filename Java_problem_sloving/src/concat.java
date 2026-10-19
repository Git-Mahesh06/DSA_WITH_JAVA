class nodes{
    public int data;
    public nodes next;
    public nodes head3=null;
    public nodes(int data){
        this.data=data;
        next=null;
    }
}
public class concat {

    public static void display(nodes head){
        nodes c=head;
        while(c!=null){
            System.out.print(c.data+" ");
            c=c.next;
        }
    }
    public static nodes createlistfromarray(int[] a){
        nodes head=new nodes(a[0]);
        nodes t=head;
        for(int i=1;i<a.length;i++){
            nodes p=new nodes(a[i]);
            t.next=p;
            t=p;
        }
        return head;
    }
    public static void conact(nodes head1,nodes head2){
        if(head1==null){
            head1=head2;
        }
        nodes c=head1;
        while(c!=null && c.next!=null){
            c=c.next;
        }
        c.next=head2;
    }
    public static nodes loop(int[] a){
        nodes p=new nodes(a[0]);
        nodes head=p,q=p;
        for(int i=1;i<a.length;i++){
            nodes t=new nodes(a[i]);
            if(p!=null && p.next!=null){
                p.next=t;
                p=t;
            }
            else{
                p.next=head;
            }
        }
    return q;
    }

    public static boolean floydscycle(nodes head){
        nodes q=head,p=head;
        do{
            p=p.next;
            q=q.next;
            if(q!=null)
                q=q.next;
        }while(q!=null && p!=null && p!=q);
        if(p==q){
            return true;
        }
        return false;
    }
    public static nodes merge(nodes head1,nodes head2){
        nodes head3=null,last=null,t;
        if(head1.data>head2.data){
         head3=head2;
         last=head2;
         head2=head2.next;
        }
        else{
            head3=head1;
            last=head1;
            head1=head1.next;
        }
        while(head1!=null && head2!=null){
            if(head1.data>head2.data){
                t=head2;
                head2=head2.next;
                t.next=null;
                last.next=t;
                last=t;
            }
            else{
                t=head1;
                head1=head1.next;
                t.next=null;
                last.next=t;
                last=t;
            }
        }
        if(head1!=null){
            last.next=head1;
            head1=null;
        }
        else{
            last.next=head2;
            head2=null;
        }
        return head3;
    }
    public static void display1(nodes head){
        nodes p=head;
        do{
            System.out.print(p.data+" ");
            p=p.next;
        }while(p!=head);
        System.out.println();
    }


    public static void main(String[] args) {
        int[] a={1,4,7,9,10};
        nodes head1=createlistfromarray(a);

        int[] b={2,3,10,12,30};
        nodes head2=createlistfromarray(b);


        System.out.println();
        display(head1);
        System.out.println();
        display(head2);
//        conact(head1,head2);
        System.out.println();
//        display(head1);
        System.out.println();
        nodes head3=merge(head1,head2);
        display(head3);

        int[] c={1,2,3,4};
        nodes q=loop(c);
        System.out.println(floydscycle(q));

        int[] d={3,4,5,6,7};
        nodes s1=loop(d);
        display(s1);
    }
}
