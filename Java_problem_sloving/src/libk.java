class linkedlistconcat {

    class nodi{
        int d;
        nodi next;
        public nodi(int data){
            d=data;
            next=null;
        }
    }

    nodi head;

    public linkedlistconcat(nodi Head){
        head=Head;
    }
    public linkedlistconcat(){
        head=null;
    }
    public nodi createfromarray(int[] a){
        nodi p=new nodi(a[0]);
        nodi q=p;
        for(int i=1;i<a.length;i++){
            nodi t=new nodi(a[i]);
            p.next=t;
            p=t;
        }
        return q;
    }

    public void concat(nodi head,nodi head1){
        nodi p=head1;
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
    public void display(nodi head){
        nodi p=head;
        while(p!=null){
            System.out.print(p.d+" ");
            p=p.next;
        }
    }
}
class libk{
        public static void main(String[] args) {
            linkedlistconcat l=new linkedlistconcat();
            int[] a={1,2,3,4};
            linkedlistconcat.nodi head=l.createfromarray(a);
            l.display(l.head);
            int[] b={5,6,7,8,9};
            linkedlistconcat.nodi head1=l.createfromarray(b);
            l.display(l.head);
            l.concat(head,head1);
            l.display(l.head);
    }
}
