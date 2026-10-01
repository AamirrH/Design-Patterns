package PrototypeDesignPattern;

public class Employee implements Person{


    private String employeeName = "";

    public Employee() {
        this.employeeName = employeeName;
    }


    @Override
    public Person getClone() {
        return new Employee();
    }

    @Override
    public void whoAmI() {
        System.out.println("Hello I am an Employee");

    }
}
