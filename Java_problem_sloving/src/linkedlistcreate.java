import java.util.Scanner;

class Node1{
    int d;
    Node1 next;
    public Node1(int d){
        this.d=d;
        this.next=null;
    }
    public void traverse(Node1 t){
        Node1 p=t;
        while(p!=null){
            System.out.print(p.d+" ");
            p=p.next;
        }
    }
    public void rectraversal(Node1 p){
        if(p!=null){
            System.out.print(p.d+" ");
            rectraversal(p.next);
//            System.out.print(p.d+" ");
        }
    }
    public int findcount(Node1 p){
        if(p==null) return 0;
        else return 1+findcount(p.next);
    }
    public int findsum(Node1 p){
        if(p==null) return 0;
        else return p.d+findsum(p.next);
    }
    int m=0;
    public int findmax(Node1 p){

        if(p==null)
            return m;
        int m1=findmax(p.next);
        if(p.d>m1)
            m1=p.d;
        return m1;
    }
    public void insertatspecifiespos(Node1 p,Node1 hh,int i){
        Node1 q,r=p;
        int c=0;
        while(r!=null){
            r=r.next;
            c++;
            q=r;
            if(c==i){
                r.next=hh;
                hh.next=q.next;
            }
        }
//        traverse(p);
    }
}
class linkedlistcreate{
    public static void main(String[] args) {
    int[] a={1,2,3,4,5};
//        Node1 head=new Node1(10);
//        head.next=new Node1(20);
//        head.next.next=new Node1(30);
//        head.traverse(head);

//  create array element in alinked list format
//        Node1 head=new Node1(a[0]);
//        Node1 p=head,t;
//        for(int i=1;i<a.length;i++) {
//            t = new Node1(a[i]);
//            p.next = t;
//            p = t;
//        }
//        head.traverse(head);
//    create linked list and insert at begining
        Node1 head=null;
        Node1 temp=head,t;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number nodes ina list");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int n1=in.nextInt();
            if(head==null){
                head=new Node1(n1);
                temp=head;
            }
            else{
                t=new Node1(n1);
                t.next=temp;
                temp=t;
            }
        }
//        head.traverse(temp);

        Node1 p,q=null;
        System.out.println("Enter no. to insert at front");
        int m=in.nextInt();
        for(int i=0;i<m;i++){
            int m1=in.nextInt();
            if(head.next==null){
                p=new Node1(m1);
                head.next=p;
                q=p;
            }
            else {
                p= new Node1(m1);
                q.next = p;
                q = p;
            }

            }
//        head.traverse(temp);
//        System.out.println();
//        head.traverse(head);
//        System.out.println();
//        head.traverse(q);
        System.out.println("Enter elemnt to insert at specified position");
        int l=in.nextInt();
        Node1 hh=new Node1(l);
        System.out.println("position tp insert");
        int i=in.nextInt();
        head.rectraversal(temp);
        System.out.println();
        System.out.println(head.findcount(temp));
         System.out.println(head.findsum(temp));
         System.out.println(head.findmax(temp));
            head.insertatspecifiespos(temp,hh,i);
        head.rectraversal(temp);
        }
    }

