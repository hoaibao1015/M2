package SS5.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Bao");
        student.setClasses("A0323I1");
        System.out.println("name := "+student.getName());
        System.out.println(" classes := "+student.getClasses());
    }
}
