public class sortingar {
public static void merge(int[] a,int[] b){
    int i=0,j=0,k=0;
    int[] c=new int[a.length+b.length];
    while(i<a.length && j<b.length){
        if(a[i]>b[j]){
            c[k++]=b[j++];
        }
        else{
            c[k++]=a[i++];
        }
    }
    for(;i<a.length;i++)
        c[k++]=a[i];
    for(;j<b.length;j++)
        c[k++]=b[j];
    for(int l:c)
        System.out.print(l+" ");
}

    public static void main(String[] args) {
        int[] a={2,4,6,8,9};
        int[] b={3,5,7,8,9,12};
        merge(a,b);
    }
}
