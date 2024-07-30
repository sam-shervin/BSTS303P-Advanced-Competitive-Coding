
package Sieve_Algorithm;
public class SegmentedSieveAlgorithm {
    public static void main(String[] args) {
        int start = 20;
        int end = 200;

        // My code: 
        int n = end;
        boolean arr[] = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = true;
        }

        for (int i = 2; i * i < end; i++) {
            int sm = (start / i) * i;
            if (sm < start) {
                sm = sm + i;
            }
            for (int j = sm; j <= n; j = j + i) {
                arr[j] = false;
            }
            
        }
        
        for (int i = start; i < end; i++) {
            if (arr[i] == true) {
                System.out.println(i);
            }
        }
    }

}