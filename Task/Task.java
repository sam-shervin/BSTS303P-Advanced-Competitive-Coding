// Given an array, where each element denotes the price of the given stock
// on the ith day. Return the maximum profit that u can achieve by buying
// a stock and selling it on another day.

// Array = [7, 1, 3, 5, 6, 4]

public class Task {
    public static void main(String[] args) {
        int[] stocks = { 7, 1, 3, 5, 6, 4 };
        int start = 9999;
        int end = 0;
        for (int stock : stocks) {
            if (stock < start) {
                start = stock;
            }
            if ((stock > start) && (end<stock)){
                end = stock;
            }
        }
        System.out.println("Maximum Profit: ");
        System.out.println((end-start));
    }
}
