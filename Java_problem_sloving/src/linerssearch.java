public class linerssearch {

    public static int linear(int[] a,int k){
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a={1,3,6,1,5,8,9};
        System.out.println("index of element is "+linear(a,10));
    }
}
