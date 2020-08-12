package Student.domin;

public class Student {
    private int id;
    private String name;
    private int score;
    private String gender;
    private String addr;
    private int tel;

    public Student() {
    }

    public Student(int id, String name, int score, String gender, String addr, int tel) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.gender = gender;
        this.addr = addr;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", gender='" + gender + '\'' +
                ", addr='" + addr + '\'' +
                ", tel=" + tel +
                '}';
    }
}
