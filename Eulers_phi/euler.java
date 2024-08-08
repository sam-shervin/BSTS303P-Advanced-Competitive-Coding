package Eulers_phi;

public class euler {
    public static void main(String[] args) {
        int n = 100;
        int phi[] = new int[n];
        for (int i = 0; i < n; i++) {
            phi[i] = i;
        }

        for (int i = 2; i < n; i++) {
            System.out.println(phi[i] + " " + i);
            if (phi[i] == i) {
                for (int j = i; j < n; j = j + i) {
                    phi[j] = phi[j] / i * (i - 1);
                }
            }
        }

        for (int i = 2; i < n; i++) {
            System.out.println("Euler's phi of " + i + " is " + phi[i]);
        }
    }
}

/*
 * Euler's phi function is an important function in number theory which gives the number of positive integers less than n that are coprime to n.
 * It is also known as Euler's totient function.
 * It is denoted by phi(n).
 * It is calculated using the formula phi(n) = n * (1 - 1/p1) * (1 - 1/p2) * ... * (1 - 1/pk) where p1, p2, ..., pk are the prime factors of n.
 * The time complexity of this code is O(n * log(log(n))) where n is the input number.
 * The space complexity of this code is O(n).
 * coprime numbers are numbers that have no common factors other than 1.
 * For example, the Euler's phi of 5 is 4 because there are 4 numbers less than 5 that are coprime to 5 which are 1, 2, 3, 4.
 */
