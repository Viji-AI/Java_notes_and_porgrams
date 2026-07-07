import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

class FailException extends Exception {
    public FailException(String message) {
        super(message);
    }
}
class InvalidTotalMarks extends Exception {
    public InvalidTotalMarks(String message) {
        super(message);
    }
}
public class StudentResultException {
    static void calculateResult(int marks, int sum, double percentage) throws InvalidMarksException, FailException, InvalidTotalMarks {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Invalid marks: " + marks);
        }
        if (sum >= 300) {
            throw new InvalidTotalMarks("Total marks must not exceed limit!!Please Check! " );
        }
        if (marks < 35) {
            throw new FailException("Student has failed with marks: " + marks);
        }
        if (marks == 0) {
            throw new NullPointerException("Marks cannot be zero.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double percentage = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            sum += marks;
            percentage = (double) sum / 300 * 100;

            try {
                calculateResult(marks, sum, percentage);
            } catch (InvalidMarksException e) {
                System.out.println(e.getMessage());
            } catch (FailException e) {
                System.out.println(e.getMessage());
            } catch (InvalidTotalMarks e) {
                System.out.println(e.getMessage());
            } catch (NullPointerException e){
                System.out.println(e.getMessage());
            } catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }

        }
        System.out.println("Total marks so far: " + sum);
        System.out.println("Percentage so far: " + percentage);
    }
}
