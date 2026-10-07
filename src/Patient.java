public class Patient {
    private int patientId;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private int age;
    private String medicalCondition;

    public Patient(int patientId, String name, String address, String phoneNumber, String email, int age, String medicalCondition) {
        this.patientId = patientId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
        this.medicalCondition = medicalCondition;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    @Override 
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", medicalCondition='" + medicalCondition + '\'' +
                '}';
    }

}
