package Arrays;
import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        //find maximum and minimum number in an array of integers
        //Integer.MIN_VALUE Integer.MAX_VALUE
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        System.out.println("Enter the numbers: ");
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        //output
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Largest number is: " + max);
        System.out.println("Smallest numbers is: " + min);

    }
}
