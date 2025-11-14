
public class BinaryModularExpo {
    private long base;
    private long exponentVal;
    private long modVal;

    public BinaryModularExpo(long b, long n, long m) {
        base = b;
        exponentVal = n;
        modVal = m;
    }

    /*
     * Performs (b^n) mod m, where b, n, and m are large integers,
     * this is done in O(log(n)) time, or more precisely O((log m)^2 * log n) for
     * very large integers.
     */

    public long binModExpo() {
        long result = 1; // Intializied to 1 because (base)^0 = 1, and 1 % any positive integer = 1.

        /*
         * This is the first step, we know (a * b) % m is congruent to ((a % m) * (b %
         * m)) % m,
         * because of this property, (base ^ exponentVal) % modVal is congruent to
         * ((base % modVal) ^ exponent) % modVal.
         */

        long basePower = base % modVal;

        /*
         * Instead of implementing a function to convert the exponent from decimal to
         * binary, we can use bitwise operations to determine the value of each bit,
         * we know int 1 in binary is 0000 0001, so if we use the bitwise AND with the
         * exponent, we can get the value of the LSB, then shift right once to move a
         * new bit to LSB, then repeat until all 1s are shifted out.
         */
        while (exponentVal >= 1) {
            // For example: exponentVal = 5 (101), 101 & 001 = 001 = integer 1, shift right,
             // 010 & 001 = 000, shift right, 001 & 001 = 001, shift right, 000 no 1s left in exponent
            if ((exponentVal & 1) == 1) {  
                result = (result * basePower) % modVal;
            }
            basePower = (basePower * basePower) % modVal;
            exponentVal >>= 1;
        }
        return result;
    }

}
