import java.util.List;

import Entity.Student;
import Service.StudentService;

public class App {
    public static void main(String[] args) throws Exception {
        StudentService studentService=new StudentService();

        studentService.addStudent("abc", "123", 10);
        studentService.addStudent("def", "234", 20);

        
    }
}
