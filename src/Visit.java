public class Visit {
    private int visitId;
    private String visitDate;
    private String visitTime;
    private String doctorName;
    private String treatmentDetails;

    public Visit(int visitId, String visitDate, String visitTime, String doctorName, String treatmentDetails) {
        this.visitId = visitId;
        this.visitDate = visitDate;
        this.visitTime = visitTime;
        this.doctorName = doctorName;
        this.treatmentDetails = treatmentDetails;
    }

    public int getVisitId() {
        return visitId;
    }

    public void setVisitId(int visitId) {
        this.visitId = visitId;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getTreatmentDetails() {
        return treatmentDetails;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "visitId=" + visitId +
                ", visitDate='" + visitDate + '\'' +
                ", visitTime='" + visitTime + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", treatmentDetails='" + treatmentDetails + '\'' +
                '}';
    }
}
