class School {
    void school() {
        System.out.println("This is a School");
    }
}
class Teacher extends School {
    void teach() {
        System.out.println("Teacher teaches");
    }
}
class Student extends School {
    void learn() {
        System.out.println("Student learns");
    }
}
class Staff extends School {
    void work() {
        System.out.println("Staff works");
    }
}
public class HierarchicalInheritance2 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.school();
        t.teach();
        Student s = new Student();
        s.school();
        s.learn();
        Staff st = new Staff();
        st.school();
        st.work();
    }
}