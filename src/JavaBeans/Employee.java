package JavaBeans;

public class Employee {
    int id;
    int salary;
    String name;

    void registerEmployee(int id1,int salary1, String name1){
        this.id = id1;
        this.salary = salary1;
        this.name = name1;


    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.registerEmployee(1,25000,"Arbin Maharjan");
    }
}
