
public class BinaryModularExpo {
    private long b;
    private long n;
    private long m;
 

    public BinaryModularExpo(long b, long n, long m) {
        this.b = b;
        this.n = n;
        this.m = m;
    }

    public long binModExpo() {
        long result = 1;
        b %= m;
        while (n >= 1) {
            if ((n & 1) == 1) {
                result = (result * b) % m;
            }
            b = (b * b) % m;
            n >>= 1;
        }
        return result;
    }

}
