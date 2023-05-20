package src.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import src.Controller.iGetModel;

public class ModelHM implements iGetModel {
    private HashMap<Long,Student> students;

    public ModelHM(HashMap<Long, Student> students) {
        this.students = students;
    }

    @Override
    public List<Student> getAllStudent() {
        List<Student> values = new ArrayList<Student>(students.values());
        return values;
    }

    @Override
    public void deleteStudent(long studentID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteStudent'");
    }

    @Override
    public void saveAllStudentToFile() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAllStudentToFile'");
    }

    
    
}
