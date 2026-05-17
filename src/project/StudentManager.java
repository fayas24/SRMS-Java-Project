package Project;
import java.util.ArrayList;


// to add , delete , update , search in System
public class StudentManager {
    private ArrayList<Student> students; // define ArrayList , concept Composition

    public StudentManager() {
        students = new ArrayList<>(); 
    }
    
    public void addStudent(Student student){
        students.add(student);
    }

    public ArrayList<Student> getStudents(){
        return students;
    }
        // to add students in ArrayList
    public void addStudent() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print(" Write studen name: ");
        String name = scanner.nextLine();

        System.out.print(" Write student ID: ");
        String id = scanner.nextLine();
// to check for equals ID
        for (Student student : students) {
            if (student.getStudentId().equals(id)) {
                System.out.println("Student with ID " + id + " already exist !");
                return;
            }
        }

        System.out.print(" Write student age: ");
        int age = scanner.nextInt();

        System.out.print(" Write student GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print(" Write studen year: ");
        int year = scanner.nextInt();

        scanner.nextLine();

        System.out.print(" Write student department: ");
        String department = scanner.nextLine();

        Student student = new Student(name, age, id, department, gpa, year);
        students.add(student);

        System.out.println(" Student added successfully .... ");
    }
    
    public void addMultipleStudents(int numOfStudents) {
        for (int i = 0; i < numOfStudents; i++) {
            addStudent();
        }
    }

    
// to display students after add
    public void displayStudents() {
        System.out.println("(Display students):");
        for (Student student : students) { // for each
            System.out.println(student); 
        }
    }
// to delete student from system by ID
    public void removeStudentById(String id) {
        boolean found = false;
        for (Student student : students) {
            if (student.getStudentId().equals(id)) {
                students.remove(student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found ! ");
        }
    }

// update information of GPA + DEPARTMENT
    public void updateStudent(String id, double gpa, String department) {
        boolean found = false;
        for (Student student : students) {
            if (student.getStudentId().equals(id)) {
                student.setGpa(gpa);
                student.setDepartment(department);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found ! ");
        }
    }

// search in ArrayList by ID + Name
    public Student searchStudent(String id, String name) {
        for (Student student : students) {
            if (student.getStudentId().equals(id) || student.getName().equals(name)) {
                return student;
            }
        }
        System.out.println("Student with ID " + id + " or name  " + name + " not found !");
        return null;
    }


}