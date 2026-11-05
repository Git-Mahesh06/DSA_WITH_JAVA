class arraydequeue{
 int f,r,s;
 int dq[];
 arraydequeue(int s){
     f=r=-1;
     this.s=s;
     dq=new int[s];
 }
 boolean isfull(){
     return r==s-1 ;
 }
 boolean isempty(){
     return f==r;
 }
 void insertlast(int val){
     if(isfull()) throw new RuntimeException("is full");
     r=r+1;
     dq[r]=val;
     if(f==-1)
         f+=1;
 }
 void inserfront(int val){
     if(isfull()) throw new RuntimeException("Is full");
     dq[--f]=val;

 }
 int deletelast(){
     if(isempty()) throw new RuntimeException("IS empty");
     int e=dq[r--];
     return e;
 }
 int deletefront(){
     if(isempty()) throw new RuntimeException("Is empty");
     int e=dq[f++];
     return e;
 }
 void display(){
     for(int i=f;i<=r;i++)
         System.out.print(dq[i]+" ");
 }
}
public class ddequeue {
    public static void main(String[] args) {
        arraydequeue ar=new arraydequeue(5);
        ar.insertlast(10);
        ar.insertlast(20);
        ar.insertlast(30);
        ar.display();
        System.out.println();
        System.out.println(ar.deletelast());
        ar.display();
        ar.insertlast(40);
        ar.insertlast(50);
        System.out.println();
        ar.display();
        System.out.println(ar.deletefront());
        System.out.println();
        ar.display();
        ar.inserfront(100);
        System.out.println();
        ar.display();
    }
}
