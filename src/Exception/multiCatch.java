package Exception;

public class multiCatch {
    public static void main(String[] args) {
        try{
            String name = "Arbin";
            System.out.println(name.toLowerCase());

            int arr[] = {10,20,30,40};
            System.out.println(arr[4]);

            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Exception");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(NumberFormatException e){
            System.out.println("Number Exception");
        }
        catch(Exception e) {
            System.out.println("All exception handled");
        }
    }
}
