import java.util.*;

public class Amethods {
//    static int Multiply(int a, int b){
//        int c = a*b;
//        return c;
//
//    }


    static void printFactorial(int n){
       if(n<0){
           System.out.println("Invalid number");
           return;
       }
        int factorial = 1;
        for(int i=n;i>=1;i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        printFactorial(n);
    }
}

