package HMS_2;

import HospitalManagementSystem.Patient;

public class Reception extends Department {
    public Reception() {
        super("Reception");
    }

    public void register(Patient patient) {
        System.out.println(name + ": Registered " + patient.getPatientName());
    }
}
