class Teacher {
    void teach(){
        System.out.println("Teacher is teaching...");
    }
}
class MathTeacher extends Teacher {
    void explain(){
        System.out.println("Math teachers are explaining...");
    }   
}
public class TeacherSingleInheritance {
    public static void main(String[] args) {
        MathTeacher t = new MathTeacher();
        t.teach();
        t.explain();
    }
}