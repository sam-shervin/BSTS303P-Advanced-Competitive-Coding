package Sieve_Algorithm;

public class segmentedPractice {
    static void simpleSieve(int l, int h) {
        boolean[] arr = new boolean[h + 1];
        
        for (int i = 2; i * i <= h; i++) {
            int sm = (l / i) * i;
            if (sm < l) {
                sm += i;
            }

            for (int j = sm; j <= h; j += i) {
                arr[j] = true;
            }
        }

        for (int i = l; i <= h; i++) {
            if (arr[i] == false) {
                System.out.println(i);
            }
        }
        
    }
    public static void main(String[] args) {
        simpleSieve(50, 200);
    }
}
