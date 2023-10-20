package Seminar07_HW;

public class Program {
    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, "Lead", 200000);
        Company yandex = new Company("Yandex", jobAgency, "Student", 3000);
        Company geekBrains = new Company("GeekBrains", jobAgency, "Master", 98000);

        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Master master2 = new Master("Мастер #2");
        Lead lead1 = new Lead("Ведущий специалист #1");
        Lead lead2 = new Lead("Ведущий специалист #2");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(lead1);
        jobAgency.registerObserver(lead2);

        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }

    }
}
