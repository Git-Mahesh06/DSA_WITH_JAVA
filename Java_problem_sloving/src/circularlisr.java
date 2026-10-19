class links{

        public int d;
        public links next;

        public links(int d) {
            this.d = d;
            next = null;
        }
}
class circularlisr {
    public static links head=null;
    public static void dispplay(links head){
        links p=head;
        do{
            System.out.print(p.d+" ");
            p=p.next;
        }while(p!=head);
    }
    public static links createarray(int[] a){
        links node=new links(a[0]);
        links s=node,t=null;
        for(int i=1;i<a.length;i++){
            t=new links(a[i]);
            s.next=t;
            s=t;
        }
        s.next=node;
        head=node;
        return head;
    }
    public static void insert(int val,int index){
        if(index<0){
            System.out.println("invalid index");
            return;
        }
        if(head==null){
            links p=null;
            p=new links(val);
            p.next=p;
            head=p;
        }
        if(index==0){
            links t=new links(val);
            links p=head;
            while(p!=head){
                p=p.next;
            }
            t.next=head;
            p.next=t;
            head=t;
        }
        else{
            links t=new links(val);
            links p=head;
            for(int i=0;i<index-1 && p.next!=head;i++){
                p=p.next;
            }
            t.next=p.next;
            p.next=t;
        }
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4};
       links head=createarray(a);
       dispplay(head);
       System.out.println();
       insert(10,3);
       dispplay(head);
        System.out.println();
//        insert(20,1);
        dispplay(head);

    }

}
