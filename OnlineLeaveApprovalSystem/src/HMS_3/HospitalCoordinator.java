package HMS_3;

public class HospitalCoordinator implements HospitalMediator {
    private final Reception reception = new Reception();
    private final Doctor doctor = new Doctor();
    private final Laboratory laboratory = new Laboratory();
    private final Pharmacy pharmacy = new Pharmacy();
    private final Billing billing;

    public HospitalCoordinator(Billing billing) {
        this.billing = billing;
    }

    @Override
    public void handle(String action, Patient patient) {
        System.out.println("Coordinator: Sending " + patient.getPatientName() + " to " + action);

        switch (action) {
            case "Reception" -> reception.register(patient);
            case "Doctor Consultation" -> doctor.consult(patient);
            case "Basic Tests" -> laboratory.performTests(patient, "basic tests");
            case "Complete Tests" -> laboratory.performTests(patient, "complete diagnostic tests");
            case "Emergency Tests" -> laboratory.performTests(patient, "emergency tests");
            case "Outpatient Treatment" -> doctor.treat(patient, "outpatient treatment");
            case "Inpatient Treatment" -> doctor.treat(patient, "inpatient treatment");
            case "Emergency Treatment" -> doctor.treat(patient, "emergency treatment");
            case "Pharmacy" -> pharmacy.givePrescription(patient);
            case "Outpatient Bill" -> billing.process(patient, "outpatient bill");
            case "Inpatient Bill" -> billing.process(patient, "room and treatment bill");
            case "Emergency Bill" -> billing.process(patient, "emergency bill");
            default -> System.out.println("Coordinator: Unknown action");
        }
    }
}
