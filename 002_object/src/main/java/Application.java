import model.Student;
import model.Teacher;

public class Application {

    public static void main(String[] args) {
     Student 李莉 = new Student();
     李莉.name = "李莉";
     李莉.age = 20;
     李莉.sex = "女";
     System.out.println(String.format("我是一名%s生，名字叫%s，我今年%d岁。",李莉.sex,李莉.name,李莉.age));
     李莉.study();
     李莉.rest();

     Student 王其 = new Student();
     王其.name = "王其";
     王其.age = 21;
     王其.sex = "男";

     Teacher 张龙 = new Teacher();
     张龙.name = "张龙";
     Student[] students = new Student[]{李莉, 王其};
     张龙.students = students;

     Student 赵毅 = new Student();
     赵毅.name = "赵毅";
     赵毅.age = 22;
     赵毅.sex = "男";

     张龙.addStudent(赵毅);
     张龙.printStudent();
    }
}
