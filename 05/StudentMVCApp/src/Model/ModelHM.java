package src.Model;

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
        return (List<Student>) students;
    }
    
}
