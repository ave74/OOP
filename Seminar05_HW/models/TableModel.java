package Seminar05_HW.models;

import Seminar05_HW.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    @Override
    public Collection<Table> loadTables() {

        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table: loadTables()) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(table, reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw  new RuntimeException("Некорректный номер столика.");
    }

    /**
     * TODO: Доработать в рамках домашней работы
     * Отменить бронирование по номеру
     * @param "oldReservation
     * @param "reservationDate
     * @param "tableNo
     * @param "name
     * @return
     */
    public int changeReservationTable(int oldReservationId, Date newReservationDate, int newTableNo, String newName) {
        for (Table table : loadTables()) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == oldReservationId) {
                    table.removeReservation(reservation);
                    Reservation newReservation = new Reservation(table, newReservationDate, newName);
                    table.addReservation(newReservation);
                    return newReservation.getId();
                }
            }
        }
        throw new RuntimeException("Бронь с указанным номером не найдена.");
    }

}
