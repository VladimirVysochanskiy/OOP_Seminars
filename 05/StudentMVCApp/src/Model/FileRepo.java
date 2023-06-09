package src.Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import src.Controller.iGetModel;

public class FileRepo implements iGetModel {
    private String fileName;
    private List<Student> students;

    public FileRepo(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<>();
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            fw.flush();    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addStudent(Student student)
    {
        this.students.add(student);
    }

    public void readAllStudentsFromFile()
    {
        try
        {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!=null)
            {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Long.parseLong(param[3]));
                students.add(pers);
                line = reader.readLine();
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void saveAllStudentToFile()
    {
        try(FileWriter fw = new FileWriter(fileName, false))
        {
            for(Student pers : students)
            {
                fw.write(pers.getFirstName()+" "+pers.getSecondName()+" "+pers.getAge()+" "+pers.getStudentID());
                fw.append('\n');
            }
            fw.flush();    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> getAllStudent() {
        readAllStudentsFromFile();
        return students;
    }

   
    @Override
    public void deleteStudent(long studentID) {
        int index = -1;
        for (Student stud: students) {
            if (studentID == stud.getStudentID()) {
                index = students.indexOf(stud);
            }
        }
        if (index == -1)
        {
            System.out.println("-----Студент с указанным ID не найден в списке-----");
        } 
        else {students.remove(index);}
    }



    

    
}