package Exception;

public class Handling {
    public static void main(String[] args) {
        try{
           int a=10,b=1,c;
           c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }

        try{
            int y[] = {10,20,30,40};
            System.out.println(y[3]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array exceeds the limit");
        }

    }
}
