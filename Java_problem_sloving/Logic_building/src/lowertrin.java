public class lowertrin {

    public static class lowert{
        int[] a;
        int s;
        public lowert(int n){
            a=new int[(n*(n+1))/2];
            s=n;
        }
        public void set(int i,int j,int val){
            if(i>s ||j>s){
                throw new ArrayIndexOutOfBoundsException();
            }
            if(i>=j){
                a[(i*(i-1))/2+(j-1)]=val;
            }
        }
        public int get(int i,int j){
            if(i>s || j>s){
                throw new ArrayIndexOutOfBoundsException();
            }
            return (i>=j)?a[(i*(i-1))/2+(j-1)]:0;
        }
        public void display(){
            for(int i=1;i<=s;i++){
                for(int j=1;j<=s;j++){
                    System.out.print(get(i,j)+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        lowert l=new lowert(4);
        l.set(1,1,10);
        l.set(2,1,20);l.set(2,2,30);
        l.set(3,1,40);l.set(3,2,40);l.set(3,3,50);
        l.set(4,1,60);l.set(4,2,70);l.set(4,3,80);l.set(4,4,90);

        l.display();
    }
}
