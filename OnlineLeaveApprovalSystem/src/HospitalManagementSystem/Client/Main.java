package HospitalManagementSystem.Client;

import HospitalManagementSystem.Patient;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient.Builder(2378L, "Naruto", 20)
                .setAllergies(new ArrayList<>(List.of("Dust", "Nut")))
                .setBloodGroup("Z-")
                .setEmergencyContact(1234567890L)
                .setRoomType("Emergency Room")
                .build();
        patient1.print();

        Patient patient2 = patient1.clone();
        patient2.setBloodGroup("C-");
        patient2.setRoomType("Luxury Room");
        patient2.print();


    }



}
