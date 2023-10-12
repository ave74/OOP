package Seminar05_HW.presenters;

import Seminar05_HW.models.Table;
import Seminar05_HW.models.Reservation;

import java.util.Collection;
import java.util.Date;
import java.util.ArrayList;

public class BookingPresenter implements ViewObserver {

    private Model model;
    private View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setObserver(this);
    }
    private Collection<Table> loadTables(){
        return model.loadTables();
    }
    public void updateUIShowTables(){
        view.showTables(loadTables());
    }
    private void updateUIShowReservationResult(int reservationId){
        view.showReservationTableResult(reservationId);
    }

    public void updateUIShowReservations() {
        Collection<Reservation> allReservations = new ArrayList<>();
        for (Table table : loadTables()) {
            allReservations.addAll(table.getReservations());
        }
        System.out.println("Количество бронирований: " + allReservations.size()); // Добавленная строка
        view.showReservations(allReservations);
    }
    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            updateUIShowReservationResult(reservationNo);
        }
        catch (RuntimeException e){
            updateUIShowReservationResult(-1);
        }
    }

    @Override
    public void onChangeReservationTable(int oldReservationId, Date newReservationDate, int newTableNo, String newName) {
        try {
            int reservationId = model.changeReservationTable(oldReservationId, newReservationDate, newTableNo, newName);
            view.showChangeReservationTableResult(reservationId);
        } catch (RuntimeException e) {
            view.showChangeReservationTableResult(-1);
        }
    }
}
