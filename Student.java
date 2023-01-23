package com.company;

public class Student extends Person {
    private double gpa;
    public double getPaymentAmount(){
        if(getGpa()>2.67){
            return 36660.0;
        }
        else{
            return 0.0;
        }
    }
    public Student(String name, String surname, double gpa) {
        super(name,surname);
        this.gpa = gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }
    @Override
    public String toString(){
        return "Student : " + super.toString();
    }


}
