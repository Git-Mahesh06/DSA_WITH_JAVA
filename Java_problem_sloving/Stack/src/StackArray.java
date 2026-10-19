class stacka{
    int s;
    int top;
    int[] a;
    stacka(int s){
        this.s=s;
        top=-1;
        a=new int[s];
    }
    void push(int val) {
    if(top==s-1) throw new RuntimeException("Stack is overflowed");
    a[++top]=val;
    }
    int pop(){
        if(top==-1) throw new RuntimeException("Stack is underflowed");
        int x=a[top--];
        return x;
    }
    void display(){
        for(int i=top;i>=0;i--)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    int peek(int index){
        if(top-index+1>0){
            return a[top-index+1];
        }
        return 0;
    }
    }
public class StackArray {
    public static void main(String[] args) {
        stacka ss=new stacka(5);
        ss.push(10);
        ss.push(20);
        ss.push(30);
        ss.display();
      //  ss.pop();
                ss.display();
        System.out.println(ss.peek(1));
    }
}