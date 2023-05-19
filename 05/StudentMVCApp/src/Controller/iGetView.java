package src.Controller;

import java.util.List;
import src.Model.Student;

public interface iGetView {
    void printAllStudent(List<Student> students);
    String prompt(String message);
}