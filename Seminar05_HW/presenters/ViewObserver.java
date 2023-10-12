package Seminar05_HW.presenters;

import java.util.Date;

public interface ViewObserver {
    void onReservationTable(Date orderDate, int tableNo, String name);
    void onChangeReservationTable(int oldReservationId, Date newReservationDate, int newTableNo, String newName);
}
