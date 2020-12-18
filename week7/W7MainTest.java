import java.util.Calendar;
import java.util.Date;

public class W7MainTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        String str = "avcc";
        String[] ts = str.split("T");
        System.out.println(ts[0]);
    }

    public static int maxSubArray(int[] A) {
        int maxSoFar=A[0], maxEndingHere=A[0];
        for (int i=1;i<A.length;++i){
            maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
            maxSoFar=Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
