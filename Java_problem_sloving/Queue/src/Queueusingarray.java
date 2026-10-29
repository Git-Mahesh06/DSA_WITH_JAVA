class queue{
    int[] q;
    int f,r,si;
    queue(int size){
        si=size;
        q=new int[size];
        f=-1;
        r=-1;
    }
    void enqueue(int val){
        if(r==si-1) throw new RuntimeException("Queue is full you cant insert");
        q[++r]=val;
        if(f==-1)
            f+=1;
    }
    int dequeue(){
        if(r==-1) throw new RuntimeException("Queue is empty");
        int e=q[f++];
        return e;
    }
    void display(){
        for(int i=f;i<=r;i++)
            System.out.print(" "+q[i]);
    }
    int first(){
        return q[f];
    }
    int last(){
        return q[r];
    }
    boolean isempty(){
        return r==-1;
    }
    boolean isfull(){
        return r==si-1;
    }
}
public class Queueusingarray {
    public static void main(String[] args) {
        queue st=new queue(5);
        st.enqueue(10);
        st.enqueue(20);
        st.enqueue(30);
        st.enqueue(40);
        st.enqueue(50);
        st.display();
      //  st.enqueue(60);
        st.dequeue();
        System.out.println();
        st.dequeue();
        st.display();
        System.out.println(st.first());
        System.out.println(st.last());
        System.out.println(st.isempty());
        System.out.println(st.isfull());
    }
}
