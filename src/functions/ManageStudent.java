package functions;

import entities.Student;

public class ManageStudent {
    static int count = 0;
    static int range = count +1;
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
//khong cheat duoc xai cach cu thoi chien oi :((
    public void addStudent(Student student) {
        if (this.getListStudent().length < 0) {
            System.out.println("List student is not exist");
        } else if (this.count == 0) {
            this.getListStudent()[0] = student;
        } else {

            int val = this.count;
            this.getListStudent()[this.count] = student;
            this.count++;
        }
        this.count++;
    }
}
