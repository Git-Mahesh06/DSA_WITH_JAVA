public class basicoperation {
    public static int ind(int[] a, int i){
        return a[i];
    }
    public static void updte(int[] a,int i,int k)
    {
        a[i]=k;
        for(int j=0;j<a.length;j++)
            System.out.print(a[j]+" ");

    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        System.out.println(ind(a,2));
        updte(a,3,10);
    }
}
