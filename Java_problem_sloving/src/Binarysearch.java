public class Binarysearch {

    public static int binary(int[] a,int l,int h,int k){

        while(h>=l){
            int m=(l+(h-l)/2);
            if(a[m]==k) return m;
            else if (a[m]<k)
                return binary(a,m+1,h,k);
            else
                return binary(a,l,m-1,k);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a={2,4,6,7,8,10};
        System.out.println(binary(a,0,a.length-1,7));
    }
}
