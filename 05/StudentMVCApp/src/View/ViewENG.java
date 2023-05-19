package src.View;

import java.util.List;
import java.util.Scanner;

import src.Controller.iGetView;
import src.Model.Student;

public class ViewENG implements iGetView {
    public void printAllStudent(List<Student> students)
    {
        System.out.println("-----Displaying a list of students-----");
        for(Student person :students)
        {
            System.out.println(person);
        }
        System.out.println("-----End of list-----");
    }

    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

}

