// 22 July 2024

import java.util.Scanner;

public class strongnumber {

    
    public static void main(String[] args) {
        //get input and store in expression
        System.out.println("Enter a n digit number: ");
        Scanner sc = new Scanner(System.in);
        int expression = sc.nextInt();
        sc.close();
        int copy = expression;
        // find the strong number
        int reverse = 0;
        int strong_num = 0;
        int temp = 1;
        while (expression > 0) {
            reverse = expression % 10;
            for (int i = reverse; i > 0; i--) {
                temp *= i;
            }
            strong_num += temp;
            temp = 1;
            expression = expression / 10;
        }


        System.out.println("It is a strong number" != null ? (strong_num == copy) : (""));
    }
}
