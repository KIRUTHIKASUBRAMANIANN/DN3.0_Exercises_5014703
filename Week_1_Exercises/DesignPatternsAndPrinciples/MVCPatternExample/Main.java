public class Main {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("John Doe", 1, 85);

        // Create a view
        StudentView view = new StudentView();

        // Create a controller
        StudentController controller = new StudentController(student, view);

        // Update student details
        controller.updateStudentDetails("Jane Smith", 2, 90);

        // Display updated student details
        controller.updateStudentDetails("Jane Smith", 2, 95);
    }
}