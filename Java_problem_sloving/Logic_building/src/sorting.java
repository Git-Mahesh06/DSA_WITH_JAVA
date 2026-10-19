public class sorting {

    public static void asces(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }

        }
        for (int k=0;k<a.length;k++)
            System.out.print(a[k]+" ");
    }
    public static void deces(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]<a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }

        }
        System.out.println();
        for (int k=0;k<a.length;k++)
            System.out.print(a[k]+" ");
    }
    public static void com(int[] a,int index){
        for(int i=0;i<index;i++){
            for(int j=0;j<index-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println();
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }

    public static void main(String[] args) {
        int[] a={3,5,2,3,7,1,9,6};
        asces(a);
        deces(a);
        com(a,4);
    }
}
