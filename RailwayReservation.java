import java.util.Scanner;
class InvalidTrainException extends Exception {
    InvalidTrainException(String msg) {
        super(msg);
    }
}
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}
class TicketLimitException extends Exception {
    TicketLimitException(String msg) {
        super(msg);
    }
}
class InputMismatchException extends Exception {
    InputMismatchException(String msg) {
        super(msg);
    }
}
class NullPointerException extends Exception {
    NullPointerException(String msg) {
        super(msg);
    }
}
public class RailwayReservation {
    static void validate(String name, int age, int trainNo, int tickets)
            throws InvalidTrainException, InvalidAgeException,TicketLimitException, InputMismatchException,NullPointerException {
        if (trainNo != 12345)
            throw new InvalidTrainException("Invalid Train Number.");
        if (name == null || name.isEmpty())
            throw new NullPointerException("Passenger name cannot be empty.");
        if (age < 5)
            throw new InvalidAgeException("Age should be at least 5.");
        if (tickets > 6)
            throw new TicketLimitException("Maximum 6 tickets allowed.");
        if (tickets <= 0)
            throw new InputMismatchException("Invalid number of tickets.");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Railway Reservation System");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Passenger Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            System.out.print("Enter Train Number: ");
            int trainNo = sc.nextInt();
            System.out.print("Enter Number of Tickets: ");
            int tickets = sc.nextInt();
            validate(name, age, trainNo, tickets);
            System.out.println("\nTicket Booked Successfully!");
        } catch (InvalidTrainException |InvalidAgeException |TicketLimitException |InputMismatchException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}