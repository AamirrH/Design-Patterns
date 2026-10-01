package HMS_3;

public class EmergencyPatientTreatment extends PatientTreatment {
    public EmergencyPatientTreatment(HospitalMediator coordinator) {
        super(coordinator);
    }

    @Override
    protected String getPatientType() {
        return "Emergency Patient";
    }

    @Override
    protected void performTests(Patient patient) {
        coordinator.handle("Emergency Tests", patient);
    }

    @Override
    protected void provideTreatment(Patient patient) {
        coordinator.handle("Emergency Treatment", patient);
    }

    @Override
    protected void processBilling(Patient patient) {
        coordinator.handle("Emergency Bill", patient);
    }
}
