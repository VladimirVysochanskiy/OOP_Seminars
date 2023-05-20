package src.Model;

import java.util.List;

import src.Controller.iGetModel;

public class Model implements iGetModel {
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }
    
    @Override
    public List<Student> getAllStudent()
    {
        return students;
    }

    @Override
    public void deleteStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteStudent'");
    }



}
