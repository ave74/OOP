package Seminar07_HW;

import java.util.Random;

public enum VacancyType {
    Student,
    Master,
    Lead;

    public static VacancyType getRandomVacancyType() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
