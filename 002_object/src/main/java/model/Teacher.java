package model;

public class Teacher {
    public String name;
    public Student[] students;
    public void addStudent(Student student){
        Student[] newStudents = new Student[students.length+1];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        newStudents[students.length] = student;
        students = newStudents;
    }
    public void printStudent(){
        for(Student student: students){
            System.out.println(String.format("%s, %s生, %d岁；", student.name, student.sex, student.age));
        }
    }
}
