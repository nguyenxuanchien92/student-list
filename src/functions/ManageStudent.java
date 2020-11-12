package functions;

import entities.Student;

public class ManageStudent {
    private static int count = 0;
    static Student[] listStudent = new Student[count + 1];


    public Student[] getListStudent() {
        return listStudent;
    }

    public void showInfo() {

        if (this.getListStudent().length < 0) System.out.println("List student is not exist");

        for (Student student : this.getListStudent()) {
            System.out.println(student.toString());
        }
    }

    public void addStudent(Student student) {
        if (this.getListStudent().length < 0) {
            System.out.println("List student is not exist");
        } else if (this.count == 0) {
            this.getListStudent()[0] = student;
        } else {
            this.getListStudent()[this.count] = student;
        }
        this.count++;
    }
}
