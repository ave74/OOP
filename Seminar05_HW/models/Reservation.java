package Seminar05_HW.models;

import java.util.Date;

public class Reservation {

    private static int counter = 1000;

    private final int id;
    private final Table table;
    private Date date;
    private String name;

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public Table getTable() {
        return table;
    }

    {
        id = ++counter;
    }

    public Reservation(Table table, Date date, String name) {
        this.table = table;
        this.date = date;
        this.name = name;
    }
}
