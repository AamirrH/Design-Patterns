package HMS_3;

public class Pharmacy extends Department {
    public Pharmacy() {
        super("Pharmacy");
    }

    public void givePrescription(Patient patient) {
        System.out.println(name + ": Generated prescription for " + patient.getPatientName());
    }
}
