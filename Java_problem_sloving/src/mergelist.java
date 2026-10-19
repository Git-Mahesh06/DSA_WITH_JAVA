class merge{
    class nod{

        int d;
        nod next;
        public nod(int data){
            d=data;
            next=null;
        }
    }
    nod head,head1;
    public merge(nod head,nod head1){
        this.head=head;
        this.head1=head1;
    }
    public merge(){
        head=null;
        head1=null;
    }
    public nod insert(int val,int index){
        if(index==0){
            nod p=new nod(val);
            head=p;
        }
        else{
            nod p=head;
            for(int i=0;i<index-1 && p!=null;i++){
                p=p.next;
            }
            nod t=new nod(val);
            t.next=p.next;
            p.next=t;
        }
        return head;
    }
    public void display(){
        nod p=head;
        while(p!=null){
            System.out.print(p.d+" ");
            p=p.next;
        }
    }
}
class mergelist {
    public static void main(String[] args) {
        merge l1 = new merge();
        int[] a={1,2,3,4,5};
        merge.nod head1,head2;

        merge l2=new merge();
        int[] b={3,4,5,6,7};
        for(int i=0;i<a.length;i++){
            head1=l1.insert(a[i],i);
        }
        l1.display();
        for(int i=0;i<b.length;i++){
            l2.insert(b[i],i);
        }
        System.out.println();
        l2.display();
    }
}
