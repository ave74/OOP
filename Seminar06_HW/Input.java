package Seminar06_HW;

import java.util.Scanner;


public class Input {

    private Scanner scanner = new Scanner(System.in);

    public void inputFromConsole(Order order){
        order.setClientName(prompt("Имя клиента: "));
        order.setProduct(prompt("Продукт: "));
        order.setQnt(Integer.parseInt(prompt("Кол-во: ")));
        order.setPrice(Double.parseDouble(prompt("Цена: ")));
    }

    private String prompt(String message){
        System.out.print(message);
        return scanner.nextLine();
    }
}
