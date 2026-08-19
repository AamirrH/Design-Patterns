package observer_design_patterns;


public interface Subject {

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(LeaveRequest request);


}
