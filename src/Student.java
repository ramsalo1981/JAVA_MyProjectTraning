public class Student extends Person{
    private int Study_Level;
    private String Specialization;
    private Double GPA;

    public Student(){

    }

    public Student(String name, int age, String address, String nationality, int study_Level, String specialization, Double GPA) {
        super(name, age, address, nationality);
        Study_Level = study_Level;
        Specialization = specialization;
        this.GPA = GPA;
    }

    public void setStudy_Level(int study_Level) {
        Study_Level = study_Level;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    public int getStudy_Level() {
        return Study_Level;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public Double getGPA() {
        return GPA;
    }

    /*public String getStudentInfo() {
        return String.format("Student Information:%n" +
                        "Name: %s%n" +
                        "Age: %d%n" +
                        "Address: %s%n" +
                        "Nationality: %s%n" +
                        "Study Level: %d%n" +
                        "Specialization: %s%n" +
                        "GPA: %.2f%n",
                name, age, address, nationality, study_Level, specialization, GPA);
    }*/
    public String getStudentInfo() {
        return String.format("Student Information:%n" +
                        "Name: %s%n" +
                        "Age: %d%n" +
                        "Address: %s%n" +
                        "Nationality: %s%n" +
                        "Study Level: %d%n" +
                        "Specialization: %s%n" +
                        "GPA: %.2f%n",
                super.getName(), super.getAge(), super.getAddress(), super.getNationality(), Study_Level, Specialization, GPA);
    }

}
