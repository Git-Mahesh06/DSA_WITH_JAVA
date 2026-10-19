import javax.sound.midi.Soundbank;

public class fasterpower{
    public static int power(int a,int b){
        if(b==0) return 1;
        int r=power(a,b/a);
        return b%2==0?r*r:r*r*2;
    }

    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
}
