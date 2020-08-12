package Student;



import Student.domin.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentImpl implements StudentDao {
    ResultSet rs = null;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ArrayList<Student> list = null;

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public List<Student> findAll() {
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from studentmanage ;";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            list = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                int score = rs.getInt("score");
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
        } catch (SQLException ex) {
            ex.printStackTrace();
        }



   return list; }

    @Override
    public void remove(Integer id) {

    }
}