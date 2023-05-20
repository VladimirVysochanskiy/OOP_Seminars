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
    public void deleteStudent(long studentID) {
        int index = -1;
        for (Student stud: students) {
            if (studentID == stud.getStudentID()) {
                index = students.indexOf(stud);
            }
            if (index != -1) {students.remove(index);}
        }
    }



}
