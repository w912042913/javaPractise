package Student.dao.Impl;





import Student.domin.Student;
import Student.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentImpl implements StudentDao {


    @Override
    public List<Student> findAll() {
        Connection conn = null;
        PreparedStatement pstmt =null;
        ResultSet rs= null;
        ArrayList<Student> list= null;
        try {
            conn = JDBCUtils.getConnection();
            String sql ="select * from studentmanage;";
             pstmt = conn.prepareStatement(sql);
             rs = pstmt.executeQuery();
            System.out.println(rs.toString());
             list = new ArrayList<>();
             while (rs.next())
             {

                 int id = rs.getInt("id");
                 String name  = rs.getString(2);
                 int score = rs.getInt(3);
                 String gender = rs.getString(4);
                 String addr = rs.getString("addr");
                 int tel = rs.getInt("tel");
                 Student s = new Student();
                 s.setId(id);
                 s.setName(name);
                 s.setGender(gender);
                s.setScore(score);
                 s.setAddr(addr);
                 s.setTel(tel);
                 list.add(s);
             }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(pstmt, conn, rs);
        }




        return list;
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void deleteStudent(Integer id) {

    }

    @Override
    public void updateStudent(Student student) {

    }


}