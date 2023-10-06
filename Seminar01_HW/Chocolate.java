package Seminar01_HW;

public class Chocolate extends Product {

    private  int weight; // вес

    public int getVolume() {
        return weight;
    }

    public void setVolume(int volume) {
        this.weight = volume;
    }

    public Chocolate (String brand, String name, double price, int weight, int fat) {
        super(brand, name, price);
        this.weight = weight;
    }

    @Override
    public String displayInfo() {
        return String.format("[ШОКОЛАД] %s - %s - %.2f - вес: %d",
                brand, name, price, weight);
    }

}
