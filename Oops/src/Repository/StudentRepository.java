package Repository;

import java.util.List;

import Entity.Student;

public interface StudentRepository {
     
     public Student addStudent(String name, String roll, int marks);

     public List<Student> getStudents();
     
    
}
