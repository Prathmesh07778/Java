package Asgnpract.Inheritance;

class Event {
    String eventName;
    String location;

    Event(String eventName, String location) {
        this.eventName = eventName;
        this.location = location;
    }

    void showEventInfo() {
        System.out.println("Event Name : " + eventName);
        System.out.println("Location   : " + location);
    }
}

public class INH8_SportsEvent extends Event {
    String sportType;

    INH8_SportsEvent(String eventName, String location, String sportType) {
        super(eventName, location);
        this.sportType = sportType;
    }

    void showFullEventInfo() {
        showEventInfo();
        System.out.println("Sport Type : " + sportType);
    }

    public static void main(String[] args) {
        INH8_SportsEvent se = new INH8_SportsEvent("National Championship", "Mumbai", "Cricket");
        se.showFullEventInfo();
    }
}
