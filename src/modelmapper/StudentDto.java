package modelmapper;

public class StudentDto {

    private int stuId;
    private int deptId;
    private String name;

    @Override
    public String toString() {
        return "StudentDto{" +
                "stuId=" + stuId +
                ", deptId=" + deptId +
                ", name='" + name + '\'' +
                '}';
    }

    public StudentDto(int stuId, int deptId, String name) {
        this.stuId = stuId;
        this.deptId = deptId;
        this.name = name;
    }

    public StudentDto() {
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
