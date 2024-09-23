package Equilibrium_Sum;

public class equilibrium {
    
    public static void main(String[] args){
        int totalSum = 0; 
        int leftSum = 0;
        int arr[] = {2, -6, 4, 5, 6, -6};

        for (int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }

        for (int i = 0; i < arr.length; i++){
            totalSum -= arr[i];
            if (leftSum == totalSum){
                System.out.println("Equilibrium index is " + i);
                break;
            }
            leftSum += arr[i];
        }

    }
}
    
