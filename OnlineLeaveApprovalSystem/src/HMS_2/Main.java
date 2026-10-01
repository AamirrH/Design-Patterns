package HMS_2;

import HospitalManagementSystem.Patient;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HospitalMediator coordinator = new HospitalCoordinator();

        Patient outpatient = new Patient.Builder(1001L, "Aarav", 24)
                .setBloodGroup("B+")
                .setMedicalHistory("Fever")
                .build();

        Patient inpatient = new Patient.Builder(1002L, "Meera", 46)
                .setInsuranceDetails("Health Secure")
                .setRoomType("General Ward")
                .setMedicalHistory("Surgery")
                .build();

        Patient emergencyPatient = new Patient.Builder(1003L, "Kabir", 31)
                .setRoomType("Emergency Room")
                .setAllergies(new ArrayList<>(List.of("Penicillin")))
                .setEmergencyContact(9876543210L)
                .build();

        new OutpatientTreatment(coordinator).start(outpatient);
        new InpatientTreatment(coordinator).start(inpatient);
        new EmergencyPatientTreatment(coordinator).start(emergencyPatient);
    }
}
