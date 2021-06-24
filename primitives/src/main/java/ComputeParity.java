public class ComputeParity {

    /*
    5.1
    */

    public static short parity(long n) {
        short result = 0;
        while (n > 0) {
            result ^= 1;
            n &= (n - 1);
        }
        return result;
    }
}
