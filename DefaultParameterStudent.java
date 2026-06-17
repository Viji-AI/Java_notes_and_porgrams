class Student{
    String name;
    int rollNo;
    int marks;
    Student(){
        name = "Viji";
        rollNo = 1;
        marks = 85;
    }
    void display(){
        System.out.println(name + " " + rollNo + " " + marks);
    }
}
public class DefaultParameterStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.display();
    }
}
