package modelmapper;

public class Student {

    private int stuId;
    private int deptId;
    private String name;


    public Student(int stuId, int deptId, String name) {
        this.stuId = stuId;
        this.deptId = deptId;
        this.name = name;
    }

    public Student() {
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
