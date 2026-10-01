package HMS_2;

import HospitalManagementSystem.Patient;

public class Laboratory extends Department {
    public Laboratory() {
        super("Laboratory");
    }

    public void performTests(Patient patient, String tests) {
        System.out.println(name + ": Performing " + tests + " for " + patient.getPatientName());
    }
}
