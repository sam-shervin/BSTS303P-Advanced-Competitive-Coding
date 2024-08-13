package Chinese_Remainder_Theorem;

public class Crt {
    // CRT is used to find the smallest number that is divisible by given numbers
    // The time complexity of this code is O(n) where n is the number of elements in the array.
    // The space complexity of this code is O(n).
    public static void main(String[] args) {
        int num[] = { 3, 4, 5 };
        int rem[] = { 2, 3, 1 };
        int n = num.length;
        int prod = 1;
        for (int i = 0; i < n; i++) {
            prod *= num[i];
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            int pp = prod / num[i];
            result += rem[i] * mulInv(pp, num[i]) * pp;
        }
        System.out.println(result % prod);
    }
    
    public static int mulInv(int a, int b) {
        int b0 = b;
        int x0 = 0;
        int x1 = 1;
        if (b == 1) {
            return 1;
        }
        while (a > 1) {
            int q = a / b;
            int amb = a % b;
            a = b;
            b = amb;
            int xqx = x1 - q * x0;
            x1 = x0;
            x0 = xqx;
        }
        if (x1 < 0) {
            x1 += b0;
        }
        return x1;
    }

    /*
     * The Chinese Remainder Theorem (CRT) is a theorem that gives a unique solution to simultaneous linear congruences with coprime moduli.
     * It states that if n1, n2, ..., nk are pairwise coprime integers, then for any integers a1, a2, ..., ak, there exists an integer x such that x is congruent to ai modulo ni for all i.
     * The time complexity of this code is O(n) where n is the number of elements in the array.
     * The space complexity of this code is O(n).
     * For example, if we have the following system of congruences:
     * x ≡ 2 (mod 3)
     * x ≡ 3 (mod 4)
     * x ≡ 1 (mod 5)
     * The solution to this system of congruences is x ≡ 11 (mod 60).
     */


}
