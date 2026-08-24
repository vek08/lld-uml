public class Employee {
    private String name;
    private Company company;

    public Employee(String name,Company company){
        this.name = name;
        this.company = company;
    }

    public Company getCompany(){
        return company;
    }
}
