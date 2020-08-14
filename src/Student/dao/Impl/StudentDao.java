package Student.dao.Impl;






import Student.domin.Student;

import java.util.List;
public interface StudentDao {
    //查询某个学生信息
    public List<Student> findAll();
    //增加某个学生的信息
    public void addStudent(Student student);
    //删除某个学生的信息
    public void deleteStudent(Integer id);
    //修改某个学生的信息
    public void updateStudent(Student student);
}