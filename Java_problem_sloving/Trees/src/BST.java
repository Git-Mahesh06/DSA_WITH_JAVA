import com.sun.nio.sctp.SctpStandardSocketOptions;

class Node1 {
    int data;
    Node1 left, right;

    public Node1(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node1 root;

    BinarySearchTree() {
        root = null;
    }

    Node1 insertRec(Node1 root, int key) {
        if (root == null) {
            root = new Node1(key);
            return root;
        }

        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    void inorderRec(Node1 root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    void inorder() {
        inorderRec(root);
    }
    Node1 deleteBST(Node1 p,int key){
        if (p==null)
            return null;
        if(p.data==key && p.left==null && p.right==null)
            return null;
        if(p.data>key)
            p.left=deleteBST(p.left,key);
        else if (p.data<key)
            p.right=deleteBST(p.right,key);
        else {
            if(height(p.left)>height(p.right)){
                Node1 pre=findprec(p.left);
                p.data=pre.data;
                p.left=deleteBST(p.left, pre.data);
            }
            else{
                Node1 pre=findsucc(p.right);
                p.data=pre.data;
                p.right=deleteBST(p.right, pre.data);
            }
        }
        return p;
    }
    int height(Node1 p){
        if(p==null)
            return 0;
        else{
           int lc=height(p.left)+1;
           int rc=height(p.right)+1;
           if(lc>rc)
               return lc;
           else
               return rc;
        }
    }
    Node1 findprec(Node1 q){
        while(q!=null && q.right!=null)
            q=q.right;
        return q;
    }
    Node1 findsucc(Node1 q){
        while(q!=null && q.left!=null)
            q=q.left;
        return q;
    }
    void delete(){
        deleteBST(root,30);
    }
}

public class BST {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] keys = {30, 40, 35, 20, 15, 50, 45, 25, 21};
    int m=10;
        for (int key : keys) {
            tree.insert(key);
        }

        System.out.print("Inorder traversal: ");
        tree.inorder();
        tree.delete();
        System.out.println();
        tree.inorder();
    }
}