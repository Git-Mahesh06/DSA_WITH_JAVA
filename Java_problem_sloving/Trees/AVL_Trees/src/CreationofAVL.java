class nodes{
    int lh,rh;
    nodes lchild;
    int data;
    nodes rchild;
    nodes(int da){
        data=da;
        lh=rh=1;
        lchild=rchild=null;
    }
}
class Binary{
    nodes root;
    Binary(){
        root=null;
    }
    nodes BSTAVLcreation(nodes p,int key){
        if(p==null){
            p=new nodes(key);
            return p;
        }
        if(p.data>key)
            p.lchild=BSTAVLcreation(p.lchild,key);
        if(key>p.data)
            p.rchild=BSTAVLcreation(p.rchild,key);
        updateheight(p);
        if(bf(p)==2 && bf(p.lchild)==-1){
            LRrotation(p);
        } else if (bf(p)==2 && bf(p.lchild)==1) {
            LLrotation(p);
        } else if (bf(p)==-2 && bf(p.rchild)==1) {
            RLrotation(p);
        } else if (bf(p)==-2 && bf(p.rchild)==-1) {
            RRrotation(p);
        }
        return p;
    }
    void LLrotation(nodes p){
        nodes pl=p.lchild;
        nodes plr=pl.rchild;
        pl.rchild=p;
        p.lchild=plr;
        updateheight(p);
        updateheight(pl);
    }
    void LRrotation(nodes p){

    }
    void RLrotation(nodes p){

    }
    void RRrotation(nodes p){

    }
    void updateheight(nodes p){
        nodes plh=p.lchild;
        nodes prh=p.rchild;
        if(plh==null) p.lh=1;
        else p.lh=plh.lh>plh.rh?plh.lh+1:plh.rh+1;
        if(prh==null) p.rh=1;
        else p.rh=prh.lh>prh.rh?prh.lh+1:prh.rh+1;
    }
    int bf(nodes p){
        return p.lh-p.rh;
    }
    void insert(int key){
        root=BSTAVLcreation(root,key);
    }
    void inorder(nodes p){
        if(p!=null){
           inorder(p.lchild);
           System.out.print(" "+p.data);
           inorder(p.rchild);
        }
    }
    void in(){
        inorder(root);
    }
}
public class CreationofAVL {
    public static void main(String[] args) {
    Binary b=new Binary();
        int[] a = {10,23,14,34,5,6};
        for(int k:a){
            b.insert(k);
        }
        b.in();

    }
}
