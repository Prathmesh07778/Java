package Asgnpract.Inheritance;

public class INH3_Doctor {

    int doctorId;
    String name;
    String specialization;

    INH3_Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    void showConsultationFee() {
        double fee;
        switch (specialization.toLowerCase()) {
            case "cardiologist":  fee = 1500; break;
            case "neurologist":   fee = 1800; break;
            case "dentist":       fee = 700;  break;
            case "dermatologist": fee = 900;  break;
            default:              fee = 500;  break;
        }
        System.out.println("---- Doctor Info ----");
        System.out.println("Doctor ID      : " + doctorId);
        System.out.println("Name           : " + name);
        System.out.println("Specialization : " + specialization);
        System.out.println("Consultation Fee: Rs " + fee);
    }

    public static void main(String[] args) {
        INH3_Doctor doc = new INH3_Doctor(301, "Dr. Mehta", "Cardiologist");
        doc.showConsultationFee();
    }
}
