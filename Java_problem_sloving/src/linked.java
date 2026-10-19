class Node{
    int d;
    Node next;
}
class linked{
    public static void main(String[] args) {
        Node head;
        head=new Node();
        head.d=10;
        head.next=null;

        Node p=new Node();
        p.d=20;p.next=null;
        head.next=p;

        Node temp=head;
        while(temp!=null){
            System.out.println(temp.d);
            temp=temp.next;
        }
//        System.out.println(temp.d);

    }
}
