class  link{
    int d;
    link l;
    public link(int d){
        this.d=d;
        l=null;
    }
}
class arrailinkedlist{
    public static void insert(int index,int v,link h){
        if(index==0){
            link t=new link(v);
            t.l=h;
            h=t;
        }
        else{
            link p=h;
            for(int i=0;p!=null && i<index-1;i++){
                p=p.l;
            }
            link t=new link(v);
            t.l=p.l;
            p.l=t;
        }
        System.out.println();
        while(h!=null){
            System.out.print(h.d+" ");
            h=h.l;
        }

    }
    public static void traverse(link h){
        while(h!=null){
            System.out.print(h.d+" ");
            h=h.l;
        }
    }
    public static void main(String[] args) {
    int[] a={10,20,30,40,50};
    link head=null;
    head=new link(a[0]);
    link h1,p,t=null;
    h1=p=head;
    for(int i=1;i<a.length;i++){
        t=new link(a[i]);
        head.l=t;
        head =t;
    }
        insert(0,2,p);
    traverse(h1);
        insert(4,80,p);
//    while(h1!=null) {
//        System.out.print(h1.d + " ");
//        h1 = h1.l;
//
//    }
        traverse(h1);
    }
}
