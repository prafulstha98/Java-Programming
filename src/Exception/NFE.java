package Exception;

public class NFE {
    public static void main(String[] args) {
        String name = "Arbin";

        try{
            int a = Integer.parseInt(name);
            System.out.println(a);
        }
        catch(NullPointerException e){
            System.out.println("String " +name+ " cannot be converted to integer");
        }
        System.out.println("JDBC.Main method ended");
    }
}
