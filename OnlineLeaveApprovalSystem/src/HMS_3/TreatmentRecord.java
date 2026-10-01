package HMS_3;

public class TreatmentRecord {
    private final Patient patient;
    private String notes = "";

    public TreatmentRecord(Patient patient) {
        this.patient = patient;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }

    public TreatmentMemento save() {
        return new TreatmentMemento(notes);
    }

    public void restore(TreatmentMemento memento) {
        notes = memento.getNotes();
    }

    public void print() {
        System.out.println(patient.getPatientName() + ": " + notes);
    }
}
