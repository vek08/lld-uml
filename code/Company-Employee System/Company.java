
import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Employee> employees;

    public Company(String name){
        this.name = name;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }
}
