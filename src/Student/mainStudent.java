package Student;

import Student.dao.Impl.StudentDao;
import Student.dao.Impl.StudentImpl;
import Student.domin.Student;

import java.util.List;

public class mainStudent {
    public static void main(String[] args) {
        System.out.println("请登录学生管理系统");
        StudentImpl student = new StudentImpl();
        List<Student> list = student.findAll();
        for (Student s:list) {
            System.out.println(s);
        }
    }
}
