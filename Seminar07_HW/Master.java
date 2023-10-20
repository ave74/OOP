package Seminar07_HW;

public class Master implements Observer {

    private String name;
    private int salary = 80000;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, String position, int salary) {
        if (position=="Master") {
            if (this.salary <= salary) {
                System.out.printf("Мастер %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                        name, nameCompany, salary);
                this.salary = salary;
            } else {
                System.out.printf("Мастер %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                        name, nameCompany, salary);
            }
        }
    }
}
