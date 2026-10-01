package HMS_2;

import HospitalManagementSystem.Patient;

public class Doctor extends Department {
    public Doctor() {
        super("Doctor");
    }

    public void consult(Patient patient) {
        System.out.println(name + ": Consulting " + patient.getPatientName());
    }

    public void treat(Patient patient, String treatment) {
        System.out.println(name + ": Providing " + treatment + " to " + patient.getPatientName());
    }
}
