import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    // Add Student
   public void addStudent(Student student) {

    for (Student s : students) {
        if (s.getId() == student.getId()) {
            System.out.println("Student with this ID already exists!");
            return;
        }
    }

    students.add(student);
    System.out.println("Student added successfully!");
}
    // View All Students
    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Delete Student by ID
    public void deleteStudent(int id) {
        boolean removed = students.removeIf(s -> s.getId() == id);

        if (removed) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Update Student Marks by ID
  // Update Student Marks by ID
public void updateStudentMarks(int id, double newMarks) {

    for (Student s : students) {
        if (s.getId() == id) {
            s.setMarks(newMarks);
            System.out.println("Marks updated successfully!");
            return;
        }
    }

    System.out.println("Student not found.");
}

// Search Student by ID
public void searchStudentById(int id) {

    for (Student s : students) {
        if (s.getId() == id) {
            System.out.println("Student Found:");
            System.out.println(s);
            return;
        }
    }

    System.out.println("Student not found.");
}
}