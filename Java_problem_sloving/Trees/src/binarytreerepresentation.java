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
    static void preorder(Node p){
        if(p!=null) {
            System.out.print(p.data+" ");
            preorder(p.lchild);
            preorder(p.rchild);
        }
    }
    static void inorder(Node p) {
        if (p != null) {
            preorder(p.lchild);
            System.out.print(p.data + " ");
            preorder(p.rchild);
        }
    }
    static void postorder(Node p) {
        if (p != null) {
            preorder(p.lchild);
            preorder(p.rchild);
            System.out.print(p.data + " ");
        }
    }

    public static void main(String[] args) {
        Node root=null;
        int[] a={10,20,30,40,50,60,70};
        ArrayDeque<Node> d=new ArrayDeque<Node>();
        root=new Node(a[0]);
        d.addLast(root);
        int i=1;
        Node next,temp;
        while(i<a.length){
            next=d.removeFirst();
            temp=new Node(a[i++]);
            next.lchild=temp;
            d.addLast(temp);
            if(i < a.length) {
                temp = new Node(a[i++]);
                next.rchild = temp;
                d.addLast(temp);
            }
        }
        System.out.println(count(root));
        System.out.println();
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
// Linked list representation using Array and its traversal
    }
}
