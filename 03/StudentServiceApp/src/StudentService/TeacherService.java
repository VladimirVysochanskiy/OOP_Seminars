package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;

public class TeacherService implements iUserService<Teacher> {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, int age, int teacherId, String academicDegree) {
        Teacher per = new Teacher(firstName, secondName, age, teacherId, academicDegree);
        teachers.add(per);

    }
    
}
