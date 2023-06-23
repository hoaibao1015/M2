package SS5.Student;

public class Student {
    private String  name ="John";
    private String  classes ="C02";

    public Student(){

    }

     public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setClasses(String classes) {
        this.classes = classes;
    }

    public String getClasses() {
        return classes;
    }
}
