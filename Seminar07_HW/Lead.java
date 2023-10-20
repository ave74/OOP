package Seminar07_HW;

public class Lead implements Observer {

    private String name;
    //private String position = "Lead";
    private int salary = 150000;

    public Lead(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, String position, int salary) {
        if (position=="Lead") {
            if (this.salary <= salary){
                System.out.printf("Ведущий специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                        name, nameCompany, salary);
                this.salary = salary;
            }
            else {
                System.out.printf("Ведущий специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                        name, nameCompany, salary);

            }
        }

    }
}
