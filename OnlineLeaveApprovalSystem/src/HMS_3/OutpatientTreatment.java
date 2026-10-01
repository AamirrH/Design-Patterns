package HMS_3;

public class OutpatientTreatment extends PatientTreatment {
    public OutpatientTreatment(HospitalMediator coordinator) {
        super(coordinator);
    }

    @Override
    protected String getPatientType() {
        return "Outpatient";
    }

    @Override
    protected void performTests(Patient patient) {
        coordinator.handle("Basic Tests", patient);
    }

    @Override
    protected void provideTreatment(Patient patient) {
        coordinator.handle("Outpatient Treatment", patient);
    }

    @Override
    protected void processBilling(Patient patient) {
        coordinator.handle("Outpatient Bill", patient);
    }
}
