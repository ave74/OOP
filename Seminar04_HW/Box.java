package Seminar04_HW;

import java.util.ArrayList;

public class Box<T extends Fruit>{
    private ArrayList<T> box;

    public Box () {
        this.box = new ArrayList<>();
    }
    public Box(ArrayList<T> box) {
        this.box = box;
    }
    public void takeFromBox(Box<T> fromBox) {
        this.box.addAll(fromBox.box);
        fromBox.box.clear();
    }
    public void addFruit(T e) {
        this.box.add(e);
    }

    public float getWeight() {
        return box.size() * box.get(0).getWeight();
    }

    public int getQuantity() {
        return box.size();
    }

    public boolean compare(Box anotherBox) {
        if(getWeight() == anotherBox.getWeight()) return true;
        return false;
    }
}