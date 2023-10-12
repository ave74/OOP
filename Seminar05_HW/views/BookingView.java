package Seminar05_HW.views;

import Seminar05_HW.models.Reservation;
import Seminar05_HW.models.Table;
import Seminar05_HW.presenters.View;
import Seminar05_HW.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void changeReservationTable(int oldReservationId, Date newReservationDate, int newTableNo, String newName) {
        if (observer != null) observer.onChangeReservationTable(oldReservationId, newReservationDate, newTableNo, newName);
    }

    public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationId) {
        if (reservationId > 0){
            System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationId);
        }
        else {
            System.out.println("Не удалось забронировать столик. Попробуйте повторить операцию позже.");
        }
    }
    public void reservationTable(Date orderDate, int tableNo, String name){
        observer.onReservationTable(orderDate, tableNo, name);
    }

    /**
     * TODO: Реализовать в рамках домашней работы
     * Действие клиента (пользователь нажал на кнопку отмены бронирования)
     * Отменить резерв столика, забронировать на другое время
     * @param "oldReservation старый номер брони
     * @param "reservationDate дата бронирования
     * @param "tableNo номер столика
     * @param "name имя
     */
    @Override
    public void showChangeReservationTableResult(int reservationNo) {
        if (reservationNo > 0){
            System.out.printf("Бронь успешно изменена. Новый номер брони: #%d\n", reservationNo);
        }
        else {
            System.out.println("Не удалось забронировать столик. Попробуйте повторить операцию позже.");
        }
    }

    public void showReservations(Collection<Reservation> reservations) {
        System.out.println("Список всех бронирований:");
        for (Reservation reservation : reservations) System.out.printf("Бронь #%d на имя %s для столика #%d на дату %s\n", reservation.getId(), reservation.getName(), reservation.getTable().getNo(), reservation.getDate());
    }

}
