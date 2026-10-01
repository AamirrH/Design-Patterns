package HMS_2;

import HospitalManagementSystem.Patient;

public abstract class PatientTreatment {
    protected final HospitalMediator coordinator;

    protected PatientTreatment(HospitalMediator coordinator) {
        this.coordinator = coordinator;
    }

    public final void start(Patient patient) {
        System.out.println("\n" + getPatientType() + ": " + patient.getPatientName());
        coordinator.handle("Reception", patient);
        coordinator.handle("Doctor Consultation", patient);
        performTests(patient);
        provideTreatment(patient);
        coordinator.handle("Pharmacy", patient);
        processBilling(patient);
    }

    protected abstract String getPatientType();

    protected abstract void performTests(Patient patient);

    protected abstract void provideTreatment(Patient patient);

    protected abstract void processBilling(Patient patient);
}
