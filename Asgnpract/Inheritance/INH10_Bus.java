package Asgnpract.Inheritance;

class Transport {
    String mode;
    int maxSpeed;

    Transport(String mode, int maxSpeed) {
        this.mode = mode;
        this.maxSpeed = maxSpeed;
    }

    void showTransportDetails() {
        System.out.println("Mode      : " + mode);
        System.out.println("Max Speed : " + maxSpeed + " km/h");
    }
}

public class INH10_Bus extends Transport {
    String routeNo;
    int seatCount;

    INH10_Bus(String mode, int maxSpeed, String routeNo, int seatCount) {
        super(mode, maxSpeed);
        this.routeNo = routeNo;
        this.seatCount = seatCount;
    }

    void showRouteDetails() {
        showTransportDetails();
        System.out.println("Route No  : " + routeNo);
        System.out.println("Seats     : " + seatCount);
    }

    public static void main(String[] args) {
        INH10_Bus bus = new INH10_Bus("Road", 80, "Route-42", 50);
        bus.showRouteDetails();
    }
}