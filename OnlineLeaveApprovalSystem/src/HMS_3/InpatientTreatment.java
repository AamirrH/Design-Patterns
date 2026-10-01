package HMS_3;

public class InpatientTreatment extends PatientTreatment {
    public InpatientTreatment(HospitalMediator coordinator) {
        super(coordinator);
    }

    @Override
    protected String getPatientType() {
        return "Inpatient";
    }

    @Override
    protected void performTests(Patient patient) {
        coordinator.handle("Complete Tests", patient);
    }

    @Override
    protected void provideTreatment(Patient patient) {
        coordinator.handle("Inpatient Treatment", patient);
    }

    @Override
    protected void processBilling(Patient patient) {
        coordinator.handle("Inpatient Bill", patient);
    }
}
