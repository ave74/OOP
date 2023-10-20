package Seminar07_HW;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;
    private String position;

    private int maxSalary;

    private Publisher jobAgency;


    public Company(String name, Publisher jobAgency, String position, int maxSalary) {
        this.name = name;
        this.position = position;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, position, salary);
    }

}
