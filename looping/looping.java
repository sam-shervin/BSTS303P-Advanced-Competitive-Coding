package looping;

public class looping {
    public static void main(String[] args) {
        //for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop: " + i);
        }

        //while loop
        int j = 0;
        while (j < 5) {
            System.out.println("While loop: " + j);
            j++;
        }

        //do-while loop
        int k = 0;
        do {
            System.out.println("Do-while loop: " + k);
            k++;
        } while (k < 5);
    }
}
