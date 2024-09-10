
package Sieve_Algorithm;
public class SegmentedSieveAlgorithm {
    public static void main(String[] args) {
        int start = 20;
        int end = 2100;

        // My code: 
        boolean arr[] = new boolean[end + 1];
        

        for (int i = 2; i * i < end; i++) {
            int sm = (start / i) * i;
            if (sm < start) {
                sm = sm + i;
            }
            for (int j = sm; j <= end; j = j + i) {
                arr[j] = true;
            }
            
        }
        
        for (int i = start; i < end; i++) {
            if (arr[i] == false) {
                System.out.println(i);
            }
        }
    }

}