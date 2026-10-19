public class countoccur {
    public static void occurence(int[] a,int n){
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                c+=1;
            }
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        int[] a={1,2,3,5,6,3,3,2,2};
        occurence(a,2);
    }
}
