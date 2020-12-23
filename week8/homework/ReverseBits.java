package homework;

public class ReverseBits {

//    public int reverseBits(int n){
//        int res = 0;
//        for (int i = 0; i <= 31; i++) {
//            res ^= (n & (1 << i)) != 0 ? 1 << (31 - i) : 0;
//        }
//        return res;
//    }

    public int reverseBits(int n) {
        if (n == 0) return 0;

        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            if ((n & 1) == 1) result++;
            n >>= 1;
        }
        return result;
    }

}
