public class sort {

    public static void sorting(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] a={4,7,2,1,6,9,4,22,1,56,24,5,898};
        sorting(a);
        for (int i = 0; i < a.length;i++)
            System.out.println(a[i]+" ");
    }
}
