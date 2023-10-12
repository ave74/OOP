package Seminar05_HW;

import Seminar05_HW.models.TableModel;
import Seminar05_HW.presenters.BookingPresenter;
import Seminar05_HW.presenters.Model;
import Seminar05_HW.presenters.View;
import Seminar05_HW.views.BookingView;

import java.util.Date;
import java.util.Scanner;

public class Main {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     *  метод changeReservationTable должен заработать!
     * @param args
     */
    public static void main(String[] args) {

        Model tableModel = new TableModel();
        View bookingView = new BookingView();
        BookingPresenter presenter = new BookingPresenter(tableModel, bookingView);
        presenter.updateUIShowTables();

        bookingView.reservationTable(new Date(), 1, "Станислав");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bookingView.reservationTable(new Date(), 2, "Мария");
                    break;
                case 2:
                    bookingView.reservationTable(new Date(), 3, "Игорь");
                    break;
                case 3:
                    bookingView.changeReservationTable(1001, new Date(), 4, "Наталья");
                    break;
                case 4:
                    presenter.updateUIShowReservations();
                    break;
                case 5:
                    System.out.println("Выход из программы");
                    return;
                default:
                    System.out.println("Неверный выбор, пожалуйста, попробуйте снова");
            }
        }
    }
    private static void displayMenu() {
        System.out.println("");
        System.out.println("1. Забронировать столик на имя Мария");
        System.out.println("2. Забронировать столик на имя Игорь");
        System.out.println("3. Изменить бронирование столика из брони #1001 на имя Наталья");
        System.out.println("4. Показать все бронирования");
        System.out.println("5. Выход");
        System.out.print("Введите ваш выбор: ");
        System.out.println("");
    }
}
