import java.util.Scanner;

public class strobo {
    static boolean isStrobo(char c, char d) {
        if (c == '6' && d == '9')
            return true;
        if (c == '9' && d == '6')
            return true;
        if (c == '1' && d == '1')
            return true;
        if (c == '8' && d == '8')
            return true;
        if (c == '0' && d == '0')   
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int l = 0;
        int r = num.length() - 1;
        while (l <= r) {
            if (!isStrobo(num.charAt(l), num.charAt(r))) {
                System.out.println("False");
                return;
            }
            l++;
            r--;
        }
        System.out.println("True");
    }
}

/* Strobogrammatic number is a number which when rotated by 180 degrees gives the same number */