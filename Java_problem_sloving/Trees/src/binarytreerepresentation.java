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
    static ArrayDeque<Node> d=new ArrayDeque<Node>();
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
            inorder(p.lchild);
            System.out.print(p.data + " ");
            inorder(p.rchild);
        }
    }
    static void postorder(Node p) {
        if (p != null) {
            postorder(p.lchild);
            postorder(p.rchild);
            System.out.print(p.data + " ");
        }
    }
    static int height(Node p){
        if(p==null) return 0;
        else{
            int lh=height(p.lchild);
            int rh=height(p.rchild);
            if(lh>rh)
                return lh+1;
            else
                return rh+1;
        }
    }
    static void delete(Node p){
        if(p!=null){
            delete(p.lchild);
            delete(p.rchild);
            p.lchild=p.rchild=null;
        }

    }
    static void levelordertraversal(Node p){
        System.out.print(p.data+" ");
        d.addLast(p);
        while(!d.isEmpty()){
            p=d.removeFirst();
            System.out.print(p.data+" ");
            if(p.lchild!=null){

                d.addLast(p.lchild);
            }
            if(p.rchild!=null){

                d.addLast(p.rchild);
            }
        }
    }

    public static void main(String[] args) {
        Node root;
        int[] a={10,20,30,40,50,60,70};

        root=new Node(a[0]);
        d.addLast(root);
        int i=1;
        Node next,temp;
        while(i<a.length){
            next=d.removeFirst();
            temp=new Node(a[i++]);
            next.lchild=temp;
            d.addLast(temp);

            temp = new Node(a[i++]);
            next.rchild = temp;
            d.addLast(temp);
        }
        //System.out.println(count(root));
//        System.out.println();
//        preorder(root);
//        System.out.println();
//        inorder(root);
//        System.out.println();
//        postorder(root);
//        System.out.println(height(root));
        // Linked list representation using Array and its traversal
//        System.out.println();
//        levelordertraversal(root);
    }
}
