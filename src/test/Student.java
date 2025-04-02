package test;

import java.util.Objects;

/**
 * List of students which have duplicate records find unique students
 */
public class Student {

    private int studentId;

    private String name;

    private String dob;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    Student(String name, String dob, int studentId){
        this.name= name;
        this.dob = name;
        this.studentId = studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;
        if (this.studentId == student.getStudentId())
            return true;

        return super.equals(obj);
    }
}
