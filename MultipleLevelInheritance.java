class School{
    void room(){
        System.out.println("This is a school");
    }
}
class Teacher extends School{
    void teach(){
        System.out.println("Teacher teaches students in school.");
    }
}
class Student extends Teacher{
    void learn(){
        System.out.println("Student learns from teachers in school.");
    }
}
public class MultipleLevelInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.room();
        s.teach();
        s.learn();
    }
}
