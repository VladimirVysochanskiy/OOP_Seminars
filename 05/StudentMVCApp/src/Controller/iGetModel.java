package src.Controller;

import java.util.List;
import src.Model.Student;

public interface iGetModel {
    public List<Student> getAllStudent();
    public void deleteStudent(long studentID);
    public void saveAllStudentToFile();
}