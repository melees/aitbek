package com.company;

public class Employee extends Person{
    private String position;
    private double salary;

    Employee(){
        super();
    }
    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
    public double getPaymentAmount(){
        return getSalary();
    }

    @Override
    public String toString(){
        return "Employee : " + super.toString();
    }


}
