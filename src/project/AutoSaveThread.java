import java.util.ArrayList;

public class AutoSaveThread extends Thread {

    private ArrayList<Student> students;
    private FileManager fileManager;

    public AutoSaveThread(ArrayList<Student> students) {

        this.students = students;
        this.fileManager = new FileManager();
    }

    @Override
    public void run() {

        while (true) {

            try {

                fileManager.saveStudents(students);

                System.out.println("Auto Save Completed.");

                Thread.sleep(30000);

            }

            catch (InterruptedException e) {

                System.out.println("Thread interrupted.");

            }
        }
    }
}