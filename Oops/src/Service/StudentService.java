package Service;

import java.util.ArrayList;
import java.util.List;

import Entity.Student;
import Repository.StudentRepository;

public class StudentService implements StudentRepository {

    List<Student> students=new ArrayList<>();

    @Override
    public Student addStudent(String name,String roll,int marks) {
        
        Student s=new Student(name, roll, marks);
        students.add(s);
        return s;
    }

    @Override
    public List<Student> getStudents() {
        
        return students;
    }
    
}
