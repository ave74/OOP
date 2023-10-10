/*
    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами;
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    g. Не забываем про метод добавления фрукта в коробку.
        * */
package Seminar04_HW;

import java.util.Random;
import java.util.ArrayList;

public class Program {

    private static final Random random = new Random();

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        Box<Apple> appleBox1 = new Box<>(new ArrayList<>());
        Box<Apple> appleBox2 = new Box<>(new ArrayList<>());
        Box<Apple> appleBox3 = new Box<>(new ArrayList<>());
        Apple apple = new Apple();

        int appleNumber1 = random.nextInt(50);
        int appleNumber2 = random.nextInt(50);
        int appleNumber3 = random.nextInt(50);

        for (int i=0; i<=appleNumber1; i++){
            appleBox1.addFruit(apple);
        }

        for (int i=0; i<=appleNumber2; i++){
            appleBox2.addFruit(apple);
        }

        for (int i=0; i<=appleNumber3; i++){
            appleBox3.addFruit(apple);
        }

        Box<Orange> orangeBox = new Box<>(new ArrayList<>());
        Orange orange = new Orange();

        int orangeNumber = random.nextInt(40);

        for (int i=0; i<=orangeNumber; i++){
            orangeBox.addFruit(orange);
        }

        System.out.printf("В ящике откуда пересыпали яблоки было %d фруктов\n", appleBox2.getQuantity());
        System.out.printf("В ящике куда пересыпали яблоки было %d фруктов\n", appleBox1.getQuantity());

        appleBox1.takeFromBox(appleBox2);

        System.out.printf("В ящике откуда пересыпали яблоки осталось %d фруктов\n", appleBox2.getQuantity());
        System.out.printf("В ящике куда пересыпали яблоки стало %d фруктов\n", appleBox1.getQuantity());

        System.out.printf("В ящике с яблоками №3 %d яблок весом %.1f условных единиц\n", appleBox3.getQuantity(), appleBox3.getWeight());

        System.out.printf("В ящике с апельсинами %d апельсинов весом %.1f условных единиц\n", orangeBox.getQuantity(), orangeBox.getWeight());

        if (appleBox1.compare(orangeBox)){
            System.out.println("Вес ящика яблок №1 равен весу ящика с апельсинами");
        }else{
            System.out.println("Вес ящика яблок №1 неравен весу ящика с апельсинами");
        }

        System.out.println("Во втором ящике яблок яблок нет - нельзя сравнивать пустой ящик с другими");

        if (appleBox1.compare(appleBox3)){
            System.out.println("Вес ящика яблок №1 равен весу ящика с яблоками №3");
        }else{
            System.out.println("Вес ящика яблок №1 неравен весу ящика с яблоками №3");
        }

        if (orangeBox.compare(orangeBox)){
            System.out.println("Вес ящика ящика с апельсинами всегда равен сам себе");
        }else{
            System.out.println("Вес ящика ящика с апельсинами всегда равен сам себе");
        }
        //Добавим апельсины в коробку с яблоками
        //appleBox2.takeFromBox(orangeBox); - компилятор не даёт возможности выполнить действие
    }
}