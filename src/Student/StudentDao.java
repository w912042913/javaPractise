package Student;




import Student.domin.Student;

import java.util.List;
public interface StudentDao {
    //查询学生信息
    public List<Student> findAll();

    //  保存某个学生
    public void save(Student student);

    //  删除某个学生
    public void remove(Integer id);

    //  修改某个学生
    public void update(Student student);
}