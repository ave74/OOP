package Seminar02_HW;

class Plate {

    private int food;
    public Plate(int food) {
        this.food = food;
    }
    
    void info() {
        System.out.println("plate: " + food);
    }

    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;

        food -= n;
        return true;
    }
    
    void addFood(int food) {
        this.food += food;
    }
}
class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    void eat(Plate plate) {
        if (hungry && plate.decreaseFood(appetite))
            hungry = false;
    }

    void info() {
        String isHungry = !hungry ? "сыт" : "голоден";
        System.out.println(name + ": " + isHungry);
    }
}
public class Main {
    public static
    void main(String[] args) {
        Cat[] cats = {
            new Cat("Васька", 50), 
            new Cat("Рыжий", 50), 
            new Cat("Бегемот", 25), 
            new Cat("Серый", 5), 
            new Cat("Барсик", 1)};
        
        Plate plate = new Plate( 100);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}
