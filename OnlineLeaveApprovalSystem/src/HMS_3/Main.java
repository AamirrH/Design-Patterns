package HMS_3;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient.Builder(1001L, "Spector Watson", 65)
                .setBloodGroup("B+")
                .setMedicalHistory("Fever")
                .build();

        Patient followUpPatient = patient.clone();
        followUpPatient.setRoomType("General Ward");
        followUpPatient.setInsuranceDetails("Health Details Have been added.");

        Billing billing = new Billing(new SelfPayBilling(), 1000);

        System.out.println("Billing strategies for a total of 1000:");
        System.out.println("Self-Pay: " + billing.calculateBill());

        // Discount for Insurance Billing is 20%
        billing.setStrategy(new InsuranceBilling());
        System.out.println("Insurance: " + billing.calculateBill());

        // Discount for Corporate Billing is 50%
        billing.setStrategy(new CorporateBilling());
        System.out.println("Corporate: " + billing.calculateBill());

        billing.setStrategy(new SeniorCitizenBilling());
        System.out.println("Senior Citizen: " + billing.calculateBill());

        HospitalCoordinator coordinator = new HospitalCoordinator(billing);

        System.out.println("\nOutpatient visit using Self-Pay:");
        billing.setStrategy(new SelfPayBilling());
        new OutpatientTreatment(coordinator).start(patient);

        System.out.println("\nFollow-up admission using Insurance:");
        billing.setStrategy(new InsuranceBilling());
        billing.setAmount(5000);
        new InpatientTreatment(coordinator).start(followUpPatient);

        System.out.println("\nTreatment notes:");
        TreatmentRecord record = new TreatmentRecord(patient);
        TreatmentHistory history = new TreatmentHistory(record);

        record.setNotes("Patient reported fever.");
        record.print();

        history.save();
        record.setNotes("Blood test requested.");
        record.print();

        history.save();
        record.setNotes("Test results reviewed. Treatment notes updated.");
        record.print();

        System.out.println("\nUndo latest change:");
        history.undo();
        record.print();

        System.out.println("\nUndo previous change:");
        history.undo();
        record.print();

        if (!history.undo()) {
            System.out.println("No previous treatment notes to restore.");
        }
    }
}
