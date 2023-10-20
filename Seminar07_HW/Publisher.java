package Seminar07_HW;

public interface Publisher {

    void sendOffer(String companyName, String position, int salary);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

}
