
import entities.Student;
import functions.ManageStudent;

public class Main {
    public static void main(String[] args) {

        ManageStudent manageStudent = new ManageStudent();
        Student student = new Student("Chien");
        Student student1 = new Student("Hien");
        Student student2 = new Student("Vinh");
        manageStudent.addStudent(student);
        manageStudent.addStudent(student1);
        manageStudent.addStudent(student2);
        manageStudent.showInfo();
    }
}
