import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
System.out.println("2. View All Students");
System.out.println("3. Delete Student");
System.out.println("4. Update Student Marks");
System.out.println("5. Search Student by ID");
System.out.println("6. Exit");
System.out.println("enter choice :");

            int choice = sc.nextInt();


            switch (choice) {

                case 1:
                   System.out.print("Enter ID: ");
int id = sc.nextInt();

if (id <= 0) {
    System.out.println("Invalid ID! Must be positive.");
    break;
}
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
int age = sc.nextInt();

if (age <= 0) {
    System.out.println("Invalid Age!");
    break;
}
                    sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                   System.out.print("Enter Marks: ");
double marks = sc.nextDouble();

if (marks < 0 || marks > 100) {
    System.out.println("Marks must be between 0 and 100!");
    break;
}

                    Student student = new Student(id, name, age, dept, marks);
                    service.addStudent(student);
                    break;

                case 2:
                    service.viewAllStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    service.deleteStudent(deleteId);
                    break;
case 4:
    System.out.print("Enter ID to update: ");
    int updateId = sc.nextInt();

    System.out.print("Enter new marks: ");
    double newMarks = sc.nextDouble();

    service.updateStudentMarks(updateId, newMarks);
    break;

case 5:
    System.out.print("Enter ID to search: ");
    int searchId = sc.nextInt();
    service.searchStudentById(searchId);
    break;

case 6:
    System.out.println("Exiting...");
    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}