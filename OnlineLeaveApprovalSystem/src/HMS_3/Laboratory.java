package HMS_3;

public class Laboratory extends Department {
    public Laboratory() {
        super("Laboratory");
    }

    public void performTests(Patient patient, String tests) {
        System.out.println(name + ": Performing " + tests + " for " + patient.getPatientName());
    }
}
