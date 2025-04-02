package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueStudents {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Anand", "21-Oct-1993", 1));
        studentList.add(new Student("Kushal", "20-Oct-1993", 2));
        studentList.add(new Student("Anand", "21-Oct-1993", 1));
        studentList.add(new Student("Joy", "20-Oct-1993",3));

        Set<Student> unique = new HashSet<>(studentList);
        unique.forEach(s -> {
            System.out.println(s.getStudentId());
        });
    }

    static long getCount(List<Student> studentList, int studentId){
        return studentList.stream().filter(student -> student.getStudentId() == studentId).count() ;
    }


}
