package SwapNibbles;

import java.util.*;

public class swapNibbles {

    static int swapNibbles(int x) {
        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(swapNibbles(sc.nextInt()));
    }
}
