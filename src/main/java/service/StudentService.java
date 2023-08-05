package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class StudentService {
    public static void main(String... args){
        StudentService ss= new StudentService();
        ss.addStudent();
        ss.getStudents();
    }

    public void addStudent(){
        Student student = new Student();
        List<Student> studentList= new ArrayList<Student>();
        student.setStudentId("001");
        student.setName("name");
        student.setCourse("MCA");
        student.setStartDate("01/08/2023");
        student.setEndDate("08/01/2026");
        studentList.add(student);
    }
    public List<Student> getStudents(){
        return new ArrayList<Student>();
    }
}