package src.Model;

import java.util.List;

import src.Controller.iGetModel;

public class Model implements iGetModel {
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudent()
    {
        return students;
    }
}
