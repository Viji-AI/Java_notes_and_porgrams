import java.util.Scanner;
public class StaticJava {
void displayMessage() {
System.out.println("Welcome to Java Programming With Different Methods!");
}
void addNumbers(int a, int b) {
System.out.println("Sum = " + (a + b));
}
int getNumber() {
return 100;
}
int multiply(int x, int y) {
return x * y;
}
public static void main(String[] args) {
StaticJava obj = new StaticJava();
obj.displayMessage();
obj.addNumbers(10, 20);
int num = obj.getNumber();
System.out.println("Returned Number = " + num);
int result = obj.multiply(5, 6);
System.out.println("Product = " + result);
}
}