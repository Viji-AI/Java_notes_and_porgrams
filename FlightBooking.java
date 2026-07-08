import java.util.Scanner;
class Flight {
    private String from;
    private String to;
    private String date;
    private String day;
    private String gender;
    private String maritalStatus;
    private String passengerName;
    private int age;
    private String seatPreference;
    private String classPreferred;
    private String paymentPreference;
    Flight() {
        System.out.println("\n******** WELCOME TO FLIGHT BOOKING ********");
    }
    public void getCommonDetails(Scanner sc) {
        sc.nextLine();
        System.out.print("Passenger Name: ");
        passengerName = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Gender: ");
        gender = sc.nextLine();
        System.out.print("Marital Status: ");
        maritalStatus = sc.nextLine();
        System.out.print("From: ");
        from = sc.nextLine();
        System.out.print("To: ");
        to = sc.nextLine();
        System.out.print("Journey Date: ");
        date = sc.nextLine();
        System.out.print("Day: ");
        day = sc.nextLine();
        System.out.print("Seat Preference (Window/Aisle): ");
        seatPreference = sc.nextLine();
        System.out.print("Class (Economy/Business): ");
        classPreferred = sc.nextLine();
        System.out.print("Payment Method (UPI/Card/Cash): ");
        paymentPreference = sc.nextLine();
    }
    public String getPassengerName() {
        return passengerName;
    }
    public String getFrom() {
        return from;
    }
    public String getTo() {
        return to;
    }
    public String getDate() {
        return date;
    }
    public String getDay() {
        return day;
    }
    public String getSeatPreference() {
        return seatPreference;
    }
    public String getClassPreferred() {
        return classPreferred;
    }
    public String getPaymentPreference() {
        return paymentPreference;
    }
    public void displayBooking() {
        System.out.println("\n========= BOOKING CONFIRMED =========");
        System.out.println("Passenger Name : " + getPassengerName());
        System.out.println("Route          : " + getFrom() + " -> " + getTo());
        System.out.println("Date           : " + getDate());
        System.out.println("Day            : " + getDay());
        System.out.println("Seat Preference: " + getSeatPreference());
        System.out.println("Class          : " + getClassPreferred());
        System.out.println("Payment Mode   : " + getPaymentPreference());
    }
}
class DomesticFlight extends Flight {
    protected String destination;
    protected String time;
    DomesticFlight() {
        super();
        System.out.println("\n----- Domestic Flight Booking -----");
    }
    public void getDomesticDetails(Scanner sc) {
        System.out.print("Destination: ");
        destination = sc.nextLine();
        System.out.print("Departure Time: ");
        time = sc.nextLine();
    }
    public void displayBooking() {
        super.displayBooking();
        System.out.println("Destination   : " + destination);
        System.out.println("Departure Time: " + time);
        System.out.println("\n--------- Ticket Details ---------");
        System.out.println("Booking Time : 10:30 AM");
        System.out.println("Flight No    : AI203");
        System.out.println("Seat No      : 18A");
        System.out.println("Class Name   : Economy");
        System.out.println("Duration     : 2 Hours");
        System.out.println("Arrival Time : 12:30 PM");
        System.out.println("Luggage      : 15 Kg");
        System.out.println("Invoice      : Paid Successfully");
    }
}
class InternationalFlight extends Flight {
    private String passportNo;
    private String visa;
    private String nationality;
    private String criminalRecord;
    private String reason;
    private String destinationDetails;
    InternationalFlight() {
        super();
        System.out.println("\n----- International Flight Booking -----");
    }
    public void getInternationalDetails(Scanner sc) {
        System.out.print("Passport Number: ");
        passportNo = sc.nextLine();
        System.out.print("Visa Number: ");
        visa = sc.nextLine();
        System.out.print("Nationality: ");
        nationality = sc.nextLine();
        System.out.print("Any Criminal Record (Yes/No): ");
        criminalRecord = sc.nextLine();
        System.out.print("Reason for Visiting: ");
        reason = sc.nextLine();
        System.out.print("Destination Details: ");
        destinationDetails = sc.nextLine();
    }
    public void displayBooking() {
        super.displayBooking();
        System.out.println("Passport No       : " + passportNo);
        System.out.println("Visa              : " + visa);
        System.out.println("Nationality       : " + nationality);
        System.out.println("Criminal Record   : " + criminalRecord);
        System.out.println("Reason            : " + reason);
        System.out.println("Destination Info  : " + destinationDetails);
        System.out.println("\n--------- Ticket Details ---------");
        System.out.println("Booking Time : 11:15 AM");
        System.out.println("Flight No    : EK501");
        System.out.println("Seat No      : 12C");
        System.out.println("Class Name   : Business");
        System.out.println("Duration     : 8 Hours");
        System.out.println("Departure    : 6:00 AM");
        System.out.println("Arrival      : 2:00 PM");
        System.out.println("Luggage      : 30 Kg");
        System.out.println("Invoice      : Paid Successfully");
    }
}
public class FlightBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Flight Type (Domestic/International): ");
        String type = sc.next();
        if (type.equalsIgnoreCase("Domestic")) {
            DomesticFlight d = new DomesticFlight();
            d.getCommonDetails(sc);
            d.getDomesticDetails(sc);
            d.displayBooking();
        } else if (type.equalsIgnoreCase("International")) {
            InternationalFlight i = new InternationalFlight();
            i.getCommonDetails(sc);
            i.getInternationalDetails(sc);
            i.displayBooking();
        } else {
            System.out.println("Invalid Flight Type.");
        }
    }
}