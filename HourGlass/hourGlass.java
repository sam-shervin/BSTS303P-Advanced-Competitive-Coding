package HourGlass;

public class hourGlass {
    static int findMaxSum(int[][] arr, int R, int C) {
        if (R < 3 || C < 3) {
            System.err.println("Invalid input");
            System.exit(0);
        }

        int maxSum = 0;
        int sum;

        for (int i = 0; i < R - 2; i++) {
            for (int j = 0; j < C - 2; j++) {
                sum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2]) + (arr[i + 1][j + 1])
                        + (arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);

                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

}

class Main {
    public static void main(String[] args) {
        int[][] arr = { 
                { 1, 1, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 0, 0 },
                { 1, 1, 1, 0, 0, 0 },
                { 0, 0, 2, 4, 4, 0 },
                { 0, 0, 0, 2, 0, 0 },
                { 0, 0, 1, 2, 4, 0 }
            };

        int R = 6;
        int C = 6;

        System.out.println(hourGlass.findMaxSum(arr, R, C));
    }
    
}
