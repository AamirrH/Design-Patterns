package HMS_2;

import HospitalManagementSystem.Patient;

public class Billing extends Department {
    public Billing() {
        super("Billing");
    }

    public void process(Patient patient, String billType) {
        System.out.println(name + ": Processed " + billType + " for " + patient.getPatientName());
        System.out.println(name + ": Discharged " + patient.getPatientName());
    }
}
