public class StudentController {
    private Student student;
    private StudentView view;

    public StudentController(Student student, StudentView view) {
        this.student = student;
        this.view = view;
    }

    public void updateStudentDetails(String name, int id, int grade) {
        student.setName(name);
        student.setId(id);
        student.setGrade(grade);
        view.displayStudentDetails(student);
    }
}