package data.model;

public class Student {
    private String studentId = "Roll : 1  ";
    private String studentName = "A" ;

    private String studentId2 = "Roll : 2  ";
    private String studentName2 = "B" ;

    public Student() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId2() {
        return studentId2;
    }

    public void setStudentId2(String studentId2) {
        this.studentId2 = studentId2;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName2() {
        return studentName2;
    }

    public void setStudentName2(String studentName2) {
        this.studentName2 = studentName2;
    }
}
