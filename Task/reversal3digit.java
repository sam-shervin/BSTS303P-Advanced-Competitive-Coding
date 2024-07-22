// write a program to reverse a n digit number
// input: 123
// output: 321
// input: 1234
// output: 4321

import java.util.Scanner;

public class reversal3digit{
    public static void main(String[] args) {
        //get input and store in expression
        System.out.println("Enter a n digit number: ");
        Scanner sc = new Scanner(System.in);
        int expression = sc.nextInt();
        sc.close();
        
        //reverse the number
        int reverse = 0;
        while (expression > 0) {
            reverse = (reverse*10)+(expression % 10);
            expression = expression / 10;
        }

        System.out.println("Reversed number: " + reverse);
    }
}
