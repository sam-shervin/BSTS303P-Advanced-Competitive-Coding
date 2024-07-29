
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

        for (int i = 2; i * i < n; i++) {
            if (arr[i] == true) {
                for (int j = i * i; j <= n; j = j + i) {
                    arr[j] = false;
                }
            }
        }

        for(int i = 0; i < start; i++) {
            arr[i] = false;
        }
        
        for (int i = 2; i < n; i++) {
            if (arr[i] == true) {
                System.out.println(i);
            }
        }
    }

}