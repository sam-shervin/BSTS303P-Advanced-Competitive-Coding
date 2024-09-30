package BoothAlgorithm

import java.util.Scanner;

public class booth{
    public int multiply(int n1, int n2){
        int m1 = n1;
        int r = n2;
        int A = n1;
        int S = -n1;
        int count = Integer.SIZE;
        System.out.println(count);
        while(count>0){
            if((r&1)==1){
                P+=A;
                S+=m;
            }
            A <<= 1;
            S <<= 1;
            count--;
            r >>= 1;
        }
        return P;
    }
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int n1 = sc.nextInt();
    System.out.println("Enter the second number: ");
    int n2 = sc.nextInt();
    booth b = new booth();
    System.out.println("The product of the two numbers is: "+b.multiply(n1,n2));
}