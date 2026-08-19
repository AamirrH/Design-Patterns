package observer_design_patterns;


import java.util.ArrayList;
import observer_design_patterns.database.LeaveRequestRepository;

public class LeaveCoordinator implements Subject {

    public ArrayList<Observer> observers = new ArrayList<>();
    private LeaveRequestRepository leaveRequestRepository;

    public LeaveCoordinator() {
    }

    public LeaveCoordinator(LeaveRequestRepository leaveRequestRepository) {
        this.leaveRequestRepository = leaveRequestRepository;
    }

    public void getIncomingLeaveRequest(LeaveRequest leaveRequest) {
        System.out.println("Leave Coordinator received leave request from " + leaveRequest.getApplierName());
    }

    public void approveLeave(LeaveRequest leaveRequest) {
        leaveRequest.setStatus("APPROVED");
        System.out.println("Leave Coordinator changed leave status to " + leaveRequest.getStatus());

        if (leaveRequestRepository != null && leaveRequest.getId() > 0) {
            leaveRequestRepository.updateLeaveStatus(leaveRequest.getId(), leaveRequest.getStatus());
        }

        notifyObservers(leaveRequest);
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }


    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);

    }

    @Override
    public void notifyObservers(LeaveRequest leaveRequest) {
        for (Observer o : observers) {
            o.update(leaveRequest);
        }

    }
}
