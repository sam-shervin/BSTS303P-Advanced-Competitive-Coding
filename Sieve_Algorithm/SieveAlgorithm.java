/*
 * Sieve of Eratosthenes is an algorithm to find all prime numbers up to a given limit.
 * It does so by iteratively marking the multiples of each prime number starting from 2.
 * 
 */



package Sieve_Algorithm;
public class SieveAlgorithm {
    
    public static void main(String[] args) {
        // My code: 
        int n = 100;
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
        
        for (int i = 2; i < n; i++) {
            if (arr[i] == true) {
                System.out.println(i);
            }
        }
    }

}