package Seminar03_HW;

public class Position {

    public String position;

    public String getPosition() {
        return position;
    }


    public Position(String position) {
        this.position=position;
    }

    @Override
    public String toString() {
        return String.format("%s", position);
    }
}
