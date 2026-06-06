package Asgnpract.Inheritance;

public class INH2_FlightTicket {

    int ticketNo;
    String passengerName;
    String seatClass;  // "Economy", "Business", "First"

    INH2_FlightTicket(int ticketNo, String passengerName, String seatClass) {
        this.ticketNo = ticketNo;
        this.passengerName = passengerName;
        this.seatClass = seatClass;
    }

    double calculateAdditionalCharges() {
        switch (seatClass.toLowerCase()) {
            case "first":    return 5000;
            case "business": return 2000;
            default:         return 500;   // Economy
        }
    }

    void showTicketInfo() {
        System.out.println("---- Flight Ticket ----");
        System.out.println("Ticket No      : " + ticketNo);
        System.out.println("Passenger      : " + passengerName);
        System.out.println("Seat Class     : " + seatClass);
        System.out.println("Extra Charges  : Rs " + calculateAdditionalCharges());
    }

    public static void main(String[] args) {
        INH2_FlightTicket t = new INH2_FlightTicket(201, "Priya", "Business");
        t.showTicketInfo();
    }
}
