package HMS_3;

import java.util.ArrayList;

public class Patient implements Cloneable {
    private Long patientID;
    private String patientName;
    private int age;

    private String insuranceDetails;
    private String roomType;
    private ArrayList<String> allergies;
    private String bloodGroup;
    private Long emergencyContact;
    private String medicalHistory;

    private Patient(Builder builder) {
        this.patientID = builder.patientID;
        this.patientName = builder.patientName;
        this.age = builder.age;
        this.insuranceDetails = builder.insuranceDetails;
        this.roomType = builder.roomType;
        this.allergies = builder.allergies;
        this.bloodGroup = builder.bloodGroup;
        this.emergencyContact = builder.emergencyContact;
        this.medicalHistory = builder.medicalHistory;
    }

    @Override
    public Patient clone() {
        try {
            return (Patient) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static class Builder {
        private final Long patientID;
        private final String patientName;
        private final int age;
        private String insuranceDetails;
        private String roomType;
        private ArrayList<String> allergies;
        private String bloodGroup;
        private Long emergencyContact;
        private String medicalHistory;

        public Builder(Long patientID, String patientName, int age) {
            this.patientID = patientID;
            this.patientName = patientName;
            this.age = age;

        }

        public Builder setInsuranceDetails(String insuranceDetails) {
            this.insuranceDetails = insuranceDetails;
            return this;
        }

        public Builder setRoomType(String roomType) {
            this.roomType = roomType;
            return this;
        }

        public Builder setAllergies(ArrayList<String> allergies) {
            this.allergies = allergies;
            return this;
        }

        public Builder setBloodGroup(String bloodGroup) {
            this.bloodGroup = bloodGroup;
            return this;
        }

        public Builder setEmergencyContact(Long emergencyContact) {
            this.emergencyContact = emergencyContact;
            return this;
        }

        public Builder setMedicalHistory(String medicalHistory) {
            this.medicalHistory = medicalHistory;
            return this;
        }

        public Patient build() {
            return new Patient(this);
        }

    }

    public Long getPatientID() {
        return patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public void setPatientID(Long patientID) {
        this.patientID = patientID;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setInsuranceDetails(String insuranceDetails) {
        this.insuranceDetails = insuranceDetails;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setAllergies(ArrayList<String> allergies) {
        this.allergies = allergies;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setEmergencyContact(Long emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public void print() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Insurance Details: " + insuranceDetails);
        System.out.println("Room Type: " + roomType);
        System.out.println("Allergies: " + allergies);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Emergency Contact: " + emergencyContact);
        System.out.println("Medical History: " + medicalHistory);
    }

}
