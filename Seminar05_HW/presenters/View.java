package Seminar05_HW.presenters;

import Seminar05_HW.models.Table;
import Seminar05_HW.models.Reservation;
import java.util.Collection;
import java.util.Date;

public interface View {
    void showTables(Collection<Table> tables);
    void showReservationTableResult(int reservationId);
    void reservationTable(Date orderDate, int tableNo, String name);
    void setObserver(ViewObserver observer);
    void changeReservationTable(int oldReservationId, Date newReservationDate, int newTableNo, String newName);
    void showChangeReservationTableResult(int reservationId);
    void showReservations(Collection<Reservation> reservations);

}
