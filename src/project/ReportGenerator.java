package project;

import java.util.ArrayList;

public class ReportGenerator {

    public void generateByGPA(ArrayList<Student> students) {

        System.out.println("Students Report By GPA");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}