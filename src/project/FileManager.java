package Project;

import java.io.*;
import java.util.ArrayList;

public class FileManager {

    // Save students to file
    public void saveStudents(ArrayList<Student> students) {

        try {

            FileWriter writer = new FileWriter("students.txt");

            for (Student student : students) {

                writer.write(
                        student.getStudentId() + "," +
                        student.getName() + "," +
                        student.getGpa() + "," +
                        student.getYear() + "," +
                        student.getDepartment() + "\n"
                );
            }

            writer.close();

            System.out.println("Students saved successfully.");

        }

        catch (IOException e) {

            System.out.println("Error saving students to file.");

        }
    }

    // Load students from file
    public void loadStudents() {

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader("students.txt"));

            String line;

            while ((line = reader.readLine()) != null) {

                System.out.println(line);

            }

            reader.close();

        }

        catch (IOException e) {

            System.out.println("Error reading students file.");

        }
    }
}