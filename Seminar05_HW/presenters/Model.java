package Seminar05_HW.presenters;

import Seminar05_HW.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);
    int changeReservationTable(int oldReservationId, Date newReservationDate, int newTableNo, String newName);

}
