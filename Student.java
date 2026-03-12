public class Student {

    private int id;
    private String name;
    private int age;
    private String department;
    private double marks;

    public Student(int id, String name, int age, String department, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Department: " + department +
                ", Marks: " + marks;
    }
}