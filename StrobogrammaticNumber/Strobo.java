/*
 * Stobogrammatic Number is a number whose numeral is
 * rotationally symmetric so that it appears the same when 
 * rotated 180 degrees
 */
package StrobogrammaticNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Strobo {
    static boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('6', '9');
        map.put('9', '6');
        map.put('1', '1');
        map.put('8', '8');
        map.put('0', '0');
        

        int l = 0, r = num.length() - 1;
        while (l <= r) {
            if (!map.containsKey(num.charAt(l)))
                return false;
            if (map.get(num.charAt(l)) != num.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(isStrobogrammatic(sc.nextLine()));
        }
}