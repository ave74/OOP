package Seminar06_HW;


public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

        Order order = new Order();
        Input input = new Input();
        Save save = new Save();
        input.inputFromConsole(order);
        save.saveToJson(order);
        System.out.println("Информация по заказу успешно сохранена в файл.");

    }
}