// 22 July 2024

package switch_case;
import java.util.Scanner;

public class switch_case{
    public static void main(String[] args) {

        //get input and store in expression
        System.out.println("Enter an expression: ");
        Scanner sc = new Scanner(System.in);
        int expression = sc.nextInt();
        sc.close();
        
        //switch case

        switch (expression) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
        }
    }
}