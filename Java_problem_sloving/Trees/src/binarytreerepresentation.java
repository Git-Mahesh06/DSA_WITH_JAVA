import java.util.ArrayDeque;

class Node{
    Node lchild;
    int data;
    Node rchild;
    Node(int data){
        lchild=null;
        this.data=data;
        rchild=null;
    }
}
public class binarytreerepresentation {
    static int count(Node p){
        if(p==null) return 0;
        else{
            int x=count(p.lchild);
            int y=count(p.rchild);
            return x+y+1;
        }
    }
    static Node root;
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,60,70};
        ArrayDeque<Node> d=new ArrayDeque<Node>();
        root=new Node(a[0]);
        d.addLast(root);
        int i=1;
        Node next,temp;
        while(i<a.length-1){
            next=d.removeFirst();
            temp=new Node(a[i++]);
            next.lchild=temp;
            d.addLast(temp);

            temp=new Node(a[i++]);
            next.rchild=temp;
            d.addLast(temp);

        }
        System.out.println(count(root));
    }
}
