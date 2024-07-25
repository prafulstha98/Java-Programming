package Arrays;
import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns");
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        //input
        //rows
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<columns;j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(numbers[i][j] == x){
                    System.out.println("x found at locations (" + i + "," + j + ")");
                }
            }
            System.out.println();
        }


    }

}
