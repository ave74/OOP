package Seminar03_HW;

public abstract class Employee implements Comparable <Employee> {
    protected String name;
    protected String surName;

    //protected String position;
    protected double salary;
    public int age;
    public abstract double calculateSalary();

    public Employee(String surName, String name, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age=age;
    }

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName .compareTo(o.surName);
        if (surNameRes==0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }

}
