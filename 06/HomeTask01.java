// 1) Переписать код в соответствии с Single Responsibility Principle:
// Подсказка: вынесите метод calculateNetSalary() в отдельный класс

public class HomeTask01 {
    public static void main(String[] args) {
               
    }
    
}

public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    public int getBaseSalary() {
        return baseSalary;
    }

}

public class AccountingService {
    
    public int calculateNetSalary(Employee employee) {
        int tax = (int) (employee.getBaseSalary() * 0.25);   // calculate in otherway
        return tax;
    }
}