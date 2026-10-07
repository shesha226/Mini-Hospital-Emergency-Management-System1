public class Treatment {
    private int treatmentId;
    private int patientId;
    private String treatmentDate;
    private String treatmentType;
    private String DoctorName;
    private String treatmentDescription;


    public Treatment(int treatmentId, int patientId, String treatmentDate, String treatmentType,String DoctorName,
            String treatmentDescription) {
        this.treatmentId = treatmentId;
        this.patientId = patientId;
        this.treatmentDate = treatmentDate;
        this.treatmentType = treatmentType;
        this.DoctorName = DoctorName;
        this.treatmentDescription = treatmentDescription;
    }
    
    public int getTreatmentId() {
        return treatmentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getTreatmentDate() {
        return treatmentDate;
    }
    
    public String getTreatmentType() {
        return treatmentType;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public String getTreatmentDescription() {
        return treatmentDescription;
    }

    @Override 
    public String toString() {
        return "Treatment{" +
                "treatmentId=" + treatmentId +
                ", patientId=" + patientId +
                ", treatmentDate='" + treatmentDate + '\'' +
                ", treatmentType='" + treatmentType + '\'' +
                ", DoctorName='" + DoctorName + '\'' +
                ", treatmentDescription='" + treatmentDescription + '\'' +
                '}';
    }
}
