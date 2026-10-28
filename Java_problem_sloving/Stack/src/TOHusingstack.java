class tower{
    int n,A,B,C;
    tower(int i,int j,int k,int l){
        n=i;
        A=j;
        B=k;
        C=l;
    }
}
class Stackks<T> {
    private final T[] array;
    private int top;

    @SuppressWarnings("unchecked")
    public Stackks(int size) {
        array = (T[]) new Object[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == array.length - 1;
    }

    public void push(T element) {
        if (isFull()) {
            throw new RuntimeException("Stack Overflow");
        }
        array[++top] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }

        T element = array[top];
        array[top] = null;
        top--;
        return element;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return array[top];
    }

    // index = 0 means top element
    public T peek(int index) {
        if (index < 0 || index > top) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return array[top - index];
    }

    public T stackTop() {
        return peek();
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
public class TOHusingstack {

    public static void main(String[] args) {
        Stackkk<tower> st=new Stackkk<tower>(5);
        int n=3,i=1,j=2,k=3;
        while(n>0 || !st.isempty()){
            if(n>0){
                st.push(new tower(n,i,j,k));
                n--;
                int t=j;
                j=k;
                k=t;
            }
            else{
                tower to=st.pop();
                System.out.println("Move disk from "+to.A+" to "+to.C);
                n=to.n-1;
                i=to.B;j= to.A;k= to.C;
//                this ia mahes
            }
        }
    }
}
