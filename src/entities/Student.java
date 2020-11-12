package entities;

public class Student {


    private int id;
    private String name;
    //    private Student[] students = new Student[RANGE];
//    private static int count = 0;
    public static final int RANGE = 100;


    public Student(String name) {
        this.id = getRandomId();
        this.name = name;
    }

    private int getRandomId() {
        return (int) Math.floor(Math.random() * RANGE + 1);
    }

//    public Student[] getStudents() {
//        return students;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

//    public void showInfo() {
//
//        if (this.getStudents().length < 0) System.out.println("List student is not exist");
//
//        for (Student student : this.getStudents()) {
//            System.out.println(student.toString());
//        }
//    }

//    public void addStudent(Student student) {
//        if (this.getStudents().length < 0) System.out.println("List student is not exist");
//
//        if (count == 0) {
//            this.getStudents()[0] = student;
//        } else {
//            this.getStudents()[count] = student;
//        }
//        count++;
//    }
}
