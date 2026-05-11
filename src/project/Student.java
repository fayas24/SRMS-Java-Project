package project;

class Student extends Person {

    private String studentId;
    private String department;
    private double gpa;
    private int year;

    public Student(String name, int age, String studentId, String department, double gpa, int year) {
        super(name, age);
        this.studentId = studentId;
        this.department = department;
        this.gpa = gpa;
        this.year = year;
    }

    //setter and getter
    public void setStudentdId(String studentId) {
        this.studentId = studentId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setgpa(double gpa) {
        if (gpa >= 0 && gpa <= 5) {
            this.gpa = gpa;
        } else {
            System.out.println("Error: GPA must be between 0 and 5.");
        }
    }

    public void setYear(int year) {
        if (year >= 1990 && year <= 2100) {
            this.year = year;
        } else {
            System.out.println("Error: Year must be between 1990 and 2100");
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }

    public double getgpa() {
        return gpa;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nStudent ID: " + studentId + "\nDepartment: " + department + "\nGPA:" + gpa + "\nYear:" + year;
    }
}
