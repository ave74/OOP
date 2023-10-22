package Seminar07_HW;

import java.util.Random;

public class Vacancy {
    Random random = new Random();
    private Publisher jobAgency;

    public Vacancy(Publisher jobAgency) {
        this.jobAgency = jobAgency;
    }

    public void vacancy(String name, int maxSalary){
        int salary = random.nextInt(maxSalary);
        String position  = String.valueOf(VacancyType.getRandomVacancyType());
        jobAgency.sendVacancy(name, position, salary);
    }
}
