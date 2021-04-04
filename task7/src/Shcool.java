import  java.util.Objects;


public class Shcool {
    private String name;
    private Director director;
    private Teacher[] teacher;
    private Student[] student;
}
    public shcool(Director director, int one,int id) {
        Objects.requireNonNull(director, "не может быть null");
        Teacher = new Teacher[one];
        Student = new Student[id];
    }

    public void addTeacher(Teacher teacher){
        Objects.requireNonNull(teacher, "не может быть null");
        for (int i = 0; i < teacher.length; i++) {
            if (teacher[i] == null) {
                teacher[i] = teacher[i];
                return;

    public void addStudent(Student student){
       Objects.requireNonNull(student, "не может быть null");
       for (int i = 0; i < student.length; i++) {
                        if (student[i] == null) {
                            student[i] = student[i];
                            return;