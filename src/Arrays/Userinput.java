package Arrays;

import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
        //Take an array of names as input from the user and print them on the screen.
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] names = new int[size];

        for(int i=0;i<size;i++){
            names[i]= s.nextInt();
        }

        int x = s.nextInt();

        for(int i=0;i<size;i++){
            if(names[i] == x){
                System.out.println("x found at index: " + i);
            }
        }


    }
}

