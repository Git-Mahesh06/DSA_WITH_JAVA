class queue1{
    int[] cq;
    int s,t,r;
    queue1(int size){
        s=size;
        t=0;
        r=0;
        cq=new int[size];
    }
    void enqueue(int val){
        if((t+1)%s==r){
            throw new RuntimeException("Queue is full");
        }
        t=(t+1)%s;
        cq[t]=val;
    }
    int dequeue(){
        if(r==t) System.out.println("Empty");
        r=(r+1)%s;
        int val=cq[r];
        return val;
    }
    void display(){
      if (!(t==r)){
          int i=r;
          do{
          i=(i+1)%s;
          System.out.print(cq[i]+" ");
      }while(i!=t);
      }
    }

}
public class circularqueue {
    public static void main(String[] args) {
        queue1 qq=new queue1(5);
        qq.enqueue(10);
        qq.enqueue(20);
        qq.enqueue(30);
        qq.enqueue(40);
     //   qq.enqueue(50);
       // qq.enqueue(30);
        System.out.println();
        qq.display();
//        System.out.println(qq.dequeue());
        qq.dequeue();
        qq.display();
        qq.enqueue(50);
        System.out.println();
        qq.display();
    }
}
