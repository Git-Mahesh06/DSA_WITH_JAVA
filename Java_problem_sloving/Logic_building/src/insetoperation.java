public class insetoperation {

    public static void insertend(int[] a,int k){
        int[] b=new int[a.length+1];
        for(int i=0;i<a.length;i++)
            b[i]=a[i];
        int l=b.length-1;
        b[l]=k;

        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");
    }
    public static void insertfront(int[] a,int k){
        int[] b=new int[a.length+1];
        for(int i=0;i<a.length;i++)
            b[i+1]=a[i];
        b[0]=k;
        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");
    }

    public static void insetati(int[] a,int index,int key){
        int[] b=new int[a.length+1];
        for(int k=0;k<index;k++)
            b[k]=a[k];
        b[index]=key;
        for(int j=index;j<a.length;j++)
            b[j+1]=a[j];
        System.out.println();
        for(int j=0;j<b.length;j++)
            System.out.print(b[j]+" ");
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        insertend(a,10);
        insertfront(a,121);
        insetati(a,3,10);
    }
}
