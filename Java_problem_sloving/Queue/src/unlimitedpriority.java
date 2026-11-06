public class unlimitedpriority {

    static void unlimitedqueue(int[] a){
        int[] b=new int[a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] a={6,9,12,4,3,7,10,8};
        unlimitedqueue(a);
    }
}
