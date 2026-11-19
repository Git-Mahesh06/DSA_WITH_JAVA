import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.SocketHandler;

class node{
    node lchild;
    int data;
    node rchild;
    node(int data){
        lchild=null;
        this.data=data;
        rchild=null;
    }
}
class iterativetraversal{
    Stack<node> s=new Stack<>();
    public void preorder(node p){
        while(!s.isEmpty() || p!=null) {
            if (p != null) {
                System.out.print(p.data + " ");
                s.push(p);
                p = p.lchild;
            } else {
                p = s.pop();
                p = p.rchild;
            }
        }
    }
    public void inorder(node p){
        while(!s.isEmpty() || p!=null){
            if(p!=null){
                s.push(p);
                p=p.lchild;
            }
            else{
                p=s.pop();
                System.out.println(p.data+" ");
                p=p.rchild;
            }
        }
    }
}
public class treecreationusingkeyb {
    static node root;

    static void preorder(node p){
        if(p!=null) {
            System.out.print(p.data+" ");
            preorder(p.lchild);
            preorder(p.rchild);
        }
    }
    static void inorder(node p) {
        if (p != null) {
            inorder(p.lchild);
            System.out.print(p.data + " ");
            inorder(p.rchild);
        }
    }
    static void postorder(node p) {
        if (p != null) {
            postorder(p.lchild);
            postorder(p.rchild);
            System.out.print(p.data + " ");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayDeque<node> dq=new ArrayDeque<>();
        System.out.println("Enter the root element");
        int val=in.nextInt();
        in.nextLine();
        root=new node(val);
        dq.addLast(root);

        node next,temp;
        String ans;
        while(!dq.isEmpty()){
            next=dq.removeFirst();
            System.out.println(next.data+"have left child");
            ans=in.next();
            if(ans.equals("yes")){
                System.out.println("Enter left child of "+next.data);
                val=in.nextInt();
                in.nextLine();
                temp=new node(val);
                next.lchild=temp;
                dq.addLast(temp);
            }
            System.out.println(next.data+"have right child");
            ans=in.next();
            if(ans.equals("yes")){
                System.out.println("Enter right child of "+next.data);
                val=in.nextInt();
                in.nextLine();
                temp=new node(val);
                next.rchild=temp;
                dq.addLast(temp);
            }
        }
        preorder(root);
        iterativetraversal i=new iterativetraversal();
        i.preorder(root);
        System.out.println();
        i.inorder(root);
    }
}
