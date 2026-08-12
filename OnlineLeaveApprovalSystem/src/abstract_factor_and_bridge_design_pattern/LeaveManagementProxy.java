package abstract_factor_and_bridge_design_pattern;

public class LeaveManagementProxy implements LeaveSystem{

    private LeaveManagementSystem realLeaveSystem;
    private final String username;
    private final String password;

    public LeaveManagementProxy(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private boolean authenticate(String username, String password) {
        if("Aamir Hussain".equals(username) && "Aamir123".equals(password)) {
            return true;
        }
        else return false;
    }

    @Override
    public void processLeave(String name, String leaveType) {
        if(!authenticate(username, password)) {
            System.out.println("Authentication failed. Leave request cannot be processed.");
            return;
        }

        if(realLeaveSystem == null) {
            realLeaveSystem = LeaveManagementSystem.getInstance();
        }

        realLeaveSystem.processLeave(name, leaveType);
    }
}
