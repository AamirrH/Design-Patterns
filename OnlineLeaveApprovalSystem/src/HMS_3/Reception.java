package HMS_3;

public class Reception extends Department {
    public Reception() {
        super("Reception");
    }

    public void register(Patient patient) {
        System.out.println(name + ": Registered " + patient.getPatientName());
    }
}
