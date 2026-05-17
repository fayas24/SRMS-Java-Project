package Project;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Student s1 = new Student("Norah", 25, "112233", "IT", 4.4, 2025);
        System.out.println(s1.toString());

        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        
        // FileManager object
FileManager fileManager = new FileManager();

// AutoSaveThread object
AutoSaveThread autoSave;
        autoSave = new AutoSaveThread(manager.getStudents());

autoSave.start();
        
        System.out.print(" HOW MANY STUDENTS DO YOU WANT ADD ?");
        int numOfstudents = scanner.nextInt();
        scanner.nextLine();

        manager.addMultipleStudents(numOfstudents); // to add students
        
        manager.displayStudents();

        System.out.print("Enter the ID of the student to remove: ");
        String removeId = scanner.nextLine();
        manager.removeStudentById(removeId);

        System.out.println("\nAfter removal:");
        manager.displayStudents();

        System.out.print("Enter the ID of the student to update: ");
        String updateId = scanner.nextLine();
        System.out.print("Enter new GPA: ");
        double newGpa = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter new department: ");
        String newDepartment = scanner.nextLine();
        manager.updateStudent(updateId, newGpa, newDepartment);

        System.out.println("\nAfter update:");
        manager.displayStudents();
    }
}