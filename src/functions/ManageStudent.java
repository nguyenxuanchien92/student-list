package functions;

import entities.Student;

public class ManageStudent {
    static int count = 0;
    static int range = 10;
    static Student[] listStudent = new Student[range];


    public Student[] getListStudent() {
        return listStudent;
    }

    public void showInfo() {

        if (this.getListStudent().length < 0) System.out.println("List student is not exist");

        int length = this.getListStudent().length;

        for (Student student : this.getListStudent()) {
            System.out.println(student.toString());
        }
    }

    public Student[] addStudent(Student student) {
        Student[] currentStudents = this.getListStudent();
        Student[] newStudents = new Student[range + 1];

        for (int i = 0; i < range; i++) {
            newStudents[i] = currentStudents[i];
        }
        if(isHasValue(currentStudents)){

        }

        return newStudents;
    }

    private boolean isHasValue(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr.length - 1] == null)
                return true;
        }
        return false;
    }
}
