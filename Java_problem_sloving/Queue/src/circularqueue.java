class queue1{
    int[] cq;
    int s,t,r;
    queue1(int size){
        s=size;
        t=-1;
        r=-1;
        cq=new int[size];
    }
    void enqueue(int val){
        cq[(t+1)%cq.length]=val;
        t++;
        if(r==-1)
            r=1;
        if(t==r){
            throw new RuntimeException("Queue is full");
        }
    }
    int dequeue(){
        if(r==-1) System.out.println("Empty");
        int val=(r)%cq.length;
        r++;
        return val;
    }
    void display(){
        for(int i=r;i<=t;i++)
            System.out.println(cq[i]+" ");
    }

}
public class circularqueue {
    public static void main(String[] args) {
        queue1 qq=new queue1(3);
        qq.enqueue(10);
        qq.enqueue(20);
       // qq.enqueue(30);
        System.out.println();
        qq.dequeue();
    }
}
