package HMS_2;

import HospitalManagementSystem.Patient;

public interface HospitalMediator {
    void handle(String action, Patient patient);
}
